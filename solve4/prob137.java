package LeetCode.solve4;

import java.util.HashMap;

public class prob137 {

    public static void main(String[] args) {

        System.out.println(singleNumber(new int[]{-2,-2,1,1,4,1,4,4,-4,-2}));

    }

    public static int singleNumber(int[] nums) {

        /*
           First we will take a HashMap "numberRepetitionHolder" to count
           repetition of every element and store count in terms of each word.
           Then, we will this count is equal to (1) and return that number
           stored as key in HashMap . . . . . . .
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
        // If equal, then return that number stored as key . . . . .
        for(int numberRepetitionHolderKey : numberRepetitionHolder.keySet()){
            if((numberRepetitionHolder.get(numberRepetitionHolderKey) == 1)){
                return numberRepetitionHolderKey;
            }
        }
        return 0;
    }
}
