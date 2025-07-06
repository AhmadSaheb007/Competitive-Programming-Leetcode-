package LeetCode.Solve3;

public class prob14 {

    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[]{"abeer", "abre", "abber"}));

    }

    public static String longestCommonPrefix(String[] strs) {

        int index = 0;
        String commonPrefix = "";
        while (index < strs[index].length()){

            if (findLongestCommonPrefix(strs, strs[index], 0)){
                commonPrefix = commonPrefix + strs[index].charAt(0);
            }

        }

        return null;

    }

    public static boolean findLongestCommonPrefix(String[] strs,String word, int index1){

        int index = index1;
        if(strs[index].charAt(0) == strs[index + 1].charAt(0)){
            index++;
            if(index < strs.length){
                return findLongestCommonPrefix(strs, strs[index + 1], index);
            }

        }

        return false;

    }
}
