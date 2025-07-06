package LeetCode.solve5;

import java.util.Arrays;
import java.util.HashMap;

public class prob704 {

    public static void main(String[] args) {

        System.out.println(search(new int[]{-1,0,3,5,9,12}, 9));

    }

    public static int search(int[] nums, int target) {

        /*
           First we will create a hashmap and map all index value with
           it's array value. Then we will call A searching function using
           binary Search. If the value found, then we will return the index
           of that target value . . . . . . . . . .
        */

        // Creating a hashMap . . . . . .
        HashMap <Integer, Integer> valueIndexMapper = new HashMap<>();

        // Inserting all value as key and index as value . . . . .
        for(int index = 0; index < nums.length; index++){
            valueIndexMapper.put(nums[index], index);
        }

        // Calling searching function . . . . . .
        if(isFoundByBinarySearch(nums, target)){
            return valueIndexMapper.get(target);
        }

        return -1;

    }

    public static boolean isFoundByBinarySearch(int[] nums, int target) {

        /*
           First we will sort the array in ascending order. Then take three pointer
           at "startingIndex", "endingIndex" as well as "middleIndex". After that,
           we will take a loop until "startingIndex" <= "endingIndex". Everytime,
           we will calculate the "middleIndex". If value found then program will
           return it. Else if target < middleIndexValue, then we will refactor the
           startingIndex by adding 1 to middleIndex. target > middleIndexValue, then
           we will refactor the "endingIndex" by subtracting 1 from middle . . . . . . . . .
        */

        // sorting the array . . . . . .
        Arrays.sort(nums);

        // initializing all indexes . . . . . .
        int startingIndex = 0;
        int endingIndex = nums.length - 1;

        // taking a loop to check all values . . . .
        while(startingIndex <= endingIndex){

            int middleIndex = (startingIndex + endingIndex) / 2;

            if(nums[middleIndex] == target){
                return true;
            }
            else if(nums[middleIndex] < target){
                startingIndex = middleIndex + 1;
            }
            else {
                endingIndex = middleIndex - 1;
            }

        }
        return false;
    }
}
