package LeetCode.solve5;

import java.util.Arrays;
import java.util.HashSet;

public class prob1980 {

    public static void main(String[] args) {

        System.out.println(findDifferentBinaryString(new String[]{"111", "011", "001"}));

    }


    public static String findDifferentBinaryString(String[] nums) {


        int[] decimal = new int[nums.length];
        for(int index = 0; index < nums.length; index++){
            decimal[index] = Integer.parseInt(nums[index], 2);
        }

        Arrays.sort(decimal);

        int index = 0;

        while(index < nums.length){

            if(index != decimal[index]){
                return Integer.toBinaryString(decimal[index]);
            }
            index++;

        }

        return Integer.toBinaryString(index);

    }



//    public String findDifferentBinaryString(String[] nums) {
//
//        HashSet<String> uniqueNumberSet = new HashSet<>(Arrays.asList(nums));
//        //uniqueNumberSet = toHashSet(nums);
//
//        Object[] uniqueNumberArray = uniqueNumberSet.toArray();
//        Arrays.sort(uniqueNumberArray);
//
//        for (int numberSerial = 0; numberSerial < uniqueNumberArray.length; numberSerial++) {
//
//            if(numberSerial != (int)uniqueNumberArray[numberSerial]){
//                return numberSerial;
//            }
//
//        }
//
//        return uniqueNumberArray.length;

//        HashMap<Integer, Integer> numberRepetitionMap = new HashMap<>();

//        for(int index = 0; index < uniqueNumberArray.length; index++){
//
//            int previousCount;
//            try {
//                previousCount = numberRepetitionMap.get((int)uniqueNumberArray[index]);
//            } catch(NullPointerException e) {
//                previousCount = 0;
//            }
//            numberRepetitionMap.put((int)uniqueNumberArray[index], previousCount + 1);
//
//        }




//    }
//
//    public static int[] toDecimalArray(String[] nums) {
//
//        int[] decimalArray = new int[nums.length];
//
//
//    }
}
