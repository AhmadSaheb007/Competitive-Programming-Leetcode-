package LeetCode.Solve2;

public class prob1108 {

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

    public static String defangIPaddr(String address) {

        String returningString = "";
        String[] word = address.split("\\.", 0);

        for(int index = 0; index < word.length; index++){

            if(index == (word.length-1)){
                returningString = returningString + word[index];
            }
            else{
                returningString = returningString + word[index] + "[.]";
            }

        }

        return returningString;

    }
}
