

public class prob290 {

    public static void main(String[] args) {

        String p = "abua";
        String s = "dol cat cat dog";

        System.out.println(wordPattern(p,s));

    }

    public static boolean wordPattern(String pattern, String s) {

        String revPatten = "";
        String revS = "";
        char valueShifter;

        for(int backIndex = pattern.length() - 1; backIndex >= 0; backIndex--){
            valueShifter = pattern.charAt(backIndex);
            revPatten = revPatten + valueShifter;
        }

        for(int backIndex = s.length() - 1; backIndex >= 0; backIndex--){
            valueShifter = s.charAt(backIndex);
            revS = revS + valueShifter;
        }

        return true;

    }


//    public static boolean wordPattern(String pattern, String s) {
//
//        StringBuffer revPatten = new StringBuffer(pattern);
//        StringBuffer revS = new StringBuffer(s);
//
//        revPatten.reverse();
//        revS.reverse();
//
//
//        if((pattern.equals(String.valueOf(revPatten.reverse())) && (s.equals(String.valueOf(revS.reverse()))))){
//            return true;
//        }
//
//        else
//            return false;
//    }
}
