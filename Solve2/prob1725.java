package LeetCode.Solve2;

import java.util.*;

public class prob1725 {

    public static void main(String[] args) {

        int[][] n = {{1, 2}, {2, 4}, {4, 5}, {2, 4}};
        System.out.println(countGoodRectangles(n));

    }

    public static int countGoodRectangles(int[][] rectangles) {

        ArrayList<Integer> rectangleAreaHolder = new ArrayList<Integer>();

        for(int row = 0; row < rectangles.length; row++){
            int sum = 0;
            for(int col = 0; col < rectangles[row].length; col++){
                sum = sum + rectangles[row][col];
            }
            rectangleAreaHolder.add(sum);
        }

        int count = 0;

        for(int index = 0; index < rectangleAreaHolder.size(); index++){
            if(Objects.equals(rectangleAreaHolder.get(index), Collections.max(rectangleAreaHolder))){
                count++;
            }
        }

        return count;

    }
}
