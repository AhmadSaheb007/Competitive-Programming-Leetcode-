package LeetCode.solve4;

import java.util.*;

public class prob229 {

    public static void main(String[] args) {

        System.out.println(majorityElement(new int[]{1, 2}));

    }

    public static List<Integer> majorityElement(int[] nums){

        /*
           First in a hashmap "numberRepetitionHolder" we will store the repetition
           of each element. After that, we will check if the number appears more than
           nums.length/3 times and add into a list named "majorElements" and return
           the list . . . . . . . . .
        */

        // crating a Hashmap . . . . . . .
        HashMap<Integer, Integer> numberRepetitionHolder = new HashMap<>();

        // counting the frequency of each number . . . . . . .
        for(int index = 0; index < nums.length; index++){

            int previousCount;
            try {
                previousCount = numberRepetitionHolder.get(nums[index]);
            } catch (NullPointerException e) {
                previousCount = 0;
            }
            numberRepetitionHolder.put(nums[index], previousCount + 1);

        }

        // Creating a list . . . . . . . .

        List<Integer> majorElements = new ArrayList<>();

        // adding numbers with appears more than nums.length/3 times . . . . . .
        for (int mapKey : numberRepetitionHolder.keySet()) {
            if(numberRepetitionHolder.get(mapKey) > (nums.length / 3)){
                majorElements.add(mapKey);
            }
        }

        return majorElements;

    }

//    public static List<Integer> majorityElement(int[] nums){
//        int majorElement = nums[0];
//        int majorityCounter = 0;
//        LinkedList<Integer> maxRepetitionElementList = new LinkedList<>();
//
//        for(int index = 0; index < nums.length; index++){
//            if(nums[index] == majorElement){
//                majorityCounter++;
//            }
//            else {
//                majorityCounter--;
//            }
//            if(majorityCounter > (nums.length / 3)){
//                maxRepetitionElementList.add(nums[index]);
//            }
//            if(majorityCounter == 0){
//                majorElement = nums[index];
//                majorityCounter = 1;
//            }
//        }
//        return maxRepetitionElementList;
//    }

//    public static List<Integer> majorityElement(int[] nums) {
//
//        HashMap<Integer, Integer> mapRepetitionEachElement = new HashMap<>();
//        HashSet<Integer> holdUniqueIntegers = new HashSet<>();
//
//        for(int indexOfNums = 0; indexOfNums < nums.length; indexOfNums++){
//
//            int previousCount;
//            try {
//                previousCount = mapRepetitionEachElement.get(nums[indexOfNums]);
//            } catch(NullPointerException e) {
//                previousCount = 0;
//            }
//            mapRepetitionEachElement.put(nums[indexOfNums], previousCount + 1);
//            holdUniqueIntegers.add(nums[indexOfNums]);
//
//
//        }
//
//        int[] holdUniqueIntegerArray = new int[holdUniqueIntegers.size()];
//        int arrayIndex = 0;
//
//        for(int numberOfArray : holdUniqueIntegers){
//            holdUniqueIntegerArray[arrayIndex] = numberOfArray;
//            arrayIndex++;
//        }
//
//        int firstIndexValue = 0;
//        // Checking if the all letters repeated equally . . . . . .
//        Integer maxRepetition = holdUniqueIntegerArray[firstIndexValue];
//        LinkedList<Integer> maxRepetitionElementList = new LinkedList<>();
//
//        for(int numberRepetitionHolderKey : holdUniqueIntegerArray){
//
//            if(((mapRepetitionEachElement.get(numberRepetitionHolderKey) >= maxRepetition)) &&
//                (mapRepetitionEachElement.get(numberRepetitionHolderKey) > (nums.length / 3))){
//                maxRepetitionElementList.add(numberRepetitionHolderKey)  ;
//            }
//        }
//        //LinkedList<Integer> maxRepetitionElementList = new LinkedList<>();
//        //maxRepetitionElementList.add(maxRepetition);
//
//
//        return maxRepetitionElementList;
//    }
}
