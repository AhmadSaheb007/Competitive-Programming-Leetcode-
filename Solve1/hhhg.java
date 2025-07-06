
public class hhhg {

    public static void main(String[] args) {

        //System.out.println(addDigits(16263));

        System.out.println(addStrings("121", "11"));

    }

    public static String addStrings(String num1, String num2) {

        int _num1 = Integer.parseInt(num1);
        int _num2 = Integer.parseInt(num2);

        int _sum = _num1 + _num2;

        return Integer.toString(_sum);

    }

    public static int addDigits(int num) {

        int sunOfDigits = 0;
        if((num >= 0) && (num <= 9))
            return num;

        while (num != 0){
            int temp = num % 10;
            sunOfDigits = sunOfDigits + temp;
            num = num/10;
        }
        return addDigits(sunOfDigits);

    }
}
