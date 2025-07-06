package LeetCode.Solve3;

import java.util.Arrays;

public class prob832 {

    public static void main(String[] args) {

        int[][] arr;
        arr = new int[][]{{1, 0, 1, 1, 1},
                          {1, 0, 0, 0, 1},
                          {1, 1, 0, 0, 0}};

        System.out.println(Arrays.deepToString(invertHorizontally(arr)));
        System.out.println();
        System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));



    }

    public static int[][] flipAndInvertImage(int[][] image) {

        int[][] afterInvertedHorizontally = invertHorizontally(image);
        int[][] numberSwapArray =  new int[image.length][image[0].length];

        for(int row = 0; row < afterInvertedHorizontally.length; row++){
            for(int col = 0; col < afterInvertedHorizontally[row].length; col++){

                if(afterInvertedHorizontally[row][col] == 1){
                    numberSwapArray[row][col] = 0;
                }

                else if(afterInvertedHorizontally[row][col] == 0){
                    numberSwapArray[row][col] = 1;
                }
                else {
                    //Void for now . . . . .
                }
            }
        }
        return numberSwapArray;
    }

    public static int[][] invertHorizontally(int[][] image) {

        int[][] horizontallyInverted = new int[image.length][image[0].length];

        for(int row = 0; row < image.length; row++){
            for(int col = 0; col < image[row].length; col++){

                horizontallyInverted[row][col] = image[row][image[row].length - (col + 1)];

            }
        }

        return horizontallyInverted;

    }
}
