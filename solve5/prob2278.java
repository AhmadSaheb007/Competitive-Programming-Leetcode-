package LeetCode.solve5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prob2278 {

    public static void main(String[] args) {

        int[][] nA = {{20,25,49},{16,7,20,47,17},{17,20}};

        System.out.println(intersection(nA));

    }


    public static List<Integer> intersection(int[][] nums) {

        List<Integer> intersectedElements = new ArrayList<>();

        if(nums.length == 1){
            for(int col = 0; col < nums[0].length; col++){
                intersectedElements.add(nums[0][col]);
            }
        }

        else{

            for(int row = 0; row < nums.length; row++){

                if(row + 1 < nums.length){

                    for(int rowTraveller = row + 1; rowTraveller < nums.length; rowTraveller++){
                        intersectedElements = intersect(nums[row], nums[rowTraveller]);
                    }
                }
            }
        }




        Object[] intersectedArray = intersectedElements.toArray();

        Arrays.sort(intersectedArray);

        List<Integer> sortedIntersectedElements = new ArrayList<>();

        for(int index = 0; index < intersectedArray.length; index++){

            sortedIntersectedElements.add((Integer) intersectedArray[index]);
        }

        return sortedIntersectedElements;

    }


    public static ArrayList<Integer> intersect(int[] nums1, int[] nums2) {

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

        return intersectedElements;

    }
}
