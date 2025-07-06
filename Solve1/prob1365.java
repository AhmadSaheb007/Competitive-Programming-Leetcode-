package LeetCode.Solve;

import java.util.Arrays;

public class prob1365 {

    public static void main(String[] args) {

        int[] n = {0,0,0,0};

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(n)));

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] smallerNumbersThanCurrentHolder = new int[nums.length];

        for(int index1 = 0; index1 < nums.length; index1++){
            for(int index2 = 0; index2 < nums.length; index2++){
               if(nums[index1] > nums[index2]){
                   smallerNumbersThanCurrentHolder[index1]++;
               }
            }
        }

        return smallerNumbersThanCurrentHolder;
    }

}
