package LeetCode.Solve3;

public class prob2319 {

    public static void main(String[] args) {

        int[][] n ={{2,0,0,1},
                    {0,3,1,0},
                    {0,5,2,0},
                    {4,0,0,2}};
        System.out.println(checkXMatrix(n));

    }

    public static boolean checkXMatrix(int[][] grid) {

        for(int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if ((row == col) ||
                   ((row + col) == (grid.length - 1))) {
                    if((grid[row][col] == 0)){
                        return false;
                    }
                }
                else if(grid[row][col] != 0){
                    return false;
                }
            }
        }
        return true;
    }
}
