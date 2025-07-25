import java.util.Arrays;

public class prob209 {
    public static void main(String[] args) {

        int[] nums = {12,28,83,4,25,26,25,2,25,25,25,12};
        int target = 213;
        System.out.println(minSubArrayLen(target, nums));
    }


    public static int minSubArrayLen(int target, int[] nums) {

        // This is a sliding window (two-pointer) approach to solve the 
        // Minimum Size Subarray Sum problem. The goal is to find the 
        // smallest length of a contiguous subarray such that the sum 
        // of its elements is greater than or equal to the given target.

        // Since all elements are positive, we can safely use a sliding window.
        // We expand the window by moving the right pointer to include more elements,
        // and once the sum becomes greater than or equal to the target, 
        // we try to shrink the window from the left to find the minimal length.

        // We maintain a variable `currentSum` to track the sum of the current window,
        // and `minLen` to store the minimum window size found so far.

        // Example: nums = [2, 3, 1, 2, 4, 3], target = 7
        // Window expands: [2, 3, 1, 2] → sum = 8 (>= 7), window length = 4
        // Try shrinking: remove 2 → [3, 1, 2] → sum = 6 (too small)
        // Continue expanding: [3, 1, 2, 4] → sum = 10
        // Shrink again to get [4, 3] → sum = 7, window length = 2 (best) . . . . .

        int left = 0; // Start of the window . . . . .
        int right = 0; // End of the window . . . . .
        int currentSum = 0; // Current sum of the window . . . . .
        int minLen = Integer.MAX_VALUE; // Initialize minLen to a large value . . . . .

        // Iterate through the array with the right pointer
        // and adjust the left pointer to find the minimum length subarray . . . . . .
        for (right = 0; right < nums.length; right++) {
            currentSum = currentSum + nums[right];
            while (currentSum >= target) {
                minLen = Math.min(minLen, (right - left) + 1);
                currentSum = currentSum - nums[left];
                left++;
            }
        }

        // If minLen was updated, return it; otherwise, return 0 . . . . . .
        // This indicates that no valid subarray was found . . . . . .
        if(minLen == Integer.MAX_VALUE) {
            return 0;
        }
        return minLen;

    }
}
