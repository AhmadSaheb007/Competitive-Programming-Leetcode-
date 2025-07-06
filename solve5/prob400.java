package LeetCode.solve5;

import java.util.Arrays;

public class prob400 {

    public static void main(String[] args) {

        System.out.println(findNthDigit(11));

    }

    public static int findNthDigit(int n) {

        int indexCounter = 1;
        int numberSerial = 1;
        int indexedDigit = 0;

        while (indexCounter <= n){

            if(numberSerial <= 9){
                indexedDigit =  numberSerial;
                indexCounter++;
            }
            else{
                String numberString = Integer.toString(numberSerial);
                int index = 0;
                while (index < numberString.length()){
                    indexedDigit = numberString.charAt(index) - 48;
                    if(indexCounter == n){
                        return indexedDigit;
                    }
                    indexCounter++;
                    index++;
                }
            }
            numberSerial++;

        }

        return indexedDigit;

    }
}
