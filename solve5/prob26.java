package LeetCode.solve5;

import java.util.Arrays;
import java.util.HashSet;

public class prob26 {


    public static void main(String[] args) {

    }


    public int removeDuplicates(int[] nums) {

        /*
            First in a hashSet "uniqueElements" we will store unique elements.
            Then using a "helpingArray" we will convert the set into an array
            in order to sort all unique elements. After that, we will replace
            all elements of nums array ny helpingArray and will fill rest of
            the elements by 0 as per as condition, also return the size of Hashset . . . . .
        */

        // Creating a HashSet . . . . .  .
        HashSet<Integer> uniqueElements = new HashSet<>();

        // Storing all unique elements . . . . . .
        for(int number : nums){
            uniqueElements.add(number);
        }

        // Creating helpingArray . . . . . . .
        int helpingIndex = 0;
        int[] helpingArray = new int[uniqueElements.size()];

        // Converting HashSet into Array . . . . . .
        for (int number : uniqueElements) {

            helpingArray[helpingIndex] = number;
            helpingIndex++;

        }

        // Sorting the helpingArray . . . . .
        Arrays.sort(helpingArray);

        // Replacing all values of nums by helpingArray . . . . .
        int index = 0;
        for (int number : helpingArray) {

            nums[index] = number;
            index++;

        }

        // Filling rest of the arrays by 0 . . . . .
        while (index < nums.length){

            nums[index] = 0;
            index++;

        }
        return uniqueElements.size();
    }

}
