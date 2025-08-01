package LeetCode.solve4;

import java.util.HashSet;

public class prob202 {

    public static void main(String[] args) {

    }

    public boolean isHappy(int n) {

        HashSet<Integer> sumOfSquareOfDigitsContainer = new HashSet<>();

        while(n != 1 && !sumOfSquareOfDigitsContainer.contains(n)){
            sumOfSquareOfDigitsContainer.add(n);
            n = returnSumOfSquareOfDigits(n);
        }

        return n == 1;

    }

    public static int returnSumOfSquareOfDigits(int n) {

        int sumOfSquareOfDigits = 0;
        while(n != 0){

            int splitedDigitOfn = n % 10;
            sumOfSquareOfDigits = (int) (sumOfSquareOfDigits + Math.pow(splitedDigitOfn, 2));
            n = n / 10;

        }

        return sumOfSquareOfDigits;

    }


}
