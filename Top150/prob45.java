public class prob45 {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{2,3,1,1,4}));
        

    }


    public static int jump(int[] nums) {

        int jump = 0;
        int currentJump = 0;
        int maxJump = 0;

        for (int index = 0; index < nums.length -1; index++) {
            maxJump = Math.max(nums[index] + index, maxJump);

            if (index == currentJump) {
                jump++;
                currentJump = maxJump;
            }

        }


        return jump;
        
    }
}
