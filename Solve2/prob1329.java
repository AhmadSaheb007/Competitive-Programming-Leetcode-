package LeetCode.Solve2;

import java.util.Arrays;

public class prob1329 {

    public static void main(String[] args) {

        int[][] n = {{1,3,5,2}, {3,5,2,7}, {3,9,7,1}};
        System.out.println(Arrays.deepToString(diagonalSort(n)));
    }

    public static int[][] diagonalSort(int[][] mat) {

        //int[][] newMat = new int[mat.length][];

        for(int row = 0; row < mat.length; row++){
            Arrays.sort(mat[row]);
        }

        for(int col = 0; col < mat.length; col++){
            for(int row = 0; row < mat[row].length; row++){
                mat[row][col] = mat[row][col];
            }
        }
        return mat;

    }
}
