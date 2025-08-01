package LeetCode.solve4;

import java.util.Arrays;

public class prob905 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3, 1, 2, 4})));

    }

    public static int[] sortArrayByParity(int[] nums) {

        /*
           First we will take a new Array "firstEvenThenOddNumberSortArray".
           Then we will sort the main Array, where Even values will be in
           first then Odd values by using "isEven" function. After that we
           will terminate the program by returning the sorted Array. . . . .
         */

        // Creating a new Array and initialing its very first index(0) . . . . . . . .
        int[] firstEvenThenOddNumberSortArray = new int[nums.length];
        int indexOfSortArray = 0;

        // checking numbers of nums, if they are even or odd . . . . .
        for (int num : nums) {
            if (isEven(num)) {
                firstEvenThenOddNumberSortArray[indexOfSortArray] = num;
                indexOfSortArray++;
            }
        }
        for (int num : nums) {
            if (!isEven(num)) {
                firstEvenThenOddNumberSortArray[indexOfSortArray] = num;
                indexOfSortArray++;
            }
        }
        return firstEvenThenOddNumberSortArray;

    }

    // Function to check is the value even or odd
    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }
}
