package LeetCode.Solve;

public class prob509 {

    public static void main(String[] args) {

        System.out.println(fib(3));

    }

    public static int fib(int n) {

        int firstNumber = 0;
        int secondNumber = 1;
        int count = 0;
        int fibonacciNumber = 0;

        while(count < n){

                fibonacciNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = fibonacciNumber;

            count++;
        }

        return fibonacciNumber;

    }
}
