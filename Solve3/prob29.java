package LeetCode.Solve3;

import java.math.BigInteger;

public class prob29 {

    public static void main(String[] args) {

        System.out.println(divide(-2147483648 ,2));

    }

    public static int divide(int dividend, int divisor){

        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        else if(dividend == Integer.MIN_VALUE && divisor == 1){
            return Integer.MIN_VALUE;
        }

        int result = 0;
        long dividendInPositive = Math.abs(dividend);
        long divisorInPositive = Math.abs(divisor);

        if(dividend <= Integer.MIN_VALUE){
            dividendInPositive = Integer.MAX_VALUE;
        }

        while(divisorInPositive <= dividendInPositive){

            long sumOfDivisor = divisorInPositive;
            int divideCounter = 1;
            while (sumOfDivisor <= dividendInPositive - sumOfDivisor){
                sumOfDivisor = sumOfDivisor + sumOfDivisor;
                divideCounter = divideCounter + divideCounter;
            }
            result = result + divideCounter;
            dividendInPositive = dividendInPositive - sumOfDivisor;
        }

        if((dividend < 0) || (divisor < 0)){
            return (-1) * result;
        }
        return result;
    }





















































//    public static int divide(int dividend, int divisor) {
//        BigInteger roundCounter = BigInteger.valueOf(0);
//        BigInteger divisorAdder = BigInteger.valueOf(Math.abs(divisor));
//        BigInteger dividendAdder = BigInteger.valueOf(Math.abs(dividend));
//        int sign = 1;
//
//        if (divisor == 0 || dividend == 0) {
//            return 0;
//        } else if ((dividend > 0 && (divisor < 0)) || (dividend < 0 && (divisor > 0))) {
//            sign = -1;
//        }
//
//        if (dividendAdder.equals(BigInteger.valueOf(Integer.MIN_VALUE)) &&
//                (divisor == 1 || divisor == -1)) {
//            if((dividend < 0) && (divisor < 0)){
//                return ((-1) * Integer.MIN_VALUE) - 1;
//            }
//            return Integer.MIN_VALUE + 1;
//
//        }
//        else if (dividendAdder.equals(BigInteger.valueOf(Integer.MAX_VALUE)) &&
//                (divisor == 1 || divisor == -1)) {
//            return sign * Integer.MAX_VALUE;
//        }
//        else {
//
//            while (divisorAdder.equals(dividendAdder)) {
//
//                if (divisor < 0) {
//                    divisorAdder = divisorAdder.add(BigInteger.valueOf(((-1) * divisor)));
//                } else {
//                    divisorAdder = divisorAdder.add(BigInteger.valueOf(divisor));
//                }
//                roundCounter.add(BigInteger.valueOf(1));
//            }
//
//            return sign * roundCounter.intValue();
//
//        }
//    }
}



























//    public static int divide(int dividend, int divisor) {
//
//        int roundCounter = 0;
//        int divisorAdder = divisor;
//        int dividendAdder = dividend;
//
//        if((divisor < 0) && (dividend < 0)){
//            dividendAdder =(-1) * dividend;
//            divisorAdder =(-1) * divisor;
//        }
//        else if(divisor < 0){
//            divisorAdder =(-1) * divisor;
//        }
//        else if(dividend < 0){
//            dividendAdder =(-1) * dividend;
//        }
//        else{
//            divisorAdder = divisor;
//            dividendAdder = dividend;
//        }
//
//        while(divisorAdder <= dividendAdder){
//
//            if(divisor < 0){
//                divisorAdder = divisorAdder + ((-1) * divisor);
//            }
//            else{
//                divisorAdder = divisorAdder + divisor;
//            }
//            roundCounter++;
//        }
//
//        if((divisor < 0) && (dividend < 0)){
//            return roundCounter;
//        }
//
//        else if((divisor < 0) || (dividend < 0)){
//            return (-1) * roundCounter;
//        }
//        return roundCounter;
//
//    }

