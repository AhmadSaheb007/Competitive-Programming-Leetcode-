package LeetCode.Solve2;

public class prob204 {

    public static void main(String[] args) {

        System.out.println(countPrimes(10));

    }

    public static int countPrimes(int n) {

        int count = 0;

        for(int number = 0; number <= n; number++){
            if(isPrime(number)){
                count++;
            }
        }

        return count;
    }

    public static boolean isPrime(int _number){
        int divider = 2;
        int divisionCounter = 0;
        //Finding prime or not . . . . . .
        while (divider <= Math.sqrt(_number)) {
            int result =_number % divider;
            if (result == 0) {
                divisionCounter ++ ;
            }
            divider++;
        }
        boolean DecisionOfPrime;
        if (divisionCounter == 0) {
            DecisionOfPrime = true;
        }
        else {
            DecisionOfPrime = false;
        }
        //Considering exceptional values  . . . . . . .
        if (_number == 1) {
            DecisionOfPrime = false;
        }
        if (_number == 0) {
            DecisionOfPrime = false;
        }
        return DecisionOfPrime ;

    }
}
