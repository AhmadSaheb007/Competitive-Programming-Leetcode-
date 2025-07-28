import java.util.Stack;

public class prob20N {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {

        // Create a stack to hold the expected closing parentheses
        // Use a stack to keep track of the expected closing parentheses
        // Initialize the stack with the expected closing parentheses for each opening parenthesis

        // Example: for "(", we expect ")" to be the closing parenthesis
        // For "{", we expect "}" to be the closing parenthesis, and so on 
        // Use a stack to keep track of the expected closing parentheses
        // If a closing parenthesis is found, check if it matches the expected closing parenthesis
        // If it matches, pop it from the stack; if not, return false
        // If the stack is empty at the end, all parentheses were matched correctly

       Stack<String> parenthesisHolder = new Stack<>(); //parenthesisHolder

        // Loop through the string and check for matching parentheses
        // If a matching pair is found, pop it from the stack . . . . .
        // If no match is found, return false
       for(int index = 0; index < s.length(); index++) {
            // Check if the current character is an opening parenthesis
            // If it is, push the corresponding closing parenthesis onto the stack
            if(s.charAt(index) == '('){
                parenthesisHolder.push(")"); // push the expected closing parenthesis of "(" onto the stack
            }
            else if(s.charAt(index) == '{'){
                parenthesisHolder.push("}"); // push the expected closing parenthesis of "{" onto the stack
            }
            else if(s.charAt(index) == '['){
                parenthesisHolder.push("]"); // push the expected closing parenthesis of "[" onto the stack
            }
            else if(parenthesisHolder.isEmpty() || !parenthesisHolder.pop().equals(String.valueOf(s.charAt(index)))){
                return false; // if the stack is empty or the popped element does not match the current closing parenthesis, return false
            }
        }

       return parenthesisHolder.isEmpty(); //if the stack is empty, all parentheses were matched
    }
}
