
public class p {
    public static void main(String[] args) {

        boolean b = isPalindrome(121);
        System.out.println(b);

    }

    public static boolean isPalindrome(int x) {

        String _word = Integer.toString(x);

        int i = 0, lenth = 0;
        while (_word.charAt(i) != '\0')
        {
            i++;
            lenth++;
        }
        int StartIndex = 0;
        int EndIndex = --i;
        boolean _IsPelindrome_ = false;
        for (StartIndex = 0; StartIndex <= lenth/2; EndIndex--)//Can not finding the way of solve
        {
            if (_word.charAt(StartIndex) == _word.charAt(EndIndex))
            {
                StartIndex++;
                _IsPelindrome_ = true;
            }
            else
            {
                _IsPelindrome_ = false;
                break;
            }
        }


        return _IsPelindrome_;

    }
}
