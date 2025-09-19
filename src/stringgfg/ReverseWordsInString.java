package stringgfg;

public class ReverseWordsInString {
    public static String reverseWords(String s) {
        // Step 1: Trim leading & trailing dots
        s = s.replaceAll("^\\.+|\\.+$", "");
        int n = s.length();
        int i = n - 1, j = n - 1;

        StringBuilder result = new StringBuilder();

        while (i >= 0) {
            // Skip dots
            while (i >= 0 && s.charAt(i) == '.') {
                i--;
            }
            if (i < 0) break;

            j = i;
            // Move left until dot or start
            while (i >= 0 && s.charAt(i) != '.') {
                i--;
            }

            // Extract word [i+1..j]
            if (result.length() > 0) result.append(".");
            result.append(s.substring(i + 1, j + 1));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("i.like.this.program.very.much")); 
        // much.very.program.this.like.i

        System.out.println(reverseWords("..geeks..for.geeks.")); 
        // geeks.for.geeks

        System.out.println(reverseWords("...home......")); 
        // home
    }
}
