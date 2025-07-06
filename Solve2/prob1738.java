package LeetCode.Solve2;

import java.util.Arrays;

public class prob1738 {


    public static void main(String[] args) {

    }

    public int largestAltitude(int[] gain) {

        int max = Arrays.stream(gain).max().getAsInt();
        if(max > 0){
            return max;
        }

        return 0;

    }
}
