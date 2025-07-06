package LeetCode.Solve2;

import java.util.Arrays;

public class prob1822 {

    public static void main(String[] args) {

        int[] n = {9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        System.out.println(arraySign(n));

    }

    public static int arraySign(int[] nums) {

        int negativeCounter = 0;

        for(int index = 0; index < nums.length; index++){
            if(nums[index] == 0){
                return 0;
            }
            else if(nums[index] < 0){
                negativeCounter++;
            }
        }

        if(negativeCounter % 2 == 0){
            return 1;
        }
        return -1;
    }


















//    public static int arraySign(int[] nums) {
//
//        long signFunc = 1;
//        for(int index = 0; index < nums.length; index++){
//            signFunc = signFunc * nums[index];
//        }
//
//        if(signFunc == 0)
//        return 0;
//
//        else if(signFunc > 1)
//            return 1;
//
//        else
//            return -1;
//
//
//    }
}
