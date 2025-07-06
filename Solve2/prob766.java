package LeetCode.Solve2;

public class prob766 {

    public static void main(String[] args) {

        int[][] n = {{2, 3, 4, 5},{9, 2, 3, 6},{8, 1, 2, 3}};
        System.out.println(isToeplitzMatrix(n));

    }

    public static boolean isToeplitzMatrix(int[][] matrix) {

        for(int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){

                if(matrix[row][col] != matrix[row + 1][col + 1]){
                    return false;
                }
            }
        }

        return true;

    }
}
