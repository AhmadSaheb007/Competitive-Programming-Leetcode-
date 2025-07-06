package LeetCode.Solve;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class prob268 {

    public static void main(String[] args) {

        int[] n = {0,2};

        System.out.println(missingNumber(n));

    }


    public static int missingNumber(int[] nums) {

        HashSet<Integer> uniqueNumberSet = new HashSet<>();
        uniqueNumberSet = toHashSet(nums);

        Object[] uniqueNumberArray = uniqueNumberSet.toArray();
        Arrays.sort(uniqueNumberArray);

        for (int numberSerial = 0; numberSerial < uniqueNumberArray.length; numberSerial++) {

            if(numberSerial != (int)uniqueNumberArray[numberSerial]){
                return numberSerial;
            }

        }

        return uniqueNumberArray.length;

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



    }

    public static HashSet<Integer> toHashSet(int[] nums) {

        HashSet<Integer> uniqueNumberSet = new HashSet<>();

        for(int index = 0; index < nums.length; index++){
            uniqueNumberSet.add(nums[index]);
        }

        return uniqueNumberSet;
    }


//    public static int missingNumber(int[] nums) {
//
//        int missingNumber = 0;
//        Arrays.sort(nums);
//
//        if(!isMissingNumberFromArrayLength(nums)){
//            return nums.length;
//        }
//
//        for(int count = 0; count < nums.length; count++){
//            if(nums[count] != count){
//                return count;
//            }
//        }
//        return missingNumber;
//    }
//
//    public static boolean isMissingNumberFromArrayLength(int[] nums) {
//
//        for(int count = 0; count < nums.length; count++){
//            if(nums[count] == nums.length){
//                return true;
//            }
//        }
//        return false;
//    }

//    public static int missingNumber(int[] nums) {
//
//        int missingNumber = 1;
//
//        for(int count = 0; count <= nums.length; count++){
//            for(int index = 0; index < nums.length; index++){
//                if(count == nums[index]){
//                    break;
//                }
//                else if(count != nums.length){
//                    missingNumber = nums.length;
//                    break;
//                }
//                else {
//                    missingNumber = count;
//                    break;
//                }
//            }
//        }
//        return missingNumber;
//    }
}
