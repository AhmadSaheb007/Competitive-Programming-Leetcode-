
public class prob507 {

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(6));
    }

    public static boolean checkPerfectNumber(int num) {

        int addDivider = 0;

        if(num == 1){
            return false;
        }
        for(int divider = 1; divider <= (num/2); divider++){
            if(num % divider == 0){
                addDivider = addDivider + divider;
            }
        }

        if(addDivider == num){
            return true;
        }
        else
            return false;

    }
}
