package string;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "abba";
        String s1 = "abc";
        System.out.println(isPalindrome(s1));
    }
  static  boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
