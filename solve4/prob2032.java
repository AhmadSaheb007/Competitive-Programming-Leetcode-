package LeetCode.solve4;

import java.util.*;

public class prob2032 {

    public static void main(String[] args) {

        System.out.println(twoOutOfThree(new int[]{1, 3, 3},
                                         new int[]{2, 5, 6},
                                         new int[]{3, 9, 7}));

    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        /*
          First we will convert all arrays into a HashSets to remove repeated numbers of
          each array. Then convert all HashSet into a ArrayList to get particular index
          value. After that, we will map the repetition of each numbers of each ArrayList
          in a HashMap "numberRepetitionHolder". After that, we will check which numbers
          repeated more than or 2 times and add them into a LinkedList and terminate the
          program by returning the LinkedList . . . . . . . . . .
        */

        // Creating HashSets and converting all arrays into HashSets . . . . . . .
        HashSet<Integer> nums1Set = toHashSet(nums1);
        HashSet<Integer> nums2Set = toHashSet(nums2);
        HashSet<Integer> nums3Set = toHashSet(nums3);

        // Creating ArrayList and converting all HashSet into ArrayList . . . . . . .
        ArrayList<Integer> nums1SetList = new ArrayList<>(nums1Set);
        ArrayList<Integer> nums2SetList = new ArrayList<>(nums2Set);
        ArrayList<Integer> nums3SetList = new ArrayList<>(nums3Set);

        // Creating HashMap to store number repetition . . . . . . .
        HashMap<Integer, Integer> numberRepetitionHolder = new HashMap<>();

        // Checking 1st number ArrayList . . . . . . .
        for(int indexOfNum1SetList = 0; indexOfNum1SetList < nums1SetList.size(); indexOfNum1SetList++){

            int previousCount = removePreviousCountCatch(numberRepetitionHolder, nums1SetList, indexOfNum1SetList);
            numberRepetitionHolder.put(nums1SetList.get(indexOfNum1SetList), previousCount + 1);

        }

        // Checking 2nd number ArrayList . . . . . . .
        for(int indexOfNum2SetList = 0; indexOfNum2SetList < nums2SetList.size(); indexOfNum2SetList++){

            int previousCount = removePreviousCountCatch(numberRepetitionHolder, nums2SetList, indexOfNum2SetList);
            numberRepetitionHolder.put(nums2SetList.get(indexOfNum2SetList), previousCount + 1);

        }

        // Checking 3rd number ArrayList . . . . . . .
        for(int indexOfNum3SetList = 0; indexOfNum3SetList < nums3SetList.size(); indexOfNum3SetList++){

            int previousCount =  removePreviousCountCatch(numberRepetitionHolder, nums3SetList, indexOfNum3SetList);
            numberRepetitionHolder.put(nums3SetList.get(indexOfNum3SetList), previousCount + 1);

        }

        // Creating a LinkedList . . . . . . . .
        LinkedList<Integer> commonValueInTwoOutOfThreeList = new LinkedList<>();

        // Checking if Value(Repetition) of each key(Number) is greater than or equal to two or not
        for(Map.Entry<Integer, Integer> set : numberRepetitionHolder.entrySet()){

            if (set.getValue() >= 2){
                commonValueInTwoOutOfThreeList.add(set.getKey());
            }

        }

        return commonValueInTwoOutOfThreeList;
    }

    // Array to HashSet converter . . . . . . . .
    public static HashSet<Integer> toHashSet(int[] numberArray){

        HashSet<Integer> numberSet = new HashSet<>();

        for (int number : numberArray) {
            numberSet.add(number);
        }

        return numberSet;
    }

    // HashMap previous count catch handler . . . . . .
    public static int removePreviousCountCatch(HashMap<Integer, Integer> numberRepetitionHolder,
                                               ArrayList<Integer> numberArrayList, int indexOfArrayList){
        int previousCount;
        try {
            previousCount = numberRepetitionHolder.get(numberArrayList.get(indexOfArrayList));
        } catch(NullPointerException e) {
            previousCount = 0;
        }

        return previousCount;
    }
}
