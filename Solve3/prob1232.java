package LeetCode.Solve3;

public class prob1232 {

    public static void main(String[] args) {

        int[][] arr = {{1, 1},
                       {2, 2},
                       {2, 0}};

        System.out.println(checkStraightLine(arr));



    }
    public static boolean checkStraightLine(int[][] coordinates) {

        /*
           First we will calculate slope of all set. If all set's slope
           are equal, then we will return it true and terminate program
        */

        // Calculating slope of all Coordinates . . . . . . . .
        double slopeOfCoordinates = calculateSlope(coordinates[0], coordinates[1]);

        // Checking if all slopes are equal or not, if not return false . . . . . . .
        for(int row = 2; row < coordinates.length; row++){
            if(slopeOfCoordinates != calculateSlope(coordinates[0], coordinates[row])){
                return false;
            }
        }
        return true;
    }

    // Function to calculate slope of each set . . . . . . .
    public static double calculateSlope(int[] coordinateOfPoint1, int[] coordinateOfPoint2){

        double slope = (((coordinateOfPoint1[1] - coordinateOfPoint2[1]) * 1.0) /
                ((coordinateOfPoint1[0] - coordinateOfPoint2[0]) * 1.0));

        if((slope == Double.POSITIVE_INFINITY) || (slope == -Double.POSITIVE_INFINITY)){
            return Integer.MAX_VALUE;
        }

        return (((coordinateOfPoint1[1] - coordinateOfPoint2[1]) * 1.0) /
                         ((coordinateOfPoint1[0] - coordinateOfPoint2[0]) * 1.0));

    }
}
