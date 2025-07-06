package LeetCode.Solve2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class prob215 {

    public static void main(String[] args) {

        System.out.println(findKthLargest(new int[]{1}, 1));

    }

    public static int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);

        int kthLargestCounter = 0;
        int kthLargeNumber = nums[nums.length - 1];

        for(int index = (nums.length - 1); index >= 0; index--){
            if(kthLargeNumber >= nums[index]){
                kthLargeNumber = nums[index];
                kthLargestCounter++;
            }

            if(kthLargestCounter == k){
                return nums[index];
            }
        }
        return 0;
    }
}
