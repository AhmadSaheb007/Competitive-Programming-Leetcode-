package LeetCode.solve5;

import java.util.Arrays;

public class prob1051 {

    public static void main(String[] args) {

    }

    public int heightChecker(int[] heights) {

        /*
           First we will copy given array into a new array "sortedHeight" and sort the
           array. After that we will check if the index value of sorted array and index
           value of given array are equal or not. if not equal, then we will count the
           amount of not equal indexes and return the value. . . . .
        */

        // Creating new array and assigning all index values . . . . . .
        int[] sortedHeight = new int[heights.length];
        int startingIndexOfHeights = 0;
        int startingIndexOfSortedHeight = 0;

        // Creating Counting variable . . . . . .
        int countOfNotEqualIndexValue = 0;

        // Coping to new array and sorting the new array . . . . . .
        System.arraycopy(heights, startingIndexOfHeights,
                         sortedHeight, startingIndexOfSortedHeight, heights.length);

        Arrays.sort(sortedHeight);

        // Checking and counting not equal index values . . . . . . . .
        for(int indexOfHeights = 0; indexOfHeights < heights.length; indexOfHeights++){
            if(heights[indexOfHeights] != sortedHeight[indexOfHeights]){
                countOfNotEqualIndexValue++;
            }
        }
        return countOfNotEqualIndexValue;
    }
}
