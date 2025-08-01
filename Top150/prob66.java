public class prob66 {
    public static void main(String[] args) {
        
    }

    public static int[] plusOne(int[] digits) {

        // This function takes an array of digits representing a non-negative integer and adds one to the integer.
        // To solve this problem we will use, Reverse Iteration approach.
        // The idea is to start from the last digit and move towards the first digit, adding one to the last digit.
        // If the last digit becomes 10, we set it to 0 and carry over the 1 to the next digit.
        // We continue this process until we either run out of digits or there is no carry left.

        // If the last digit is 9, we will replace it with 0.
        // If all digits are 9, we will create a new array with an extra digit (1) at the start.

        int firstIndex = 0; // Initialize the first index
        int lastIndex = digits.length - 1;

        // Check if the last digit is less than 9, simple add 1 to last index and return the array
        if (digits[lastIndex] < 9) {
            digits[lastIndex] += 1; // If the last digit is less than 9, simply increment it
            return digits;
        }

        // If the last digit is less than 9, we can simply increment it and return the array.
        // If the last digit is 9, we will replace it with 0. 
        for(int index = lastIndex; index >= 0; index--){

            if(digits[index] < 9){
                digits[index] = digits[index] + 1; // If the digit is less than 9, increment it and return the array
                return digits; // Terminate the loop and return the array
            }
            digits[index] = 0; // If the digit is 9, set it to 0 and continue to the next digit
        }

        // If we reach here, it means all digits were 9, so we need to create a new array with an extra digit (1)
        int[] newDigits = new int[digits.length + 1]; // If all digits are 9, create a new array with an extra digit
        newDigits[firstIndex] = 1; // Set the first digit to 1


        return newDigits; // Return the new array with the incremented value
        
    }
}
