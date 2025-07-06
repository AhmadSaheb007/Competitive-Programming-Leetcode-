package LeetCode.Solve2;

public class prob1859 {

    public static void main(String[] args) {

        System.out.println(sortSentence("is2 sentence4 This1 a3"));

    }

    public static String sortSentence(String s) {

        String[] word = s.split(" ", 0);

        String returningString = "";

        for(int index = 0; index < word.length; index++){
            int counter = 0;

            while (counter < word[index].length() - 1){

                if(word[counter].lastIndexOf(word[counter]) == index){
                    returningString = returningString + (word[index].substring(0, (word[index].length() - 2)));
                    break;
                }
                counter++;

            }
        }

        return returningString;

    }
}
