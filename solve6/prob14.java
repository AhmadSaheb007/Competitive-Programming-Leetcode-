import java.util.Arrays;

public class prob14 {
    public static void main(String[] args) {
        String l = longestCommonPrefix(new String[]{"flower","flower","flower","flower"});
        System.out.println(l);
    }

    public static String longestCommonPrefix(String[] strs) {

        // Sorting the array to arrange the array from 
        // the smallest word to longest . . . . . .
        Arrays.sort(strs);

        int firstWordIndex = 0; // getting the first indexed word of given array
        int LastWordIndex = strs.length - 1; // getting the last indexed word of given array
        int indexOfWord = 0; // initializing each word index for firstWordIndex & lastWordIndex word

        for(indexOfWord = 0; indexOfWord < strs[firstWordIndex].length(); indexOfWord++){

            // If the first indexed word's index character !=  last indexed word's character, means 
            // the words have no similar prefix. then it will break the loop and return ""
            if(strs[firstWordIndex].charAt(indexOfWord) != strs[LastWordIndex].charAt(indexOfWord)){
                break;
            }
        }

        // if directly break executes, it will return "" (null)
        // else it will return the string from starting index (zero) to the index,
        // that last matched with first indexed word
        return strs[firstWordIndex].substring(0, indexOfWord);
    }
    
}
