package LeetCode.solve5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class prob287 {

    public static void main(String[] args) {

    }


//    public int findDuplicate(int[] nums) {
//
//        HashMap<Integer, Integer> numberRepetitionHolder = new HashMap<>();
//
//        for(int indexOfNumbers = 0; indexOfNumbers < nums.length; indexOfNumbers++){
//
//            int previousCount;
//            try {
//                previousCount = numberRepetitionHolder.get(nums[indexOfNumbers]);
//            } catch(NullPointerException e) {
//                previousCount = 0;
//            }
//            numberRepetitionHolder.put(nums[indexOfNumbers], previousCount + 1);
//
//        }
//
//        int hashMapIndex = 0;
//
//        for (int numberKey: numberRepetitionHolder.keySet()) {
//
//            if(numberRepetitionHolder.get(numberKey) > 1){
//                return numberKey;
//            }
//
//        }
//
//        return 0;
    public int findDuplicate(int[] nums) {

        /* we will take a hashSet and using a loop we will input array index values
           into the set. If any number is not able to add in the set, that means that
           number is more than one time, and we will return that number. . . . . . . .
        */

        // Created a hashSet . . . . . . .
        HashSet<Integer> uniqueValueHolder = new HashSet<>();

        // Trying to add numbers of nums array . . . . .
        for(int index = 0; index < nums.length; index++){

            if(!uniqueValueHolder.add(nums[index])){
                return nums[index];
            }

        }

        return 0;


    }



//
}

