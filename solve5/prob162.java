package LeetCode.solve5;

import java.util.Arrays;

public class prob162 {

    public static void main(String[] args) {

        System.out.println(findPeakElement(new int[]{1,2,1,3,5,6,4}));

    }

//    public static int findPeakElement(int[] nums) {
//
//        /*
//           First we will sort the array in ascending order. Then take three pointer
//           at "startingIndex", "endingIndex" as well as "middleIndex". After that,
//           we will take a loop until "startingIndex" <= "endingIndex". Everytime,
//           we will calculate the "middleIndex". If value found then program will
//           return it. Else if peakElement < middleIndexValue, then we will refactor the
//           startingIndex by adding 1 to middleIndex. peakElement > middleIndexValue, then
//           we will refactor the "endingIndex" by subtracting 1 from middle . . . . . . . . .
//        */
//
//        // sorting the array . . . . . .
//        //Arrays.sort(nums);
//
//        // initializing all indexes . . . . . .
//        int startingIndex = 0;
//        int endingIndex = nums.length - 1;
//        int peakElement = nums[0];
//        int peakElementIndex = 0;
//
//        // taking a loop to check all values . . . .
//        while(startingIndex < endingIndex){
//
//            int middleIndex = (startingIndex + endingIndex) / 2;
//
//            if(nums[middleIndex] > peakElement){
//                peakElement = nums[middleIndex];
//                peakElementIndex = peakElementIndex + (middleIndex + 1);
//            }
//            else if(nums[middleIndex] < peakElement){
//                startingIndex = middleIndex + 1;
//            }
//            else {
//                endingIndex = middleIndex - 1;
//            }
//
//        }
//        return peakElementIndex;
//
//    }

    public static int findPeakElement(int[] nums) {

        int startingIndex = 0;
        int lastIndex = nums.length;

        int[] sortedArray = Arrays.copyOfRange(nums, startingIndex, lastIndex);
        Arrays.sort(sortedArray);
        int peakElement = sortedArray[nums.length - 1];

        int peakElementIndex = 0;

        for(int index = 0; index < nums.length; index++){
            if(nums[index] == peakElement){
                peakElementIndex = index;
            }
        }

        return peakElementIndex;
    }
}
