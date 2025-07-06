package LeetCode.solve5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class prob2215 {

    public static void main(String[] args) {

        System.out.println(findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6}));

    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> combinedList = new LinkedList<>();

        List<Integer> nums1List = new LinkedList<>();
        List<Integer> nums2List = new LinkedList<>();

        List<Integer> intersectedItems = findIntersectedList(nums1, nums2);

        for (int nums1Number : nums1) {

            for (int indexOfIntersectedItems = 0; indexOfIntersectedItems < intersectedItems.size(); indexOfIntersectedItems++) {

                if (nums1Number != intersectedItems.get(indexOfIntersectedItems)) {

                    nums1List.add(nums1Number);

                }

            }


        }



        for (int nums2Number : nums2) {

            for (int indexOfIntersectedItems = 0; indexOfIntersectedItems < intersectedItems.size(); indexOfIntersectedItems++) {

                if (nums2Number != intersectedItems.get(indexOfIntersectedItems)) {

                    nums2List.add(nums2Number);

                }

            }


        }

        combinedList.add(nums1List);
        combinedList.add(nums2List);

        return combinedList;

    }


    public static List<Integer> findIntersectedList(int[] nums1, int[] nums2){

        List<Integer> intersectedItems = new ArrayList<>();

        HashMap<Integer, Integer> numberRepetitionHolder = new HashMap<>();


        for (int rowNum : nums1) {


            int previousCount;
            try {
                previousCount = numberRepetitionHolder.get(rowNum);
                } catch (NullPointerException e) {
                previousCount = 0;
            }
            numberRepetitionHolder.put(rowNum, previousCount + 1);

        }

        for (int rowNum : nums2) {


            int previousCount;
            try {
                previousCount = numberRepetitionHolder.get(rowNum);
            } catch (NullPointerException e) {
                previousCount = 0;
            }
            numberRepetitionHolder.put(rowNum, previousCount + 1);

        }

        for(int mapKey : numberRepetitionHolder.keySet()){

            if(numberRepetitionHolder.get(mapKey) == 2){
                intersectedItems.add(mapKey);
            }

        }

        return intersectedItems;

    }
}
