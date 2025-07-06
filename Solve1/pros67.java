package LeetCode.Solve;

public class pros67 {
    public static void main(String[] args) {

        System.out.println(addBinary("101", "100"));

    }

    public static String addBinary(String a, String b) {

        long num1 = Integer.parseInt(a,2);
        long num2 = Integer.parseInt(b,2);

        long addNumbers = num1 + num2;

        String addNumbersToString = Integer.toBinaryString((int)(addNumbers));

        return addNumbersToString;

    }
}
