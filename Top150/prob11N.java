public class prob11N {
    public static void main(String[] args) {
        
    }


    public static int maxArea(int[] height) {

        // This is a two-pointer approach to solve the Container With Most Water problem.
        // The goal is to find the maximum area of water that can be contained
        // between two vertical lines represented by the height array.

        // We use two pointers, one at the beginning and one at the end of the array.
        // We calculate the area formed by the lines at these two pointers,
        // and then move the pointer pointing to the shorter line inward,
        // hoping to find a taller line that could potentially increase the area.  
        // The process continues until the two pointers meet.

        // Example: height = [1,8,6,2,5,4,8,3,7]
        // Start with left = 0 (height[0] = 1) and right
        // = 8 (height[8] = 7).
        // Area = min(1, 7) * (8 - 0) = 1 * 8 = 8.
        // Move the left pointer to 1 (height[1] = 8).
        // Area = min(8, 7) * (8 - 1) = 7 * 7 = 49.
        // Move the right pointer to 7 (height[7] = 3).
        // Area = min(8, 3) * (7 - 0) = 3 * 7 = 21.
        // Move the left pointer to 2 (height[2] = 6).
        // Area = min(6, 3) * (7 - 2) = 3 * 5 = 15.
        // Continue until the two pointers meet, and the maximum area is 49.

        int left = 0; // Start pointer
        int right = height.length - 1; // End pointer
        int maxArea = 0; // Initialize maxArea to 0

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]); // Find the minimum height between the two pointers
            int width = right - left; // Calculate the width between the two pointers
            int currentArea = minHeight * width; // Calculate the area with the current pointers

            // Update maxArea if the current area is larger
            if(maxArea < currentArea) {
                maxArea = currentArea;
            }

            // Move the pointer pointing to the shorter line inward
            // This is because moving the taller line won't increase the area
            if(height[left] < height[right]) {
                left++;

            }
            else{
                right--;
            }
        }

        return maxArea; // Return the maximum area found
        
    }
}
