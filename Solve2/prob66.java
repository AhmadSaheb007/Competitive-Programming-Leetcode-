package LeetCode.Solve2;

import java.util.ArrayList;
import java.util.Arrays;

public class prob66 {

    public static void main(String[] args) {

        int[] n = {9, 9, 9, 8, 9};

        System.out.println(Arrays.toString(plusOne(n)));

    }

    public static int[] plusOne(int[] digits) {

        int[] newDigit = new int[digits.length + 1];
        int zeroCounter = 0;

        for(int index = digits.length - 1; index >=0; index--){

            if(digits[index] != 9){
                digits[index]++;
                return digits;
            }
            else {
                digits[index] = 0;
                zeroCounter++;
            }

        }
        if(zeroCounter == digits.length){
            newDigit[0] = 1;
            System.arraycopy(digits, 0, newDigit, 1, digits.length);
        }

        return newDigit;

    }

//    public static int[] plusOne(int[] digits) {
//
//        ArrayList<Integer> plusOneArrayList = new ArrayList<Integer>();
//        long sum = 0;
//
//        for(int index = 0; index < digits.length; index++){
//            sum = sum * 10;
//            long m = sum;
//            sum = sum + digits[index];
//        }
//
//        sum = sum + 1;
//        while(sum != 0){
//            plusOneArrayList.add((int) (sum % 10));
//            sum = sum / 10;
//        }
//
//        int[] plusOneReturningArray = new int[plusOneArrayList.size()];
//        for(int index = 0; index < plusOneReturningArray.length; index++){
//            plusOneReturningArray[index] = plusOneArrayList.get((plusOneReturningArray.length - 1) - index);
//        }
//
//        return plusOneReturningArray;
//
//    }
}
