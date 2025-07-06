package LeetCode.Solve3;

public class prob827 {
    public static void main(String[] args) {

    }

    public int largestIsland(int[][] grid) {

        int area = 0;
        int zeroCount = 0;

        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){

                if(grid[row][col] == 1){
                    area++;

                }

                else if(grid[row][col] == 0){
                    zeroCount = 1;

                }

                else{
                    //Void . . . .
                }

            }
        }
        return area + zeroCount;
    }
}
