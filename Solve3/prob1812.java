package LeetCode.Solve3;

public class prob1812 {

    public static void main(String[] args) {

        System.out.println(squareIsWhite("h1"));

    }

    public static boolean squareIsWhite(String coordinates) {

        if((((int)coordinates.charAt(0)) % 2 != 0) &&
           (((int)coordinates.charAt(1)) % 2 != 0)){

            return false;

        }
        else if((((int)coordinates.charAt(0)) % 2 == 0) &&
                (((int)coordinates.charAt(1)) % 2 == 0)){

            return false;

        }
        return true;
    }
}
