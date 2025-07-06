package LeetCode.Solve2;

public class prob1351 {

    public static void main(String[] args) {

    }

    public static int countNegatives(int[][] grid) {

        int count = 0;
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){
                if(grid[row][col] < 0){
                    count++;
                }
            }
        }

        return count;

    }
}
