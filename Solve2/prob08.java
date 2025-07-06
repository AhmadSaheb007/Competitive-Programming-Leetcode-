package LeetCode.Solve2;

public class prob08 {

    public static void main(String[] args) {

        System.out.println(multiply("123456789" ,"987654321"));

    }

    public static String multiply(String num1, String num2) {

        return String.valueOf(Long.parseLong(num1) * Long.parseLong(num2));


    }
}
