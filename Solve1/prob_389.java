

public class prob_389 {

    public static void main(String[] args) {

        System.out.println(findTheDifference("abe", "abed"));

    }
    public static char findTheDifference(String s, String t) {


        int total_ASCII_Value_Of_s = find_ASCII_Value(s);
        int total_ASCII_Value_Of_t = find_ASCII_Value(t);

        return (char) (total_ASCII_Value_Of_t - total_ASCII_Value_Of_s);

    }

    public static int find_ASCII_Value(String string) {

        int total_ASCII_Value = 0;
        int index = 0;
        while(index < string.length()){
            total_ASCII_Value = total_ASCII_Value + (int)string.charAt(index);
            index++;
        }
        return total_ASCII_Value;
    }
}
