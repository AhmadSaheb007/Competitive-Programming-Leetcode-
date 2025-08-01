package LeetCode.solve4;

import java.util.ArrayList;
import java.util.HashMap;

public class prob260 {

    public static void main(String[] args) {

    }

    public int[] singleNumber(int[] nums) {

        /*
           First we will take a HashMap "numberRepetitionHolder" to count
           repetition of every element and store count in terms of each word.
           Then, we will store numbers which count is equal to (1) that stored
           as keys in HashMap, into a ArrayList "exactOnceArrayList" and Then
           convert this ArrayList into Array "exactOnceArray" as per as the returning condition . . . . . . .
         */

        // Created a HashMap to store repetition in terms of each word . . . . . .
        HashMap<Integer, Integer> numberRepetitionHolder = new HashMap<>();

        for(int indexOfNumbers = 0; indexOfNumbers < nums.length; indexOfNumbers++){

            int previousCount;
            try {
                previousCount = numberRepetitionHolder.get(nums[indexOfNumbers]);
            } catch(NullPointerException e) {
                previousCount = 0;
            }
            numberRepetitionHolder.put(nums[indexOfNumbers], previousCount + 1);
        }

        // Checking if repetition is equal to (1) . . . . .
        // If equal, then storing values which stored as key into a ArrayList . . . . .
        ArrayList<Integer> exactOnceArrayList = new ArrayList<>();

        for(int numberRepetitionHolderKey : numberRepetitionHolder.keySet()){

            if((numberRepetitionHolder.get(numberRepetitionHolderKey) == 1)){
                exactOnceArrayList.add(numberRepetitionHolderKey);
            }
        }

        // Converting into Array to satisfy returning condition . . . . . .
        int[] exactOnceArray = new int[exactOnceArrayList.size()];

        for(int index = 0; index < exactOnceArray.length; index++){
            exactOnceArray[index] = exactOnceArrayList.get(index);
        }

        return exactOnceArray;
    }


}
