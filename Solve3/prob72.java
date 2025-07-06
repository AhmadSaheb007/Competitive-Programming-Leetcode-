package LeetCode.Solve3;

public class prob72 {

    public static void main(String[] args) {

        System.out.println(minDistance("a", "ab"));

    }






    public static int minDistance(String word1, String word2) {

        if(word1.equals("")){
            return word2.length();
        }

        else if(word2.equals("")){
            return word1.length();
        }



        else if(word1.length() == word2.length()){
            return returnDistanceForEqualIndex(word1,word2);
        }


        return returnDistanceForNotEqualIndex(word1,word2);

    }

    public static int returnDistanceForEqualIndex(String word1, String word2){
        int operationCounter = 0;
        int index = 0;

        while(index < word1.length()){

            if(word1.charAt(index) != word2.charAt(index)){
                operationCounter++;
            }
            index++;
        }
        return operationCounter;
    }

    public static int returnDistanceForNotEqualIndex(String word1, String word2){
        int operationCounter = 0;
        int indexOfWord1 = 0;
        int indexOfWord2 = 0;

        int maxLengthWord;
        int minLengthWord;

        if(word1.length() > word2.length()){

            maxLengthWord = word1.length();
            minLengthWord = word2.length();

        }

        else {
            maxLengthWord = word2.length();
            minLengthWord = word1.length();
        }

        while(indexOfWord1 < maxLengthWord){

            while(indexOfWord2 < minLengthWord){

                if(word1.charAt(indexOfWord1) != word2.charAt(indexOfWord2)){
                    operationCounter++;
                }
                indexOfWord2++;

            }
            indexOfWord2 = 0;
            indexOfWord1++;

        }

        return operationCounter;

    }

//    public static int minDistance(String word1, String word2) {
//
//        StringBuilder word1Builder = new StringBuilder(word1);
//        StringBuilder word2Builder = new StringBuilder(word2);
//        int index = 0;
//
//        while(true){
//
//            word1Builder.setCharAt(index, word2.charAt(index));
//            if(word1Builder.equals(word2Builder)){
//                return index;
//            }
//            index++;
//        }
//    }
//




















//    public static int minDistance(String word1, String word2) {
//        int operationCounter = 0;
//        int index = 0;
//
//        while (true){
//            operationCounter++;
//            char c1 = word1.charAt(index);
//            char c2 =  word2.charAt(index);
//            word1.replace(c1, c2);
//            index++;
//            if(word1.equals(word2)){
//                return operationCounter;
//            }
//
//        }
//    }
}
