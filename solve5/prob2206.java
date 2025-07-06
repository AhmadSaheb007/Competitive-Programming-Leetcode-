package LeetCode.solve5;

import java.util.HashMap;

public class prob2206 {

    public static void main(String[] args) {

    }

    public boolean divideArray(int[] nums) {

        /*
           We can divide an array into two equal arrays iff all elements can be distributed
           equally. That mens if we check, if all elements are in an even number of amount in
           the given array, then it can be equally divisible array. So, we will take a hashmap
           "eachNumberRepetitionMap" to map each numbers repetition with respect to that number.
           Then check if all elements are in equal amount or not and return the boolean value. . . . . . . .
        */

        // Creating a HashMap . . . . . . . .
        HashMap<Integer, Integer> eachNumberRepetitionMap = new HashMap<>();

        // Counting number repetition and storing into the HashMap . . . . . .
        for(int indexOfNums = 0; indexOfNums < nums.length; indexOfNums++){

            int previousCount;
            try {
                previousCount = eachNumberRepetitionMap.get(nums[indexOfNums]);
            } catch(NullPointerException e) {
                previousCount = 0;
            }

            eachNumberRepetitionMap.put(nums[indexOfNums], previousCount + 1);
        }

        // Checking if all repetition are even or not . . . . . .
        for (int keyOfMap: eachNumberRepetitionMap.keySet()) {
            if(eachNumberRepetitionMap.get(keyOfMap) % 2 != 0){
                return false;
            }
        }

        return true;

    }
}
