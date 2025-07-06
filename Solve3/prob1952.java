package LeetCode.Solve3;

public class prob1952 {

    public static void main(String[] args) {

    }

    public boolean isThree(int n) {

        int totalDivisor = 2;
        for(int number = 2; number < n; number++){
            if((n % number) == 0){
                totalDivisor++;
            }
        }

        if(totalDivisor == 3){
            return true;
        }
        return false;
    }
}
