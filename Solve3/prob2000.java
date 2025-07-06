package LeetCode.Solve3;

public class prob2000 {

    public static void main(String[] args) {

        System.out.println(reversePrefix("shadman", 'm'));

    }

    public static String reversePrefix(String word, char ch) {

        int indexLimitOfReverse = findCharacterIndex(word, ch);
        if(indexLimitOfReverse == (word.length() - 1)){
            return word;
        }
        String reversedPrefix = "";

        for(int index = (indexLimitOfReverse + 1); index >= 0; index--){
            reversedPrefix = reversedPrefix + word.charAt(index);
        }

        for(int index = indexLimitOfReverse + 2; index < word.length(); index++){
            reversedPrefix = reversedPrefix + word.charAt(index);
        }
        return reversedPrefix;
    }

    public static int findCharacterIndex(String word, char ch) {

        int index = 0;
        while (word.charAt(index) != ch ){
            index++;
            if(index == (word.length())){
                return index - 1;
            }
        }

        return index - 1;

    }
}
