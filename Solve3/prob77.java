package LeetCode.Solve3;

public class prob77 {

    public static void main(String[] args) {

        int[][] arr;
        arr = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        setZeroes(arr);
    }


    public static void setZeroes(int[][] matrix) {

        int[] rowValue = new int[matrix.length];
        int[] colValue = new int[matrix[0].length];


        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                if (matrix[row][col] == 0) {
                    rowValue[row] = Integer.MAX_VALUE;
                    colValue[col] = Integer.MAX_VALUE;
                }
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (rowValue[row] == (Integer.MAX_VALUE) || colValue[col] == (Integer.MAX_VALUE)) {
                    matrix[row][col] = 0;
                }
            }
        }
    }
}


























































//    public static void setZeroes(int[][] matrix) {
//
//        int setRowCheck = -1;
//        int setColCheck = -1;
//
//        for(int row = 0; row < matrix.length; row++){
//            for(int col = 0; col < matrix[row].length; col++){
//
//                if((matrix[row][col] == 0) && (row != setRowCheck) && (col != setColCheck)){
//                    setRowColZeros(matrix, row, matrix[row].length, col);
//                    setRowCheck = row;
//                    setColCheck = col;
//                }
//
//            }
//        }
//
//    }
//
//    public static void setRowColZeros(int[][] matrix, int rowLimit, int colLimit, int colNumber) {
//
//        for(int col = 0; col < colLimit; col++){
//            matrix[rowLimit][col] = 0;
//        }
//
//        for(int row = 0; row < matrix.length; row++){
//            matrix[row][colNumber] = 0;
//        }
//
//
//    }
