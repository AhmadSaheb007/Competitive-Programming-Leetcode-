package LeetCode.solve5;

import java.util.Arrays;

public class prob977 {

    public static void main(String[] args) {

    }


    public int[] sortedSquares(int[] nums) {

        /*
           First we will square all digits of nums array,
           Then return the array by sorting nums . . . . . .
        */

        for(int indexOfNums = 0; indexOfNums < nums.length; indexOfNums++){
            nums[indexOfNums] = (int) Math.pow(nums[indexOfNums], 2);
        }

        Arrays.sort(nums);

        return nums;

    }
}
