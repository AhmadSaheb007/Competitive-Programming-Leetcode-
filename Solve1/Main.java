

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[][] mat = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        setZeroes(mat);


    }


    public static void setZeroes(int[][] matrix) {

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                if(matrix[row][col] == 0){
                    for(int row0 = row; row0 < matrix.length; row0++) {
                        for (int col0 = col; col0 < matrix[row].length; col0++) {
                            matrix[row][col] = 0;

                        }
                    }
                }

            }
        }


        for(int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }



    }


}
