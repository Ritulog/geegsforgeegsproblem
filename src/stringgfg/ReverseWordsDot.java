package stringgfg;

import java.util.*;

public class ReverseWordsDot {
    public static String reverseWords(String s) {
        // Step 1: Trim leading & trailing dots
        s = s.replaceAll("^\\.+|\\.+$", "");

        // Step 2: Split by dot
        String[] parts = s.split("\\.");

        // Step 3: Collect non-empty words
        List<String> words = new ArrayList<>();
        for (String word : parts) {
            if (!word.isEmpty()) {
                words.add(word);
            }
        }

        // Step 4: Reverse words
        Collections.reverse(words);

        // Step 5: Join with dot
        return String.join(".", words);
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
