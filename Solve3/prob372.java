package LeetCode.Solve3;

import java.math.BigInteger;

public class prob372 {

    public static void main(String[] args) {

        System.out.println(superPow(2147483647, new int[]{2, 0, 0}));

    }

    public static int superPow(int a, int[] b) {

        BigInteger aToBigInteger = BigInteger.valueOf(a);
        int bToInteger = convertArrayToBigInteger(b);

        BigInteger superPowValue = aToBigInteger.pow(bToInteger);
        int afterMod = superPowValue.intValue() % 1337;
        return afterMod;
    }

    public static int convertArrayToBigInteger(int[] b) {

        int arrayToInteger = 0;
        for(int index = 0; index < b.length; index++){
            arrayToInteger = (arrayToInteger + b[index]) * 10;
        }
        return (arrayToInteger / 10);
    }
}
