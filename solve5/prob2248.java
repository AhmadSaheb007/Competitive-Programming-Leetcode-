package LeetCode.solve5;

import java.util.*;

public class prob2248 {

    public static void main(String[] args) {

        int[][] a = {{7,34,45,10,12,27,13},
                     {27,21,45,10,12,13}};

        System.out.println(intersection(a));

    }

    public static List<Integer> intersection(int[][] nums) {

        List<Integer> intersectedItems = new ArrayList<>();

        HashMap<Integer, Integer> numberRepetitionHolder = new HashMap<>();

        for (int[] rowNum : nums) {

            for (int colNumber : rowNum) {

                int previousCount;
                try {
                    previousCount = numberRepetitionHolder.get(colNumber);
                } catch (NullPointerException e) {
                    previousCount = 0;
                }
                numberRepetitionHolder.put(colNumber, previousCount + 1);

            }


        }

        for(int mapKey : numberRepetitionHolder.keySet()){

            if(numberRepetitionHolder.get(mapKey) == nums.length){
                intersectedItems.add(mapKey);
            }

        }

        int[] insertedItemArray = new int[intersectedItems.size()];

        for (int index = 0; index < insertedItemArray.length; index++) {

            insertedItemArray[index] = intersectedItems.get(index);

        }

        Arrays.sort(insertedItemArray);

        List<Integer> intersectedItemsAscendingOrder  = new LinkedList<>();

        for (int number : insertedItemArray) {
            intersectedItemsAscendingOrder.add(number);
        }




        return intersectedItemsAscendingOrder;



    }

//
//    public static ArrayList<Integer> intersect(int[] nums1, int[] nums2) {
//
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        ArrayList<Integer> intersectedElements = new ArrayList<>();
//
//        int indexOfNums1 = 0;
//        int indexOfNums2 = 0;
//
//        while (true){
//
//            if((indexOfNums1 >= nums1.length) || ((indexOfNums2 >= nums2.length))){
//                break;
//            }
//
//            else if(nums1[indexOfNums1] == nums2[indexOfNums2]){
//                intersectedElements.add(nums1[indexOfNums1]);
//                indexOfNums1++;
//                indexOfNums2++;
//            }
//
//            else if(nums1[indexOfNums1] > nums2[indexOfNums2]){
//                indexOfNums2++;
//            }
//            else if(nums1[indexOfNums1] < nums2[indexOfNums2]){
//                indexOfNums1++;
//            }
//            else{
//                //void for now . . . . .
//            }
//
//        }
//        int[] intersectedArray = new int[intersectedElements.size()];
//        for(int indexOfArrayList = 0; indexOfArrayList < intersectedElements.size(); indexOfArrayList++){
//
//            intersectedArray[indexOfArrayList] = intersectedElements.get(indexOfArrayList);
//        }
//
//        return intersectedElements;
//
//    }
}
