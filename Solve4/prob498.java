package LeetCode.solve4;

import java.util.Arrays;

public class prob498 {

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};

        System.out.println(Arrays.toString(findDiagonalOrder((arr))));

    }

    public static int[] findDiagonalOrder(int[][] mat) {

        int[] diagonalOrderArray = new int[mat.length * mat[0].length];
        int index = 0;
        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[row].length; col++){

                if(((col % 2) == 0) && ((row % 2) != 0)){
                    diagonalOrderArray[index] = mat[col][row];
                }
                else{
                    diagonalOrderArray[index] = mat[row][col];
                }
                index++;
            }
        }

        return diagonalOrderArray;

    }
}
