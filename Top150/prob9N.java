public class prob9N {

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));

        
    }

    public static boolean isPalindrome(int x) {

        String str = String.valueOf(x);
        int left = 0;
        int right = str.length() - 1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false; // If characters at left and right indices do not match, return false
            }
            left++;
            right--;

        }

        return true; // Placeholder return value, replace with actual logic
        
    }
    
}
