package LeetCode.Solve;

import java.util.Arrays;

public class probs867 {

    public static void main(String[] args) {

        int[][] t = {{1,2,3},
                     {4,5,6}};

        System.out.println(Arrays.deepToString(transpose(t)));

    }


    public static int[][] transpose(int[][] matrix) {

        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];;

        for(int row = 0; row < matrix[0].length; row++){
            for(int col = 0; col < matrix.length; col++){

                transposeMatrix[row][col] = matrix[col][row];

            }
        }

        return transposeMatrix;

    }
}
