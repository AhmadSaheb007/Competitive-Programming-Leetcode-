package LeetCode.Solve2;

import java.util.Arrays;

public class prob189 {

    public static void main(String[] args) {

        int[] r = {1,2,3,4,5,6,7,8,9};
        rotate(r, 3);


//        System.out.println(Arrays.toString(Arrays.stream(nums).toArray()));

    }

    public static void rotate(int[] nums, int k) {

        int[] rotatedArray = new int[nums.length];

        for(int index = 0, positionEnsurer = k - 1; index < k; index++, positionEnsurer--){
            rotatedArray[positionEnsurer] = nums[(nums.length) - (index + 1)];
        }
        for(int index = k, indexOfMainArray = 0; index < nums.length; index++,indexOfMainArray++){
            rotatedArray[index] = nums[indexOfMainArray];
        }

        System.arraycopy(rotatedArray, 0, nums, 0, nums.length);

    }
}
