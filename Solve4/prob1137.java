package LeetCode.solve4;

public class prob1137 {

    public static void main(String[] args) {

    }

    public int tribonacci(int n) {

        /*
           First we will create an array "tribonacciNumberSeries". Then we will
           calculate each indexed tribonacci series. And return the nth index of
           tribonacci series . . . . . . .
        */

        // Creating an Array . . . . . .
        int[] tribonacciNumberSeries = new int[40];

        // Assigning value of first 3 index . . . . .
        tribonacciNumberSeries[0] = 0;
        tribonacciNumberSeries[1] = 1;
        tribonacciNumberSeries[2] = 1;

        // Calculating value of each index tribonacci number . . . . . . .
        for(int indexOfTribonacciSeries = 3;
                indexOfTribonacciSeries < tribonacciNumberSeries.length;
                                          indexOfTribonacciSeries++){

            tribonacciNumberSeries[indexOfTribonacciSeries] = tribonacciNumberSeries[indexOfTribonacciSeries - 1] +
                                                              tribonacciNumberSeries[indexOfTribonacciSeries - 2] +
                                                              tribonacciNumberSeries[indexOfTribonacciSeries - 3];
        }

        // Returning nth tribonacci number . . . . . . .
        return tribonacciNumberSeries[n];
    }
}
