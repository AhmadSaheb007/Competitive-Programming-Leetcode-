package LeetCode.Solve3;

import java.math.BigInteger;

public class prob415 {

    public static void main(String[] args) {

    }

    public String addStrings(String num1, String num2) {

        BigInteger num1ToBigInteger = new BigInteger(num1);
        BigInteger num2ToBigInteger = new BigInteger(num2);
        BigInteger resultInBigInteger = num1ToBigInteger.add(num2ToBigInteger);

        return String.valueOf(resultInBigInteger);


    }
}
