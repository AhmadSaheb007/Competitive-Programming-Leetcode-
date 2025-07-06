package LeetCode.solve5;

import java.util.ArrayList;
import java.util.HashMap;

public class prob80 {

    public static void main(String[] args) {

    }


    public int removeDuplicates(int[] nums) {


        HashMap<Integer, Integer> numberRepetitionHolder = new HashMap<>();

        for(int index = 0; index < nums.length; index++){

            int previousCount;
            try {
                previousCount = numberRepetitionHolder.get(nums[index]);
            } catch (NullPointerException e) {
                previousCount = 0;
            }
            numberRepetitionHolder.put(nums[index], previousCount + 1);

        }

        ArrayList<Integer> removeDuplicatesArrayList = new ArrayList<>();

        for(int mapKey : numberRepetitionHolder.keySet()){

            int counter = 1;
            while (counter < numberRepetitionHolder.get(mapKey)){

                removeDuplicatesArrayList.add(mapKey);

            }
        }

        int index = 0;

        while (index < removeDuplicatesArrayList.size()) {

            nums[index] = removeDuplicatesArrayList.get(index);
            index++;

        }

        while (index < nums.length) {

            nums[index] = 0;
            index++;

        }


        return removeDuplicatesArrayList.size();


    }
}
