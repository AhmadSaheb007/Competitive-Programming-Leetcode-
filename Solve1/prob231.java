
public class prob231 {

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(-17));

    }

    public static boolean isPowerOfTwo(int n) {

        int power = 0;

        while(true){
            if(Math.pow(4, power) == n){
                return true;
            }
            else if(Math.pow(4, power) > n){
                break;
            }
            power++;
        }

        return false;

    }
}
