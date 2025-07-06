package LeetCode.solve5;

import java.util.Arrays;

public class prob1539 {

    public static void main(String[] args) {

        System.out.println(findKthPositive(new int[]{1, 2}, 1));

    }

    public static int findKthPositive(int[] arr, int k){

        /*
           Basically, we will use binary search algorithms to solve this problem.
           First we will sort the array in ascending order. Then take three pointer
           at "startingIndex", "endingIndex" as well as "middleIndex". After that,
           we will take a loop until "startingIndex" < "endingIndex". Everytime, we
           will calculate the "middleIndex". If target < middleIndexValue, then we
           will refactor the startingIndex by adding 1 to middleIndex. and if the
           target > middleIndexValue, then we will refactor the "endingIndex" by
           subtracting 1 from middleIndex. After that, we will return the very last
           refactored "startingIndex" + target . . . . . . . . .
        */


        int startingIndex = 0;
        int endingIndex = arr.length;

        // taking a loop to check all values . . . .
        while(startingIndex < endingIndex){

            int middleIndex = (startingIndex + endingIndex) / 2;

            if(arr[middleIndex] - 1 - middleIndex < k){
                startingIndex = middleIndex + 1;
            }
            else {
                endingIndex = middleIndex;
            }

        }
        return startingIndex + k;
    }

//    public static int findKthPositive(int[] arr, int k) {
//
//        int[] intArrayHolder = new int[1001];
//        insertAscendingOrderValue(intArrayHolder);
//        Arrays.sort(arr);
//        int index = 0;
//        int serialCounter = 1;
//        int missingNumber = 0;
//        int i = 0;
//        while ((i != k) && (index < arr.length)){
//            int a = arr[index];
//            if(arr[index] != intArrayHolder[serialCounter]){
//                missingNumber = intArrayHolder[serialCounter];
//                serialCounter++;
//                i++;
//            }
//            else{
//                index++;
//                serialCounter++;
//            }
//
//        }
//        if (i != k){
//            missingNumber =  intArrayHolder[serialCounter + i + 1];
//        }
//
//        return missingNumber;
//
//    }
//
//    public static void insertAscendingOrderValue(int[] numberArray){
//
//        for(int index = 1; index < numberArray.length; index++){
//            numberArray[index] = index;
//        }
//    }
}
