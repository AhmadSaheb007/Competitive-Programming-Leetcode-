package LeetCode.solve4;

import java.util.Arrays;

public class prob796 {

    public static void main(String[] args) {

        System.out.println(rotateString("abeer", "eerab"));

    }

    public static boolean rotateString(String s, String goal) {

        // converting String to char array to get index position . . . . .
        char[] goalInCharArray = goal.toCharArray();

        // Shifting position increasing shifting range . . . . . .
        for(int positionReplaceDefiner = 1; positionReplaceDefiner <= s.length(); positionReplaceDefiner++){

            // Sending charArray(Converted from a string) to "rotateCharArray" function to rotate charArray . . . ..
            String rotatedString = rotateCharArray(goalInCharArray, positionReplaceDefiner);
            if(rotatedString.equals(s)){
                return true;
            }
        }
        return false;
    }

    //Position shifting function of a String converted into charArray . . . . . .
    public static String rotateCharArray(char[] stringInChar, int k) {

        //Created new char Array to store rotated CharArray . . . . .
        char[] rotatedStringInChar = new char[stringInChar.length];
        int rotationRange = k;
        int arraySize = stringInChar.length;

        /*Changing index position to shift charArray . . . . .
          And storing into "rotatedStringInChar"
        */
        for(int index = 0; index < rotatedStringInChar.length; index++){
            rotatedStringInChar[(index + rotationRange) % (arraySize)] = stringInChar[index];
        }
        return new String(rotatedStringInChar);
    }
}
