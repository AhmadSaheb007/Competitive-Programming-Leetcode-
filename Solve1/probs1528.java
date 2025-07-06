package LeetCode.Solve;

public class probs1528 {

    public static void main(String[] args) {

        String s = "codeleet";
        int[] n = {4,5,6,7,0,2,1,3};

        System.out.println(restoreString(s,n));

    }

    public static String restoreString(String s, int[] indices) {

        char[] resotredString = new char[indices.length];

        for(int index = 0; index < indices.length; index++){
            resotredString[indices[index]] = s.charAt(index);
        }

        return String.valueOf(resotredString);

    }

}
