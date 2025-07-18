public class prob151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
        
    }

    public static String reverseWords(String s) {

        // This method reverses the words in a given string.
        // It splits the string by spaces, reverses the order of the words,
        // and then joins the words back together with spaces in between.


        s = s.trim(); // Remove leading/trailing spaces . . . . . .
        String[] words = s.split("\\s+"); // Split by one or more spaces . . . . . .

        // We will use StringBuilder to efficiently build the new string
        // String newString = ""; then doing newString = newString + word [i] is inefficient. Creating new strings each time is costly.
        // Instead, we will use StringBuilder to append words in reverse order. It will not create new strings each time, rather it will modify the existing one.
        StringBuilder newString = new StringBuilder(); // Use StringBuilder for efficient string manipulation . . . . . .

        // Loop through the words array in reverse order and append to newString
        // We start from the end of the array and go to the beginning.
        for (int i = words.length - 1; i >= 0; i--) {
            newString.append(words[i]);

            // Append a space after each word except the last word . . . . . 
            if (i != 0) {
                newString.append(" ");
            }
        }

        return newString.toString(); // Convert StringBuilder to String and return . . . . . .
    }
}
