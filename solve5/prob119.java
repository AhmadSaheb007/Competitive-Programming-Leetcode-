package LeetCode.solve5;

import java.util.ArrayList;
import java.util.List;

public class prob119 {

    public static void main(String[] args) {

        System.out.println(getRow(3));

    }

    public static List<Integer> getRow(int rowIndex) {

        /*
           First, we will create list of lists. If rowRums == 0 then
           we return empty list. Else, we will put 1 at the first and
           last index each rows. In between of first and last index we
           will calculate each element of that row by adding the elements
           of immediate last row's less one and similar index to current
           index.
        */

        // Creating list of lists . . . . . . .
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        List<Integer> nthRowIndexValues = new ArrayList<>();

        // Checking if the numRows == 0 ot not . . . . .
        if( rowIndex == 0){
            return nthRowIndexValues;
        }

        // Creating a loop to add lists into list and calculating the value of each list . . . . .
        for(int row = 1; row <= rowIndex; row++){

            // Creating inner list of main list . . . . .
            List<Integer> eachTriangleRow = new ArrayList<>();

            // Calculation all values of each list . . . . .
            for(int rowElement = 0; rowElement < row; rowElement++){

                if(rowElement == 0 || rowElement == row - 1){

                    eachTriangleRow.add(1);

                }
                else{

                    eachTriangleRow.add(pascalTriangle.get(row - 2).get(rowElement - 1) +
                            pascalTriangle.get(row - 2).get(rowElement));

                }

            }
            // Adding each inner list into main list . . . . .
            pascalTriangle.add(eachTriangleRow);
        }

        return pascalTriangle.get(rowIndex - 1);


    }
}
