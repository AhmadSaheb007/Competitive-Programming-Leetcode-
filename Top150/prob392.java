public class prob392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("aer", "iamabeer"));
    }

    public static boolean isSubsequence(String s, String t) {

        // The approach is to use two pointers, one for each string.
        // We iterate through the characters of both strings, comparing them one by one.
        // Pointer one tracks the current character in the subsequence string (s), and pointer 
        // two tracks the current character in the main string (t). If we find of (i) index
        // of string (t) with (j) index of string (s), only that case we will increament the
        // (j) pointer value by 1. If we don't find a matching character, the value of (j) pointer
        // will remain lessb then the lenth of string (s). Finally we wll return the boolean value
        // of (j) pointer, if it is equal to the length of string (s),

        char[] tArray = t.toCharArray(); // Convert the string t to a character array
        char[] sArray = s.toCharArray(); // Convert the string s to a character array
        
        // Initialize two pointers, i for tArray and j for sArray
        // i will iterate through the characters of tArray, and j will iterate through the characters
        int i, j; 

        // of sArray. We will check if the characters at these pointers match.
        // If they do, we move the j pointer to the next character in sArray.
        for (i = 0, j = 0; i < tArray.length && j < sArray.length; i++) {
            if (tArray[i] == sArray[j]) {
                j++;
            }
        }

        // If j is equal to the length of sArray, it means we have found all characters 
        // of s in t in the correct order, so we return true. Otherwise, we return false.
        return j == sArray.length;

    }
}
