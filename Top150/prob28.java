public class prob28 {

    public static void main(String[] args) {

        // Test cases for strStr function
        System.out.println(strStr("a", "a")); // Expected output: 2
        
    }

    public static int strStr(String haystack, String needle) {

        // This function implements the strStr() function which finds the first occurrence of a substring (needle) in a string (haystack).
        // If the substring is found, it returns the index of the first occurrence.
        // If the substring is not found, it returns -1.
        // If needle is an empty string, it returns 0.

        // To solve this problem, we will use a Sliding Window approach.
        // We will slide the window over the haystack and check for the needle at each position.
        // If we find a match, we return the index of the first character of the match.


        //If the needle string lenth > haystack string length, we return -1
        // Because needle cannot be found in haystack if it is longer than haystack.
        if(needle.length() > haystack.length()) {
            return -1; // If needle is longer than haystack, return -1
        }

        int indexHaystack = 0; // Initialize the index for haystack
        int indexNeedle = 0; // Initialize the index for needle

        // Now, we will iterate through the haystack string and check for the needle string.
        for(indexHaystack = 0; indexHaystack <= haystack.length() - needle.length(); indexHaystack++) {

            // We will check if the current character in haystack matches the first character of needle.
            if((haystack.charAt(indexHaystack) == needle.charAt(indexNeedle))) {

                // If the first character matches, we will check the rest of the characters in needle.
                // We will use a substring to check if the substring of haystack matches the needle.
                // We will check the substring of haystack starting from indexHaystack and of length equal to needle length.
                if((haystack.substring(indexHaystack, indexHaystack + needle.length()).equals(needle))) {
                    return indexHaystack; // If the substring matches the needle, return the index
                }
            }

        }
        
        return -1; // If we reach here, it means we did not find the needle in the haystack.
    }
    
}
