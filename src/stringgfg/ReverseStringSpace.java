package stringgfg;

// Java program to reverse a string using backward traversal
class ReverseStringSpace {
    // Function to reverse a string
    static String reverseString(String s) {
        StringBuilder res = new StringBuilder();

        // Traverse on s in backward direction
        for (int i = s.length() - 1; i >= 0; i--) {
            res.append(s.charAt(i));
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s = "abdcfe";
        String res = reverseString(s);
        System.out.println("Original String: " + s);
        System.out.println("Reversed String: " + res);
    }
}
