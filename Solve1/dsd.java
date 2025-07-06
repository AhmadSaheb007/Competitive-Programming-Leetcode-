

public class dsd {

    public static void main(String[] args) {

        System.out.println(romanToInt("III"));

    }

    public static int romanToInt(String s) {
        
        int total = 0;
        int currentValue = 0;

        for(int index = 0; index < s.length(); index++){

            switch(s.charAt(index)) {
                case 'I':
                    currentValue = 1;
                case 'V':
                    currentValue = 5;
                case 'X':
                    currentValue = 10;
                case 'L':
                    currentValue = 50;
                case 'C':
                    currentValue = 100;
                case 'D':
                    currentValue = 500;
                case 'M':
                    currentValue = 1000;
                default:
                    // code block
            }
            total = total + currentValue;
        }
        

        return total;

    }
}
