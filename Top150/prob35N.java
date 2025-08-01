public class prob35N {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(nums, target)); // Output: 2
        

    }

    public static int searchInsert(int[] nums, int target) {

        // This function finds the index at which the target should be inserted in a sorted array.
        // If the target is found, it returns the index of the target.
        // If the target is not found, it returns the index where it can be inserted to maintain sorted order.
        // As the array is in sorted order, we will go for a binary search approach. 
        // Time complexity is O(log n) and space complexity is O(1).

        //Example:
        // Input: nums = [1,3,5,6], target = 5
        // Output: 2
        // First, we check the middle element of the array.
        // If it is equal to the target, we return the index.
        // If it is less than the target, we move to the right half of the array.
        // If it is greater than the target, we move to the left half of the array.
        // We repeat this process until we find the target or determine the index where it should be inserted.
        // In this case, the target 2 is not present in the array, so we return 2, which is the index where it should be inserted to maintain sorted order.

        

        int leftIndex = 0; // Initialize left index to the start of the array
        int rightIndex = nums.length - 1; // Initialize right index to the end of the array


        // Binary search loop
        // Continue until the left index is less than or equal to the right index
        while(leftIndex <= rightIndex){
            int midIndex = (leftIndex + rightIndex) /2; // Calculate the middle index

            // Check if the middle element is equal to the target, if so, return the index
            if(nums[midIndex] == target){
                return midIndex;
            }

            // If the middle element is less than the target, move the left index to midIndex + 1
            else if (nums[midIndex] < target) {
                leftIndex = midIndex + 1;
            }

            // If the middle element is greater than the target, move the right index to midIndex - 1
            else if (nums[midIndex] > target) {
                rightIndex = midIndex - 1;
            }
        }

        return leftIndex; // If the target is not found, return the left index, which is the position where the target should be inserted

    }
    
}
