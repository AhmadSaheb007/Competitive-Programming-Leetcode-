package LeetCode.solve5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class prob350 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 3, 3}, new int[]{3, 2, 1})));

    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> intersectedElements = new ArrayList<>();

        int indexOfNums1 = 0;
        int indexOfNums2 = 0;

        while (true){

            if((indexOfNums1 >= nums1.length) || ((indexOfNums2 >= nums2.length))){
                break;
            }

            else if(nums1[indexOfNums1] == nums2[indexOfNums2]){
                intersectedElements.add(nums1[indexOfNums1]);
                indexOfNums1++;
                indexOfNums2++;
            }

            else if(nums1[indexOfNums1] > nums2[indexOfNums2]){
                indexOfNums2++;
            }
            else if(nums1[indexOfNums1] < nums2[indexOfNums2]){
                indexOfNums1++;
            }
            else{
                //void for now . . . . .
            }

        }
        int[] intersectedArray = new int[intersectedElements.size()];
        for(int indexOfArrayList = 0; indexOfArrayList < intersectedElements.size(); indexOfArrayList++){

            intersectedArray[indexOfArrayList] = intersectedElements.get(indexOfArrayList);
        }

        return intersectedArray;

    }

//    public static int[] intersect(int[] nums1, int[] nums2) {
//
//        HashSet<Integer> nums1Set = arrayToSet(nums1);
//        HashSet<Integer> nums2Set = arrayToSet(nums2);
//
//        HashMap<Integer, Integer> numberFrequencyHolder = new HashMap<>();
//
//        for (int number : nums1Set) {
//
//            int previousCount = removePreviousCountCatch(numberFrequencyHolder, number);
//            numberFrequencyHolder.put(number, previousCount+ 1);
//
//        }
//
//        for (int number : nums2Set) {
//
//            int previousCount = removePreviousCountCatch(numberFrequencyHolder, number);
//            numberFrequencyHolder.put(number, previousCount+ 1);
//
//        }
//
//        ArrayList<Integer> intersectedArrayList = new ArrayList<>();
//
//        for (int keyOfHashMap : numberFrequencyHolder.keySet()){
//            if(numberFrequencyHolder.get(keyOfHashMap) == 2){
//                intersectedArrayList.add(keyOfHashMap);
//            }
//        }
//
//        int[] intersectedArray = new int[intersectedArrayList.size()];
//
//        for(int number = 0; number < intersectedArray.length; number++){
//            intersectedArray[number] = intersectedArrayList.get(number);
//        }
//
//
//
//
//        return intersectedArray;
//
//    }
//
//    public static int removePreviousCountCatch(HashMap<Integer, Integer> numberRepetitionHolder, int number) {
//        int previousCount;
//        try {
//            previousCount = numberRepetitionHolder.get(number);
//        } catch (NullPointerException e) {
//            previousCount = 0;
//        }
//
//        return previousCount;
//    }
//
//    public static HashSet<Integer> arrayToSet(int[] numberArray){
//
//        HashSet<Integer> numberSet = new HashSet<>();
//
//
//        for (int number : numberArray) {
//            numberSet.add(number);
//        }
//
//        return numberSet;
//
//    }
}
