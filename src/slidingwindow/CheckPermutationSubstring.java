package slidingwindow;

public class CheckPermutationSubstring {


    //BRUTE FORCE
    // Assumes all lowercase letters a-z. Modify if other chars are allowed.
    public static boolean checkPermutationSubstring(String txt, String pat) {
        if (pat.length() > txt.length()) return false;
        int[] patFreq = new int[26];
        int[] winFreq = new int[26];
        int m = pat.length();
        int n = txt.length();
        // build frequency for pattern
        for (int i = 0; i < m; i++) {
            patFreq[pat.charAt(i) - 'a']++;
            winFreq[txt.charAt(i) - 'a']++; // first window
        }
        if (matches(patFreq, winFreq)) return true;
        // slide window
        for (int i = m; i < n; i++) {
            int incoming = txt.charAt(i) - 'a';
            int outgoing = txt.charAt(i - m) - 'a';
            winFreq[incoming]++;
            winFreq[outgoing]--;
            if (matches(patFreq, winFreq)) return true;
        }
        return false;
    }
    private static boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    //sliding window


    // Simple main to demonstrate
    public static void main(String[] args) {
        String txt1 = "oidbcaf";
        String pat1 = "abc";
        System.out.println(checkPermutationSubstring(txt1, pat1)); // true
        String txt2 = "odicf";
        String pat2 = "dc";
        System.out.println(checkPermutationSubstring(txt2, pat2)); // false
       String txt3 = "bcdxabcdy";
        String pat3 = "bcdyabcdx";      System.out.println(checkPermutationSubstring(txt3, pat3)); // true
    }
}
