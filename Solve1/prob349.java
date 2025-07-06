package LeetCode.Solve;

import java.util.ArrayList;
import java.util.Arrays;

public class prob349 {

    public static void main(String[] args) {

        int[] n1 = {4,9,5};
        int[] n2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(intersection(n1, n2)));


    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> intersectedArrayList = new ArrayList<Integer>();

        int totalSize = nums1.length + nums2.length;

        int arraySize = nums1.length;
        if(nums1.length < nums2.length){
            arraySize = nums2.length;
        }

        for(int index1 = 0; index1 < arraySize; index1++){
            for(int index2 = 0; index2 < totalSize - arraySize; index2++){
                if(nums1[index1] == nums2[index2]){
                    intersectedArrayList.add(nums1[index1]);
                }
                break;
            }
        }
        int[] intersectedArray = new int[intersectedArrayList.size()];

        for(int index = 0; index < intersectedArrayList.size(); index++){
            intersectedArray[index] = intersectedArrayList.get(index);
        }

        return intersectedArray;

    }
}
