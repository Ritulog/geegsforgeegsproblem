package string;

import java.util.Arrays;

class ReverseStringTwoPointer {

    public static void main(String[] args) {
      char[]  s = {'h','e','l','l','o'};
      char[] rev = reverseString(s);
      System.out.println(Arrays.toString(rev));

    }
    static  char[]  reverseString(char[] s) {
         int left = 0;
        int right = s.length -1;
        
        while (left < right) {
            // Swap characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            left++;
            right--;
        }
        return s;
    }
}