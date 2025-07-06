package LeetCode.Solve3;

import java.math.BigInteger;

public class prob08 {

    public static void main(String[] args) {

        System.out.println(myAtoi("-42"));

    }



    public static int myAtoi(String s) {

        s = s.trim();

        int index = 0;
        int numberSign = 1;
        BigInteger totalValueOfInteger = BigInteger.valueOf(0);

        while (index != s.length()){

            if(s.charAt(index) == '-'){
                numberSign = -1;
            }

            if((int)(s.charAt(index)) >= 48 && (int)(s.charAt(index)) <= 57){
                totalValueOfInteger = totalValueOfInteger.add(BigInteger.valueOf(s.charAt(index) - 48));
                totalValueOfInteger = totalValueOfInteger.multiply(BigInteger.valueOf(10));
            }

            index++;
        }

        return (totalValueOfInteger.intValue() / 10) * numberSign;



    }









//    public static int myAtoi(String s) {
//
//        if(s.length() == 0 || s.equals("+") || s.equals("-")){
//            return 0;
//        }
//
//        int index = 0;
//        Long totalValueOfInteger = Long.valueOf(0);
//        boolean isNegative = false;
//        s = s.trim();
//
//        if((int)(s.charAt(1)) > 57){
//            return Math.toIntExact(totalValueOfInteger);
//        }
//
//        else if(((s.charAt(0)) == '+') && ((s.charAt(1)) == '-') ||
//                ((s.charAt(0)) == '-') && (s.charAt(1)) == '+'){
//            return Math.toIntExact(totalValueOfInteger);
//        }
//
//
//        while (index != s.length()){
//
//            if((int)(s.charAt(index)) >= 48 && (int)(s.charAt(index)) <= 57){
//                totalValueOfInteger = totalValueOfInteger + ((int)(s.charAt(index)) - 48);
//                totalValueOfInteger = totalValueOfInteger * 10;
//            }
//
//            if(s.charAt(index) == '-'){
//                isNegative = true;
//            }
//
//            if(s.charAt(index) == '.'){
//                break;
//            }
//            index++;
//        }
//
//        if(isNegative){
//            totalValueOfInteger = -(totalValueOfInteger / 10);
//        }
//        else {
//            totalValueOfInteger =  totalValueOfInteger / 10;
//        }
//
//        if (totalValueOfInteger <= Integer.MIN_VALUE){
//            return Integer.MIN_VALUE;
//        }
//        else if (totalValueOfInteger >= Integer.MAX_VALUE) {
//            return Integer.MAX_VALUE;
//        }
//
//        return Math.toIntExact(totalValueOfInteger);
//
//    }
}
