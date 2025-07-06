package LeetCode.Solve3;

import java.util.Arrays;
import java.util.Collections;

public class prob189 {

    public static void main(String[] args) {

        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);


    }

    public static void rotate(int[] nums, int k) {

        int[] rotatedArray = new int[nums.length];
        int rotationRange = k;
        int arraySize = nums.length;

        for (int index = 0; index < rotatedArray.length; index++) {
            rotatedArray[(index + rotationRange) % (arraySize)] = nums[index];
        }
        int startingPointOfSourceArray = 0;
        int startingPointOfTargetArray = 0;

        System.arraycopy(rotatedArray, startingPointOfSourceArray, nums, startingPointOfTargetArray, arraySize);

    }
}