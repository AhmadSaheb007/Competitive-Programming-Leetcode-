
import java.math.BigInteger;
import java.util.Objects;

public class prob204 {

    public static void main(String[] args) {

        System.out.println(countPrimes(499979));

    }
//
//    public static int countPrimes(int n) {
//
//        int count = 0;
//
//        for (int number = 0; number < n; number++) {
//            if (isPrime(BigInteger.valueOf(number))) {
//                count++;
//            }
//        }
//
//        return count;
//    }
//
//    public static boolean isPrime(BigInteger _number) {
//        BigInteger divider = BigInteger.valueOf(2);
//        BigInteger divisionCounter = BigInteger.valueOf(0);
//        //Finding prime or not . . . . . .
//        while (divider.equals(_number.multiply(BigInteger.valueOf(2)))) {
//            BigInteger result = _number.mod(divider);
//            if (Objects.equals(result, BigInteger.valueOf(0))) {
//                divisionCounter = divisionCounter.add(BigInteger.valueOf(1));
//            }
//            divider = divider.add(BigInteger.valueOf(1));
//        }
//        boolean DecisionOfPrime = false;
//        if (divisionCounter.equals(BigInteger.valueOf(0))) {
//            DecisionOfPrime = true;
//        } else {
//            DecisionOfPrime = false;
//        }
//        //Considering exceptional values  . . . . . . .
//        if (_number.equals(BigInteger.valueOf(1))) {
//            DecisionOfPrime = false;
//        }
//        if (_number.equals(BigInteger.valueOf(0))) {
//            DecisionOfPrime = false;
//        }
//        return DecisionOfPrime;
//
//    }
//}













    public static int countPrimes(int n) {

        int primeCounter = 0;
        int primeCountHelper = 0;



//        if(n == 3){
//            primeCounter++;
//        }

        for(int valueTraveler = 2; valueTraveler < n; valueTraveler++){
            if(valueTraveler == 3 || valueTraveler == 2 || valueTraveler == 5){
                primeCounter++;
            }
            else{
                for(int numberDivider = 2; numberDivider < valueTraveler/2; numberDivider++){
                    if(valueTraveler % numberDivider == 0){
                        primeCountHelper++;
                    }
                }
                if(primeCountHelper == 0){
                    primeCounter++;
                }
                primeCountHelper = 0;
            }
//            for(int numberDivider = 2; numberDivider < valueTraveler/2; numberDivider++){
//                if(valueTraveler % numberDivider != 0){
//                    primeCounter++;
//                }
//
//            }
        }


        return primeCounter;


    }
}
