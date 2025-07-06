package LeetCode.solve5;

import java.util.Stack;

public class prob20 {


    public static void main(String[] args) {

        System.out.println(isValid("({[)"));

    }


    public static boolean isValid(String s) {

        /*
           In this case we will use stack data structure.

        */


        int index = 0;
        Stack<Character> parenthesesStack = new Stack<Character>();

        while (index != s.length()){

            if(parenthesesStack.isEmpty()){
                parenthesesStack.push(s.charAt(index));
            }

            else if(((parenthesesStack.peek() == '(') && (s.charAt(index) == ')')) ||
                    ((parenthesesStack.peek() == '{') && (s.charAt(index) == '}')) ||
                    ((parenthesesStack.peek() == '[') && (s.charAt(index) == ']'))) {

                parenthesesStack.pop();

            }
            else {
                parenthesesStack.push(s.charAt(index));
            }

            index++;

        }

        return parenthesesStack.isEmpty();

    }
}
