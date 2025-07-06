package LeetCode.Solve3;

public class prob1859 {

    public static void main(String[] args) {

        System.out.println(sortSentence("Myself2 Me1 I4 and3"));

    }

    public static String sortSentence(String s) {

        String[] words=s.split(" ");
        String sortedString ="";

        int indexOfWord = 1;
        for(int loopCounter = 0; loopCounter < words.length; loopCounter++){

            int indexOfString = 0;
            while (Integer.parseInt
                  (String.valueOf(words[indexOfString].
                          charAt((words[indexOfString].length()) - 1))) != (indexOfWord)){
                indexOfString++;
            }

            if(indexOfWord == (words.length)){
                sortedString = sortedString +
                        words[indexOfString].
                                replace(String.valueOf(words[indexOfString].
                                        charAt(words[indexOfString].length() - 1)), "");;

            }

           else {
                sortedString = sortedString +
                        words[indexOfString].
                                replace(String.valueOf(words[indexOfString].
                                        charAt(words[indexOfString].length() - 1)), " ");
            }
            indexOfWord++;

        }
        return sortedString;
    }
}
