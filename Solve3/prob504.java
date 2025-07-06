package LeetCode.Solve3;

import java.math.BigInteger;

public class prob504 {

    public static void main(String[] args) {

        System.out.println(convertToBase7(7));

    }

    public static String convertToBase7(int num){
        return Integer.toString(
                Integer.parseInt(String.valueOf(num), 10), 7);
    }

//    public static String convertToBase7(int num) {
//
//        int signConverter = 1;
//
//        if(num < 0){
//            signConverter = -1;
//        }
//
//        BigInteger numToBigInteger = BigInteger.valueOf(Math.abs(num));
//        BigInteger baseValue = BigInteger.valueOf(0);
//
//        while(Math.abs(num) != 0){
//
//            BigInteger tempBaseValue = (numToBigInteger.mod(BigInteger.valueOf(7)));
//            baseValue = baseValue.add(tempBaseValue);
//            baseValue = baseValue.multiply(BigInteger.valueOf(10));
//            num = num / 7;
//            numToBigInteger = numToBigInteger.divide(BigInteger.valueOf(7));
//
//
//        }
//
//        baseValue = baseValue.multiply(BigInteger.valueOf(signConverter));
//
//        return baseValue.divide(BigInteger.valueOf(10)).toString();
//
//    }
}
