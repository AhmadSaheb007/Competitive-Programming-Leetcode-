package LeetCode.Solve3;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

public class prob1985 {

    public static void main(String[] args) {
        System.out.println(kthLargestNumber(new String[]{"683339452288515879", "7846081062003424420", "4805719838", "4840666580043", "83598933472122816064",
                "522940572025909479", "615832818268861533", "65439878015", "499305616484085", "97704358112880133", "23861207501102", "919346676", "60618091901581",
                "5914766072", "426842450882100996", "914353682223943129", "97", "241413975523149135", "8594929955620533", "55257775478129", "528", "5110809", "7930848872563942788",
                "758", "4", "38272299275037314530", "9567700", "28449892665", "2846386557790827231", "53222591365177739", "703029", "3280920242869904137", "87236929298425799136", "3103886291279"}, 3));
    }

    public static String kthLargestNumber(String[] nums, int k) {

        BigInteger[] integerValueOfStringHolder = new BigInteger[nums.length];


        for (int index = 0; index < nums.length; index++) {
            integerValueOfStringHolder[index] = new BigInteger(nums[index]);
        }

        Arrays.sort(integerValueOfStringHolder);

        BigInteger total = findkthMaxNumber(integerValueOfStringHolder, k);

        return String.valueOf(total);


    }

    public static BigInteger findkthMaxNumber(BigInteger[] nums, int kth) {

        Arrays.sort(nums);
        BigInteger kthMaxValue = new BigInteger("9223372036854775807");
        int kthCounter = 0;
        BigInteger temp;

        for (int index = nums.length - 1; index >= 0; index--) {

            temp = nums[index].min(kthMaxValue);
            kthMaxValue = temp;
            kthCounter++;
            if (kthCounter == kth) {
                return kthMaxValue;
            }

        }

        return kthMaxValue;

    }
}

//    public static BigInteger findkthMaxNumber(BigInteger[] nums, int kth) {
//
//        Arrays.sort(nums);
//        BigInteger kthMaxValue = new BigInteger("99999999999999999");
//        int kthCounter = 0;
//
//        for(int index = nums.length - 1; index >= 0; index--){
//
//            BigInteger temp = (nums[index]);
//
//            if(temp.intValue() <= kthMaxValue.intValue()){
//                kthMaxValue = temp;
//                kthCounter++;
//
//                if(kthCounter == kth){
//                    return kthMaxValue;
//                }
//            }
//        }
//
//        return kthMaxValue;
//
//    }

//    public static String kthLargestNumber(String[] nums, int k) {
//
//        int[] integerValueOfStringHolder = new int[nums.length];
//
//        for(int index = 0; index < nums.length; index++){
//            integerValueOfStringHolder[index] = Integer.parseInt(nums[index]);
//        }
//
//        Arrays.sort(integerValueOfStringHolder);
//
//        String total = String.valueOf(findkthMaxNumber(integerValueOfStringHolder, k));
//
//        return String.valueOf(findkthMaxNumber(integerValueOfStringHolder, k));
//
//
//
//    }
//
//    public static int findkthMaxNumber(int[] nums, int kth) {
//
//        Arrays.sort(nums);
//        int kthMaxValue = nums[nums.length - 1];
//        int kthCounter = 1;
//
//        for(int index = nums.length - 1; index >= 1; index--){
//
//            if(kthCounter == kth){
//                return kthMaxValue;
//            }
//            if(nums[index] == nums[index - 1]){
//                kthMaxValue = nums[index];
//                kthCounter++;
//            }
//
//            else if(nums[index] > nums[index - 1]){
//                kthMaxValue = nums[index - 1];
//                kthCounter++;
//            }
//        }
//
//        return kthMaxValue;
//
//    }

