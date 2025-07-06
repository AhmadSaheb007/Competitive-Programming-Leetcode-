package LeetCode.Solve2;

public class prob2278 {

    public static void main(String[] args) {

        System.out.println(percentageLetter("foobar", 'o'));
        //System.out.println((double)1/3);

    }
    public static int percentageLetter(String s, char letter) {

        int countLetter = 0;

        for(int index = 0; index < s.length(); index++){

            if(s.charAt(index) == letter){
                countLetter++;
            }
        }

        return (int)(((double) countLetter / (s.length())) * 100);


    }
}
