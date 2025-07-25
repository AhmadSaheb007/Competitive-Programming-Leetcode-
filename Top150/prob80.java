public class prob80 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int newLength = removeDuplicates(nums);
        System.out.println("New length: " + newLength);
    }

    public static int removeDuplicates(int[] nums) {

        // The approach is to use a two-pointer technique, where one pointer
        // tracks the position of the next unique element and the other pointer
        // iterates through the array.

        // First two elements are always kept, and from the third element onwards,
        // we check if the current element is different from the element two places back.
        // If it is different, we move the current element to the next position in the array.
        // This process continues until we reach the end of the array.


        // If the array has less than or equal to two elements, we don't need 
        // to do anything, reason is that if the array has less than or equal 
        // to two elements, then there is no need to remove duplicates.
        if(nums.length <= 2) {
            return nums.length;
        }

        
        int newArrayIndex = 2; // Initiaslizing newArrayIndex to 2, to start from the third element . . . . . . . . 


        // Start iterating from the third element (index 2)
        // and check if it is different from the element two places back.
        for (int index = 2; index < nums.length; index++) {
            if(nums[index] != nums[newArrayIndex - 2]){
                nums[newArrayIndex] = nums[index];
                newArrayIndex++;
            }

        }

        return newArrayIndex; // The new length of the array with at most two duplicates is stored in newArrayIndex.

    }
}
