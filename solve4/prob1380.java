package LeetCode.solve4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class prob1380 {

    public static void main(String[] args) {

        int[][] mat = new int[3][3];
        mat = new int[][]{{3, 6},
                          {7, 1},
                          {5, 2},
                          {4, 8}};

        System.out.println(luckyNumbers(mat));

    }

    public static List<Integer> luckyNumbers (int[][] matrix) {

        //int[][] sortedArray = new int[matrix.length][matrix[0].length];
        int minInMatrixRowValue =  minInMatrixRow(matrix);


        //sortedArray = minInMatrixRow(matrix);


        LinkedList<Integer> luckyNumberList = new LinkedList<>();
        luckyNumberList.add(findMaxInColumn(matrix, minInMatrixRowValue));

        return luckyNumberList;
    }

    public static int minInMatrixRow(int[][] matrix){

        int minimumValueInRow = Integer.MAX_VALUE;

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                if(minimumValueInRow > matrix[row][col]){
                    minimumValueInRow = matrix[row][col];
                }
            }
        }
        return minimumValueInRow;
    }

    public static int findMaxInColumn (int[][] matrix, int minimumValueInRow){

        int maxInCol = matrix[0][0];

        for(int row = 0; row < matrix.length; row++){
            if(matrix[row][0] > minimumValueInRow){
                return '\0';
            }
        }
        return minimumValueInRow;
    }
}
