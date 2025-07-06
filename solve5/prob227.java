package LeetCode.solve5;

import java.util.Stack;

public class prob227 {

    public static void main(String[] args) {

        System.out.println(calculate("1+2*5"));

    }


    public static int calculate(String s) {

        int index = 0;


        Stack<Integer> numberStack = new Stack<>();
        Stack<Character> operationStack = new Stack<>();

        int result = 0;

        while(index < s.length()){

            if((s.charAt(index) == '+') || (s.charAt(index) == '-') ||
               (s.charAt(index) == '*') || (s.charAt(index) == '/')){

                operationStack.push(s.charAt(index));

            }

            else{
                numberStack.push(Integer.parseInt(String.valueOf(s.charAt(index))));
            }

            index++;

        }

        int number1, number2;

        for(int operationIndex = 0; operationIndex < operationStack.size(); operationIndex++){

            if(operationStack.peek() == '+'){
                number1 = numberStack.peek();
                numberStack.pop();
                number2 = numberStack.peek();
                numberStack.pop();
                result = number1 + number2;
                numberStack.push(result);

            }

            else if(operationStack.peek() == '-'){
                number1 = numberStack.peek();
                numberStack.pop();
                number2 = numberStack.peek();
                numberStack.pop();
                result = number1 - number2;
                numberStack.push(result);

            }

            else if(operationStack.peek() == '*'){
                number1 = numberStack.peek();
                numberStack.pop();
                number2 = numberStack.peek();
                numberStack.pop();
                result = number1 * number2;
                numberStack.push(result);

            }

            else if(operationStack.peek() == '/'){
                number1 = numberStack.peek();
                numberStack.pop();
                number2 = numberStack.peek();
                numberStack.pop();
                result = number1 / number2;
                numberStack.push(result);

            }

        }





        return numberStack.peek();

    }
}
