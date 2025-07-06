package LeetCode.Solve3;

import java.math.BigInteger;

public class prob67 {

    public static void main(String[] args) {

        System.out.println(addBinary("11", "1"));

    }

    public static String addBinary(String a, String b) {

            BigInteger aToBinary  = new BigInteger(a, 2);
            BigInteger bToBinary  = new BigInteger(b, 2);

            BigInteger total = aToBinary.add(bToBinary);
            return total.toString(2);

    }


}
