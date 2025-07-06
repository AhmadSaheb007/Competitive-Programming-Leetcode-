package LeetCode.solve5;

import java.util.Arrays;

public class prob912 {

    public static void main(String[] args) {

        int[] arr1 = {1, 0, 8, 2, 5, 3, 6, 9};
       System.out.println(Arrays.toString(sortArray(arr1)));


    }

    public static int[] sortArray(int[] nums) {

        /*
           As per as the condition, it should be solved by the time complexity
           of O(n log n) which means merge sort. in this algorithm we will check
           if the array length is 1 then return the array(Base case). Else we will
           divide the array into 2 equal sub array. Then we will call the sort and
           merge function "sortedAndMergedArray" and in the function we will recursively
           call "sortArray" function. . . . . . . .
        */

        // Checking base case . . . . . . .
        if(nums.length == 1){
            return nums;
        }

        // Checking recursive case . . . . . .
        else{

            // initializing all indexes  . . . . . .
            int firstIndex = 0;
            int lastIndex  = nums.length;

            // defining mid point of the array . . . . . . .
            int midPointOfNums = nums.length / 2;

            // making two sub arrays of equal size . . . . . .
            int[] firstHalfArray = Arrays.copyOfRange(nums, firstIndex, midPointOfNums);
            int[] secondHalfArray = Arrays.copyOfRange(nums, midPointOfNums, lastIndex);

            // Going for a recursive approach . . . . . .
            return sortAndMergeArray(sortArray(firstHalfArray), sortArray(secondHalfArray));

        }



    }

    public static int[] sortAndMergeArray(int[] array1, int[] array2){

        /*
           This is a part of merge sort algorithm where we will take 2 arrays and set
           two pointer. 1st pointer to very first index of array1 and 2nd pointer to
           very first index of  array2. Then we will compare which one between same
           index of array1 and array2 is greater and place that value into a new created
           array named "sortedAndMergedArray" with a length of array1 + array2. then we
           will check if any array still remains or not. if remains then add that array
           part at the last part of new array and return the array . . . . . . .

        */

        // Created a new array . . . . .
        int[] sortedAndMergedArray = new int[array1.length + array2.length];

        // initializing all indexes . . . . . . . .
        int indexOfSortedAndMergedArray = 0;
        int indexOfArray1 = 0;
        int indexOfArray2 = 0;

        // Checking which one between same index of array1 and array2 is greater and placing into new array . . . . .
        while ((indexOfArray1 < array1.length) && (indexOfArray2 < array2.length)){

            if(array1[indexOfArray1] < array2[indexOfArray2]){
                sortedAndMergedArray[indexOfSortedAndMergedArray] = array1[indexOfArray1];
                indexOfArray1++;
            }

            else{
                sortedAndMergedArray[indexOfSortedAndMergedArray] = array2[indexOfArray2];
                indexOfArray2++;
            }
            indexOfSortedAndMergedArray++;

        }

        // if array1 remains then adding remaining elements to new array . . . . . .
        while (indexOfArray1 < array1.length){
            sortedAndMergedArray[indexOfSortedAndMergedArray] = array1[indexOfArray1];
            indexOfArray1++;
            indexOfSortedAndMergedArray++;
        }

        // if array1 remains then adding remaining elements to new array . . . . . .
        while (indexOfArray2 < array2.length){
            sortedAndMergedArray[indexOfSortedAndMergedArray] = array2[indexOfArray2];
            indexOfArray2++;
            indexOfSortedAndMergedArray++;
        }

        return sortedAndMergedArray;
    }
}
