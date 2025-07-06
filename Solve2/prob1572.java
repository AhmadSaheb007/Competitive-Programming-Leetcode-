package LeetCode.Solve2;

public class prob1572 {

    public static void main(String[] args) {

        int[][] n;
        n = new int[][]{{14, 2, 0},
                        {1, 6, 3},
                        {9 , 2, 30}};

        System.out.println(diagonalSum(n));

    }

    public static int diagonalSum(int[][] mat) {

        int diagonalSum = 0;

        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[row].length; col++){
                if(row == col){
                    diagonalSum = diagonalSum + mat[row][col];
                }

                else if((row + col) == mat.length - 1){
                    diagonalSum = diagonalSum + mat[row][col];
                }
            }
        }

        return diagonalSum;

    }
}
