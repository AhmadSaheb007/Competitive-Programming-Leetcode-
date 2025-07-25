public class prob383 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "a"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {


        int indexOfMagazine= 0;
        int indexOfRansomNote= 0;
        for(indexOfMagazine= 0, indexOfRansomNote= 0; indexOfMagazine < magazine.length() && indexOfRansomNote < ransomNote.length(); indexOfMagazine++){
            if(magazine.charAt(indexOfMagazine) == ransomNote.charAt(indexOfRansomNote)) {
                indexOfRansomNote++;
            }
        }
        
        return indexOfRansomNote == ransomNote.length();
    }
}
