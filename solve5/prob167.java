package LeetCode.solve5;

import java.util.Arrays;

public class prob167 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));

    }

    public static int[] twoSum(int[] numbers, int target) {

        /*
          Binary Search is the base approach for this problem. Here lowerIndex = 0 and
          upperIndex = (array length - 1). while (lowerIndex < upperIndex), Everytime,
          we will check if((numbers[lowerIndex] + numbers[upperIndex]) == target)), then
          return the index+1 values in an array form. Else sum of index values < target,
          then upperIndex-- either lowerIndex++;
        */

        // Declaring indexHolder array . . . . .
        int[] indexHolder = new int[2];

        // Initializing all necessary indexes . . . . .
        int lowerIndex = 0;
        int upperIndex = numbers.length - 1;
        int firstIndex = 0;
        int secondIndex = 1;

        // Loop for checking all conditions . . . . . .
        while (lowerIndex < upperIndex){

            // index finding if statement . . . . .
            if((numbers[lowerIndex] + numbers[upperIndex]) == target){
                indexHolder[firstIndex] = lowerIndex + 1;
                indexHolder[secondIndex] = upperIndex + 1;
                break;
            }

            // upperIndex decrementing statement . . . . . .
            else if((numbers[lowerIndex] + numbers[upperIndex]) > target){
                upperIndex--;

            }

            // upperIndex increment statement . . . . . .
            else{
                lowerIndex++;
            }

        }
        return indexHolder;
    }
}
