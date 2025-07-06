package LeetCode.Solve2;

import java.util.Arrays;

public class prob1470 {

    public static void main(String[] args) {

        int[] n = {1,1,2,2};

        System.out.println(Arrays.toString(shuffle(n, 2)));

    }

    public static int[] shuffle(int[] nums, int n) {

        int[] shuffledArray = new int[nums.length];
        int count = 0;

        for(int index1 = 0, index2 = 0; index1 < nums.length; index1++){
            if(index1 % 2 == 0){
                shuffledArray[index2] = nums[index1];
                index2++;
            }
            else{
                shuffledArray[(nums.length/2) + count] = nums[index1];
                count++;

                if(((nums.length/2) + count) >=nums.length){
                    break;
                }
            }
        }

        return shuffledArray;

    }



//    public static int[] shuffle(int[] nums, int n) {
//
//        int[] shuffledArray = new int[nums.length];
//
//        for(int index1 = 0, index2 = 0; index1 < nums.length; index1++){
//            if(index1 % 2 == 0){
//                shuffledArray[index2] = nums[index1];
//            }
//            else{
//                shuffledArray[index2] = nums[n + index1];
//            }
//            index2++;
//        }
//
//        return shuffledArray;
//
//    }
}
