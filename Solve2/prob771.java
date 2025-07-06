package LeetCode.Solve2;

public class prob771 {

    public static void main(String[] args) {

        System.out.println(numJewelsInStones("aA", "aAAbbbb"));

    }

    public static int numJewelsInStones(String jewels, String stones) {

        int totalStone = 0;
        for(int indexJ = 0;indexJ < jewels.length();indexJ++ ){
            for(int indexS = 0;indexS < stones.length();indexS++ ){

                if(jewels.charAt(indexJ) == stones.charAt(indexS)){
                    totalStone++;
                }

            }
        }

        return totalStone;

    }
}
