package LeetCode.Solve2;

public class prob13 {

    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));



    }

    public static int romanToInt(String s) {

        int convertedResultOfRoman = intConverter(s.charAt(s.length() - 1));

        for(int index = s.length() -1; index > 0; index--){

            if(intConverter(s.charAt(index)) > intConverter(s.charAt(index - 1))){
                convertedResultOfRoman = convertedResultOfRoman - intConverter(s.charAt(index - 1));
            }

            else if(intConverter(s.charAt(index)) <= intConverter(s.charAt(index - 1))){
                convertedResultOfRoman = convertedResultOfRoman + intConverter(s.charAt(index - 1));
            }
        }

        return convertedResultOfRoman;
    }

    public static int intConverter(char alphabet) {

        switch(alphabet) {
            case 'I':
                return 1;

            case 'V':
                return 5;

            case 'X':
                return 10;

            case 'L':
                return 50;

            case 'C':
                return 100;

            case 'D':
                return 500;

            case 'M':
                return 1000;

            default:
                // code block
        }


        return 0;
    }
}
