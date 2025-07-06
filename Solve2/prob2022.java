package LeetCode.Solve2;

import java.util.Arrays;

public class prob2022 {

    public static void main(String[] args) {

        int[] o = {1,2};

        System.out.println(Arrays.deepToString(construct2DArray(o, 1, 1)));

    }

    public static int[][] construct2DArray(int[] original, int m, int n) {

        int[][] conductedArray = new int[m][n];
        int[][] canNotPossibleToConductArray = {};

        if((m * n) != original.length){
            return canNotPossibleToConductArray;
        }

        int index = 0;
        for(int row = 0; row < conductedArray.length; row++){
            for(int col = 0; col < conductedArray[row].length; col++){
                conductedArray[row][col] = original[index];
                index++;
            }
        }
        return conductedArray;
    }
}
