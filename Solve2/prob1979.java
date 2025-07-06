package LeetCode.Solve2;

import java.util.Arrays;

public class prob1979 {

    public static void main(String[] args) {

        System.out.println(findGCD(new int[]{7, 5, 6, 8, 3}));

    }

    public static int findGCD(int[] nums) {

        int commonDivisor = 1;

        int maxNumber = Arrays.stream(nums).max().getAsInt();
        int minNumber = Arrays.stream(nums).min().getAsInt();

        for(int index = 1; ((index <= maxNumber) && (index <= minNumber)); index++){

            if((maxNumber % index == 0) && (minNumber % index == 0)){
                commonDivisor = index;
            }
        }



        return commonDivisor;

    }
}
