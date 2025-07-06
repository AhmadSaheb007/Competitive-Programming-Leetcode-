package LeetCode.Solve3;

public class prob12 {

    public static void main(String[] args) {

        System.out.println(intToRoman(20));

    }

    public static String intToRoman(int num) {

        int[] integerValueHolder = {1000,900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanValueHolder = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String romanStringBuilder = "";

        while(num > 0){
            for(int index = 0; index < integerValueHolder.length; index++){
                if(num >= integerValueHolder[index]){
                    romanStringBuilder = romanStringBuilder + romanValueHolder[index];
                    num = num - integerValueHolder[index];
                    index = -1;
                }
            }
        }
        return romanStringBuilder;
    }
}
