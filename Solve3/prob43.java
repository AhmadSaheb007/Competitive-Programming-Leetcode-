package LeetCode.Solve3;

import java.math.BigInteger;

public class prob43 {

    public static void main(String[] args) {

        System.out.println(multiply("10", "20"));

    }

    public static String multiply(String num1, String num2) {

        BigInteger bigIntegerNum1 = new BigInteger(num1);
        BigInteger bigIntegerNum2 = new BigInteger(num2);
        BigInteger bigIntegerResult;


        bigIntegerResult = bigIntegerNum1.multiply(bigIntegerNum2);

        return bigIntegerResult.toString();


    }
}
