package LeetCode.Solve3;

public class prob1945 {

    public static void main(String[] args) {

        System.out.println(getLucky("iiii", 1));

    }

    public static int getLucky(String s, int k) {

        int totalAddedValue = toInteger(s);
        for(int roundCounter = 1; roundCounter < k; roundCounter++){

            totalAddedValue = addDigitsOfNumbers(totalAddedValue);

        }
        return totalAddedValue;
    }

    public static int toInteger(String s) {

        int integerValueOfString = 0;
        int valueAdde;
        for(int index = 0; index < s.length(); index++){

            integerValueOfString = (integerValueOfString + addDigitsOfNumbers((int)(s.charAt(index) - 96)));

        }
        return integerValueOfString;
    }

    public static int addDigitsOfNumbers(int number) {

        int addedValue = 0;
        while (number != 0){
             addedValue = addedValue + (number % 10);
             number = number / 10;
        }
        return addedValue;
    }
}
