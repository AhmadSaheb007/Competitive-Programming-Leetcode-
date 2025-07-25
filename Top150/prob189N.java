import java.util.Arrays;

public class prob189N {
    public static void main(String[] args) {
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
        // rotate(new int[]{-1, 2, 3}, 4);
    }


    public static void rotate(int[] nums, int k) {

        // In this solution, we will go for Revarsal Algorithm. We will reverse the entire array, then reverse the
        // first k elements and finally reverse the remaining elements. To do this, we will reverse the array 3 times.


        // The first time we reverse the entire array, {1, 2, 3 ,4 ,5 ,6, 7} --> {7, 6, 5, 4, 3, 2, 1}
        // the second time we reverse the first k elements, // {7, 6, 5, 4, 3, 2, 1} --> {5, 6, 7, 4, 3, 2, 1}
        // and the third time we reverse the remaining elements. // {5, 6, 7, 4, 3, 2, 1} --> {5, 6, 7, 1, 2, 3, 4}
                
        int arrayLength = nums.length - 1; // We will use this to get the last index of the array . . . . . . .


        // If k is greater than the length of the array, we will mod (k) by the length of the array.
        // It will make the (k) value within the bounds of the array. . . . . . .
        k = k % nums.length;

        reverseArray(nums, 0, arrayLength); // First time, we will reverse the entire array.
        reverseArray(nums, 0, k - 1); // Second time, we will reverse the first k elements.
        reverseArray(nums, k, arrayLength); // Third time, we will reverse the remaining elements.

    }

    // This method will reverse the array from start to end index
    public static void reverseArray(int[] nums, int start, int end){
        // In this method we will use two pointer technique to reverse the array.
        // We will use a temporary variable to swap the elements at the start and end index.
        int temp = 0;
        while (start <= end) {
                temp = nums[start]; // Store the starting index value in a temporary variable.
                nums[start] = nums[end]; // Swap the starting index value to the ending index.
                nums[end] = temp; // Assign the temporary variable value to the ending index.
                start++; // Increment the starting index.
                end--; // Decrement the ending index.
            }
            
    }
    
}
