
public class prob125 {

    public static void main(String[] args) {

        System.out.println(isPalindrome("level ii level"));

    }

    /**
     * Given a string, determine if it is a palindrome, considering alphanumeric characters only and ignoring case.
     *
     * @param s the string to check
     * @return true if it is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        // Convert to lowercase using || toLowerCase() ||
        // I use ||replacement:""|| means I want to remove all characters that are not a-z or 0-9
        // Example like spaces, punctuation, etc.
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        for(int frontIndex = 0, behindIndex = s.length()-1; frontIndex < behindIndex; frontIndex++, behindIndex--){
            if(s.charAt(frontIndex) != s.charAt(behindIndex)){
                return false;
            }
        }
        return true;
    }
}
