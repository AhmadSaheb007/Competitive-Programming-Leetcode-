package LeetCode.Solve3;

import java.util.Arrays;

public class prob1304 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sumZero(11)));

    }

    public static int[] sumZero(int n) {

        int[] sumZeroArray = new int[n];
        int arrayValues_FromZeroTo_nOverTwo = 1;
        int arrayValues_From_nOverTwo_PlusOneTo_n = 1;

        for(int index = 0; index < n; index++){

            if(index < (n/2)){
                sumZeroArray[index] = arrayValues_FromZeroTo_nOverTwo;
                arrayValues_FromZeroTo_nOverTwo++;
            }
            else if(index >= (n/2)) {
                sumZeroArray[index] = -(arrayValues_From_nOverTwo_PlusOneTo_n);
                arrayValues_From_nOverTwo_PlusOneTo_n++;
            }
        }
        if(n % 2 != 0){
            sumZeroArray[((n - 1))] = 0;
        }

        return sumZeroArray;
    }
}
