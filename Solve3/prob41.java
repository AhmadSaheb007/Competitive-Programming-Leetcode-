package LeetCode.Solve3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class prob41 {

    public static void main(String[] args) {

        System.out.println(firstMissingPositive(new int[]{-3,-1,-8,1,2,3,4}));

    }

    public static int firstMissingPositive(int[] nums) {

        /*
           We will store all values into a HashSet "uniqueNumberSetFromNums"
           So that we can get just unique values from given Array. Then, we
           will if the ascending style number from 1 to num.length contains
           at the HashSet, if not return that Number. Else if the loop doesn't
           return any value, then terminate the program by returning the value
           (Array length + 1) . . . . . . . .
         */

        // Creating a HashSet to store unique values . . . . . . .
        HashSet<Integer> uniqueNumberSetFromNums = new HashSet<>();

        // Inserting All values into the HashSet . . . . . . . .
        for(int number : nums){
            uniqueNumberSetFromNums.add(number);
        }

        // Checking if the value contains into the HashSet. . . . . .
        // else return that Value. . . . . .
        for(int numberSerial = 1; numberSerial <= nums.length; numberSerial++){
            if(!uniqueNumberSetFromNums.contains(numberSerial)){
                return numberSerial;
            }
        }

        // if the loop doesn't return any number, then return (Length of Array + 1) . . . . . .
        return nums.length + 1;
    }








//    public int firstMissingPositive(int[] nums) {
//
//        int arrayIndexValue = nums[0];
//        int getPosition = 0;
//        int index = 1;
//
//
//        do{
//            if( nums[index] >= 0){
//                if(nums[index] <= arrayIndexValue){
//                    arrayIndexValue = nums[index];
//                    getPosition = index;
//
//                }
//            }
//            index++;
//        } while (index < nums.length);
//        return getPosition +1 ;
//
//    }
}
