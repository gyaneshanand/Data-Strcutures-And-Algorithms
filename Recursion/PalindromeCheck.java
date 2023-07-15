package recursion;

public class PalindromeCheck {

    static String s;

    static boolean checkPalindrome(int l, int r) {
        if(l>=r)
            return true;
        return (s.charAt(l) == s.charAt(r)) && checkPalindrome(l+1, r-1);
    }

    public static void main(String[] args) {
        s = "aba";
        System.out.println(checkPalindrome(0, s.length()-1));
    }
}
