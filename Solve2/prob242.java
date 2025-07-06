package LeetCode.Solve2;

public class prob242 {

    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {

        int indexS = 0;
        while (s.charAt(indexS) != '0'){

            int indexT = 0;
            while (t.charAt(indexT) != '0'){
                if(s.charAt(indexS) == t.charAt(indexT)){
                    continue;
                }
                indexT++;
            }
            indexS++;
        }

        return true;
    }
}
