package LeetCode.solve5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class prob2404 {

    public static void main(String[] args) {

        System.out.println(mostFrequentEven(new int[]{4287,799,8103,3526,8396,7060,8287,4214,4093,6763,651,4907,8350,4866,5114,5245,3198,6644,3620,1586,3068,2769,9506,
                2319,588,5055,730,6968,4814,144,5180,8798,8783,3319,7765,3254,7164,5462,8085,5481,8363,3135,2910,583,3751,3044,8734,4075,5489,7866,3404,9532,3751,571,7460,
                4934,9346,4076,1505,9576,9406,3342,8090,5979,3140,4453,4779,9324,2945,7279,6809,9619,6958,9881,8308,9246,2529,3727,1241,
                7230,4536,9852,1667,1688,1320,6400,6359,6140,904,6287,6499,9256,7666,4083,2927,3165,9239,9433,1620,6961,3115,8766,2416,6653,9030,2690,9165,6150,1644,5925}));


    }



    public static int mostFrequentEven(int[] nums) {

        /*
           First in a hashmap "numberRepetitionHolder" we will store the repetition
           of each element. After that, we will check if the number appears more than
           nums.length/3 times and add into a list named "majorElements" and return
           the list . . . . . . . . .
        */

        if(nums.length == 1){
            return nums[0];
        }

        // crating a Hashmap . . . . . . .
        HashMap<Integer, Integer> numberRepetitionHolder = new HashMap<>();

        // counting the frequency of each number . . . . . . .
        for(int index = 0; index < nums.length; index++){

            int previousCount;
            try {
                previousCount = numberRepetitionHolder.get(nums[index]);
            } catch (NullPointerException e) {
                previousCount = 0;
            }
            numberRepetitionHolder.put(nums[index], previousCount + 1);

        }

        // Creating a list . . . . . . . .

        List<Integer> majorElements = new ArrayList<>();

        Integer mostFrequency = findMostFrequency(numberRepetitionHolder);

        // adding numbers with appears more than nums.length/3 times . . . . . .
        for (int mapKey : numberRepetitionHolder.keySet()) {
            if(Objects.equals(numberRepetitionHolder.get(mapKey), mostFrequency)){
                majorElements.add(mapKey);
            }
        }

        // Creating an int object to store max frequency . . . . . . . .
        //int firstKey = 0;
        int majorElementFrequency = Integer.MAX_VALUE;

        // adding numbers with appears more than nums.length/3 times . . . . . .
        for (int mapKey = 0; mapKey < majorElements.size(); mapKey++) {
            if((majorElements.get(mapKey) <= majorElementFrequency) && ((majorElements.get(mapKey) % 2 == 0))){
                majorElementFrequency = majorElements.get(mapKey);
            }
        }

        if(majorElements.contains(majorElementFrequency)){
            return majorElementFrequency;
        }

        return -1;


    }

    public static int findMostFrequency(HashMap<Integer, Integer> numberRepetitionHolder) {

        int mostFrequency = 0;

        for (int mapKey: numberRepetitionHolder.keySet()) {
            if(numberRepetitionHolder.get(mapKey) >= mostFrequency){
                mostFrequency = numberRepetitionHolder.get(mapKey);
            }
        }
        return mostFrequency;

    }
}
