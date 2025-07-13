public class prob58 {
    
    public static void main(String[] args) {

        String input = "           Hello World, abeer   , 12122       shadman ahsd            ";
        int result = lengthOfLastWord(input);
        System.out.println("Length of last word: " + result); // Output: 5
        
    }


    // This Java method calculates the length of the last word in a given string.
    // It trims the string to remove leading and trailing spaces, then iterates 
    // backwards from the end of the string, counting characters until it encounters
    // a space, effectively giving the length of the last word.

    public static int lengthOfLastWord(String s) {

        String trimmedString = s.trim(); // Remove leading and trailing spaces . . . . . .

        int index = trimmedString.length() - 1; // Getting the last index of the trimmed string . . . .
        int wordLength = 0; // Will need to count the length of the word . . . . . .

        // Move backwards until we find a non-space character,
        // while loop will find ' ' (space), it will terminate the loop . . . . . .
        while (index >= 0 && trimmedString.charAt(index) != ' ') {
            index--; 
            wordLength++; // counting the length of last word until finding a ' ' (space) . . . .
        }

        return wordLength; // Return the length of the last word

    }

    
}
