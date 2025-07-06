package LeetCode.Solve3;

public class prob1678 {

    public static void main(String[] args) {

        System.out.println(interpret("G()(al)"));

    }

    public static String interpret(String command) {

        String goalParserBuilder = "";
        for(int index = 0; index < command.length(); index++){

            if((command.charAt(index) == '(') &&
                ((command.charAt(index + 1) == ')'))){
                goalParserBuilder = goalParserBuilder + "o";
            }

            else if(command.charAt(index) == 'G'){
                goalParserBuilder = goalParserBuilder + "G";
            }

            else if((command.charAt(index) == '(') &&
                    (command.charAt(index + 1) == 'a') &&
                    (command.charAt(index + 2) == 'l') &&
                    (command.charAt(index + 3) == ')')) {
                goalParserBuilder = goalParserBuilder + "al";
            }

        }
        return goalParserBuilder;
    }
}
