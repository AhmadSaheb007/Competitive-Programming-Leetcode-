

import java.util.Stack;

public class prob20 {

    public static void main(String[] args) {

        System.out.println(isValid("()[]{}"));

    }

    public static boolean isValid(String s) {

        Stack<Character> parenthesisHolder = new Stack<>();

        for (int index = 0; index < s.length(); index++){

            if((s.charAt(index) == '(') || (s.charAt(index) == '{') || (s.charAt(index) == '[')){
                parenthesisHolder.push(s.charAt(index));
            }
            else if(parenthesisHolder.isEmpty()){
                return false;
            }
            else if(((parenthesisHolder.peek() == '(') && (s.charAt(index) == ')'))||
                    ((parenthesisHolder.peek() == '{') && (s.charAt(index) == '}'))||
                    ((parenthesisHolder.peek() == '[') && (s.charAt(index) == ']'))){
                parenthesisHolder.pop();
            }
            else {
                parenthesisHolder.push(s.charAt(index));
            }


        }



        return parenthesisHolder.isEmpty();

    }


//    public static boolean isValid(String s) {
//
//        Stack<Character> parenthesisHolder = new Stack<>();
//
//        for (int index = 0; index < s.length(); index++){
//
//            if(parenthesisHolder.empty()){
//                parenthesisHolder.push(s.charAt(index));
//
//            }
//            else{
//
//                if((s.charAt(index) == '(') || (s.charAt(index) == '{') || (s.charAt(index) == '[')){
//                    parenthesisHolder.push(s.charAt(index));
//                }
//                else if(((parenthesisHolder.peek() == '(') && (s.charAt(index) == ')'))||
//                        ((parenthesisHolder.peek() == '{') && (s.charAt(index) == '}'))||
//                        ((parenthesisHolder.peek() == '[') && (s.charAt(index) == ']'))){
//                    parenthesisHolder.pop();
//                }
//
//            }
//
//        }
//
//
//
//        return parenthesisHolder.isEmpty();
//
//    }
}


