package LeetCode.solve4;

import java.util.HashMap;
import java.util.HashSet;

public class prob2367 {

    public static void main(String[] args) {

        System.out.println(arithmeticTriplets(new int[]{0, 1, 4, 6, 7, 10}, 3));

    }

    public static int arithmeticTriplets(int[] nums, int diff) {

        /*
           First we will convert the Array into a Set "numsInSet" for time
           complexity then we will check if the (each element - given difference)
           and (each element - 2*given difference) both available in HashSet as
           per as condition. If available we will count number of triplet sets as
           well as return the count.
         */

        // Creating HashSet and converting Array into a HashSet
        HashSet<Integer> numsInSet = new HashSet<>();

        for (int num : nums) {
            numsInSet.add(num);
        }

        // Counting valid triplets from this HashSet . . . . .
        int countValidTriplets = 0;

        for (int num : numsInSet){
            if((numsInSet.contains(num - diff)) &&
               (numsInSet.contains(num - 2 *diff))){
                countValidTriplets++;
            }
        }
        return countValidTriplets;
    }
}

//
//    HashMap<Integer, Integer> counterValidDifference = new HashMap<>();
//
//        for(int indexOfFirstDigit = 0; indexOfFirstDigit < nums.length; indexOfFirstDigit++){
//        for(int indexOfSecondDigit = 0; indexOfSecondDigit < nums.length; indexOfSecondDigit++){
//
//        if(((nums[indexOfFirstDigit] - nums[indexOfSecondDigit]) == 3) &&
//        !counterValidDifference.containsValue(nums[indexOfFirstDigit] * nums[indexOfSecondDigit])){
//        counterValidDifference.put(nums[indexOfFirstDigit], nums[indexOfFirstDigit] * nums[indexOfSecondDigit]);
//        }
//
//        }
//        }
//        return counterValidDifference.size();
