package LeetCode.solve5;

public class prob2221 {

    public static void main(String[] args) {

        System.out.println(triangularSum(new int[]{1, 2, 3, 4, 5}));

    }

    public static int triangularSum(int[] nums) {

        /*
           We will solve this problem by a recursive approach.
           Base case: if arrayLength == 1, will return the index value.
           Recursive case: create a new array having the size of num's
           length - 1. Then, in each index of newly created array, we
           will insert ((nums[index] + nums[index + 1]) and recursively
           call the current function . . . . . . . .
         */

        int veryFirstIndex = 0;

        // Creating a new array . . . . . . .
        int[] addedValueArray = new int[nums.length -1];

        // Base case: Checking the array length . . . . .
        if(nums.length == 1){
            return nums[veryFirstIndex];
        }

        // Recursive case : going for a loop with the condition of index < nums.length - 1
        // because we are adding index and index + 1 value . . . .
        else {

            for(int index = 0; index < nums.length - 1; index++){

                // if number > 10, we take the mod value of number . . . .
                if(nums[index] + nums[index + 1] < 10){

                    addedValueArray[index] = nums[index] + nums[index + 1];

                }
                else{

                    addedValueArray[index] = (nums[index] + nums[index + 1]) % 10;

                }

            }

            return triangularSum(addedValueArray);

        }

    }
}
