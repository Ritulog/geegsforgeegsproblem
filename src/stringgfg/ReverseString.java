package stringgfg;

// Optimized Java program to reverse a string using two pointers
class ReverseString {
    static String reverseString(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        // Swap characters from both ends
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "abdcfe";
        String res = reverseString(s);
        System.out.println("Original String: " + s);
        System.out.println("Reversed String: " + res);
    }
}
