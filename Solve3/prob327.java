package LeetCode.Solve3;

import java.math.BigInteger;

public class prob327 {

    public static void main(String[] args) {

        System.out.println(superPow(2, new int[]{4, 3, 3, 8, 5, 2}));

    }

    public static int superPow(int a, int[] b) {

        BigInteger aToBigInteger = BigInteger.valueOf(a);
        int bToInteger = convertArrayToBigInteger(b);

        BigInteger superPowValue = aToBigInteger.pow(bToInteger);
        return superPowValue.intValue();

    }

    public static int convertArrayToBigInteger(int[] b) {

        int arrayToInteger = 0;

        for(int index = 0; index < b.length; index++){
            arrayToInteger = (arrayToInteger + b[index]) * 10;
        }
        return (arrayToInteger / 10);
    }

}
