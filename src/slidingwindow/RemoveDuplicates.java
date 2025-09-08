package slidingwindow;

class RemoveDuplicates {
    static String removeConsecutive(String s) {
        if (s.length() == 0) return s;
        
        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    // optimal approch
    static String removeConsecutive1(String s) {
        if (s.length() == 0) return s;

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < s.length() - 1) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                result.append(s.charAt(i));
            }
            i++;
        }
        // add the last character always
        result.append(s.charAt(s.length() - 1));

        return result.toString();
    }



    public static void main(String[] args) {
        System.out.println(removeConsecutive("aaaaabbbbbb")); // ab
        System.out.println(removeConsecutive("geeksforgeeks")); // geksforgeks
        System.out.println(removeConsecutive("aabccba")); // abcba
    }
}
