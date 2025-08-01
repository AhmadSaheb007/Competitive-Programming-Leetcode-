package LeetCode.solve4;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class prob448 {

    public static void main(String[] args) {

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {

        /*
           We will store all values into a HashSet "uniqueNumberSetFromNums"
           So that we can get just unique values from given Array. Then, we
           will if the ascending style number from 1 to num.length contains
           at the HashSet, if not we will add that number into a LinkedList
           "disappearedNumbersList". . . . . . . .
         */

        // Creating a HashSet to store unique values . . . . . . .
        HashSet<Integer> uniqueNumberSetFromNums = new HashSet<>();

        // Inserting All values into the HashSet . . . . . . . .
        for(int number : nums){
            uniqueNumberSetFromNums.add(number);
        }

        // Creating A LinkedList due to returning condition . . . . . . .
        LinkedList<Integer> disappearedNumbersList = new LinkedList<>();

        // Checking if the value contains into the HashSet. . . . . .
        // else store that Value in to LinkedList. . . . . .
        for(int numberSerial = 1; numberSerial <= nums.length; numberSerial++){
            if(!uniqueNumberSetFromNums.contains(numberSerial)){
                disappearedNumbersList.add(numberSerial);
            }
        }

        return disappearedNumbersList;

    }
}
