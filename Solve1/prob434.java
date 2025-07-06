package LeetCode.Solve;

public class prob434 {

    public static void main(String[] args) {

        int i = countSegments(", , , ,        a, eaefa");

        System.out.println();

    }

    public static int countSegments(String s) {

        String[] word;

        if(s.equals("")){
            return 0;
        }
        else{
            word = s.split(" ", 0);
        }
        int index = 0;
        int count = 0;
        while (index < word.length){
            if(word[index] != ""){
                count++;
            }
            index++;
        }

        return count;

    }

//    public static boolean isValidWord(String word){
//
//        int index = 0;
//        while (index < word.length()){
//            if(word.)
//        }
//    }
}
