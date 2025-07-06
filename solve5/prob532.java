package LeetCode.solve5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class prob532 {

    public static void main(String[] args) {

        System.out.println(findPairs(new int[]{3, 1, 4, 1, 5}, 2));

    }

    public static int findPairs(int[] nums, int k) {

        HashSet<Integer> numsSet = new HashSet<>();
        ArrayList<Integer> numsArrayList = new ArrayList<>();

        if(k != 0){

            for (int number: nums) {
                numsSet.add(number);
            }
            numsArrayList = new ArrayList<>(numsSet);

        }
        else{
            for(int index = 0; index < nums.length; index++){
                numsArrayList.add(nums[index]);
            }
        }


        int differenceCounter = 0;


        for(int index = 0; index < nums.length; index++){
            for(int indexTraveller = index; indexTraveller < numsArrayList.size(); indexTraveller++){

                if((Math.abs(numsArrayList.get(index) - numsArrayList.get(indexTraveller)) == k) && (index != indexTraveller)){
                    differenceCounter++;
                }

            }
        }

        return differenceCounter;

    }


}
