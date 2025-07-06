package LeetCode.solve4;

public class prob48 {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};

        rotate(arr);

    }

    public static void rotate(int[][] matrix) {

        int[][] rotatedArray = new int[matrix.length][matrix[0].length];

        int rowOfRotatedArray = 0;
        int colOfRotatedArray = 0;

        for(int row = 0; row < matrix.length; row++){
                for(int col =  matrix.length - 1; col >= 0; col--){

                rotatedArray[rowOfRotatedArray][colOfRotatedArray] = matrix[col][row];
                colOfRotatedArray++;
            }
            rowOfRotatedArray++;
            colOfRotatedArray = 0;
        }

        for(int row = 0; row < matrix.length; row++){
            int startingPointOfSourceArray = 0;
            int startingPointOfTargetArray = 0;
            System.arraycopy(rotatedArray, startingPointOfSourceArray, matrix, startingPointOfTargetArray, matrix.length);
        }

    }
}
