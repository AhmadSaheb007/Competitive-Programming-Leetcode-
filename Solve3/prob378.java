package LeetCode.Solve3;

import java.util.Arrays;

public class prob378 {

    public static void main(String[] args) {
        int[][] arr = {{1,15,9},
                      {10,11,13},
                      {12,3,15}};
        System.out.println(kthSmallest(arr,7));
    }

    public static int kthSmallest(int[][] matrix, int k) {

        int[] _2Dto1DArray = new int[matrix.length * matrix[0].length];
        int index = 0;

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                _2Dto1DArray[index] = matrix[row][col];
                index++;
            }
        }
        Arrays.sort(_2Dto1DArray);

        return _2Dto1DArray[k - 1];
    }
}
