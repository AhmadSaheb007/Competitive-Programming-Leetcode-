package LeetCode.solve5;

public class test {

    public static void main(String[] args) {
        int num = 134;
        int n = 0;
        while (num > 0){
            n = num % 10;
            num = num / 10;

            System.out.println(n);
        }

    }
}
