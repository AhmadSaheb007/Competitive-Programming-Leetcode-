package LeetCode.Solve2;

import java.util.Arrays;

public class prob2154 {

    public static void main(String[] args) {

    }

    public int findFinalValue(int[] nums, int original) {

        Arrays.sort(nums);

        for(int index = 0; index < nums.length; index++){

            int key = nums[index];
            if(nums[Arrays.binarySearch(nums,key)] == original){
                original = 2 * original;
            }

        }

        return original;

    }
}
