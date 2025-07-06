package LeetCode.Solve2;

import java.util.ArrayList;

public class prob349 {

    public static void main(String[] args) {

    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> intersectedArrayList = new ArrayList<Integer>();
        for(int indexN1 = 0; indexN1 < nums1.length; indexN1++){
            for(int indexN2 = 0; indexN2 < nums2.length; indexN2++){

                if(nums1[indexN1] == nums2[indexN2]){
                    intersectedArrayList.add(nums1[indexN1]);
                }
                break;

            }
        }

        int[] intersectedArray = new int[intersectedArrayList.size()];

        for(int index = 0; index < intersectedArray.length; index++){
            intersectedArray[index] = intersectedArrayList.get(index);
        }

        return intersectedArray;


    }
}
