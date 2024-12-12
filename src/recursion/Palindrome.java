package recursion;

public class Palindrome {
    private static boolean isPalindrome(String s) {
        return isPalindromeHelper(s, 0, s.length() - 1);
    }

    private static boolean isPalindromeHelper(String s, int l, int r) {
        if (l >= r) {
            return true;
        }

        if (s.charAt(l) == s.charAt(r)) {
            return isPalindromeHelper(s, l + 1, r - 1);
        } else {
            return false;
        }
    }

    private static String reverse(String s){
        StringBuilder sb =new StringBuilder();
        int i = s.length()-1;
        while(i>=0){
            sb.append(s.charAt(i));
            i--;
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        String s= "abcnba";
        boolean palindrome = isPalindrome(s);
        System.out.println(palindrome);

        String reverse = reverse(s);
        boolean b= s.equals(reverse);
        System.out.println(b);
    }
}
