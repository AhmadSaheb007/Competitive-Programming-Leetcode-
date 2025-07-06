package LeetCode.Solve3;

import java.util.Arrays;
import java.util.Collections;

public class prob11 {

    public static void main(String[] args) {

        System.out.println(maxArea(new int[]{2,3,4,5,18,17,6}));

    }

    public static int maxArea(int[] height) {

        int maxStorage = 0;
        int rightSide  = height.length - 1;
        int leftSide  = 0;

        for(int heightIndex = 0; heightIndex < height.length; heightIndex++){

            int minMaxBetweenTwoPillars = Math.min(height[leftSide], height[rightSide]);
            int distanceBetweenTwoPillars = (rightSide - leftSide);
            int currentMaxArea = minMaxBetweenTwoPillars * distanceBetweenTwoPillars;
            maxStorage = Math.max(maxStorage, currentMaxArea);

            if(height[leftSide] < height[rightSide]){
                leftSide++;
            }
            else{
                rightSide--;
            }

        }
        return maxStorage;
    }

//    public static int maxArea(int[] height) {
//
//        int maxStorage = 0;
//        int maxHeight = height[0];
//        int maxHeightIndex = 0;
//
//        for(int index = 0; index < height.length; index++){
//            if(maxHeight < height[index]){
//                maxHeight = height[index];
//                maxHeightIndex = index;
//            }
//        }
//        for(int index1 = 0; index1 < height.length; index1++){
//
//
//                if((height[index1] != maxHeight)){
//                    int i = maxHeightIndex - index1;
//
//                }
//                if((maxStorage < (Math.min(maxHeight, height[index1]) * Math.abs(maxHeightIndex - index1)))){
//                    maxStorage = (Math.min(maxHeight, height[index1]) * Math.abs(maxHeightIndex - index1));
//
//                }
//
//        }
//        return maxStorage;
//    }
}
