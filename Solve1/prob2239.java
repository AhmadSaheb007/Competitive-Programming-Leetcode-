package LeetCode.Solve;

import java.util.Arrays;

public class prob2239 {

    public static void main(String[] args) {


        int[] n = {2,1,1,-1,100000};
        System.out.println(findClosestNumber(n));

    }

    public static int findClosestNumber(int[] nums) {
        int max =Math.abs(nums[0]) ;
        int originalValueOfMax = 0;
        Arrays.sort(nums);

        for(int number = 0; number < nums.length; number++){
            if(Math.abs(nums[number]) <= max){
                max = Math.abs(nums[number]);
                originalValueOfMax = nums[number];
            }
        }

        return originalValueOfMax;

    }

//    public static boolean isAllNumbersEqual(int[] nums) {
//
//        for(int number = 0; number < nums.length; number++){
//            if(Math.abs(nums[number]) != Math.abs(nums[0])){
//                return false;
//            }
//        }
//        return true;
//    }
}
