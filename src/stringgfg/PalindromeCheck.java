package stringgfg;

public class PalindromeCheck {

    // brute force approch
    public static int isPalindrome1(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed) ? 1 : 0;
    }

    // two pointer
    public static int isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return 0; // Not a palindrome
            }
            left++;
            right--;
        }
        return 1; // Palindrome
    }

    public static void main(String[] args) {
        String s1 = "abba";
        String s2 = "abc";
        
        System.out.println(isPalindrome(s1)); // Output: 1
        System.out.println(isPalindrome(s2)); // Output: 0
    }
}
