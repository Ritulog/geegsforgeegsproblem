package string;

class LongestPalindrome {
    public static void main(String[] args) {
      String  s = "forgeeksskeegfor";
      System.out.println(longestPalindrome(s));
    }
    static String longestPalindrome(String s) {
        // code here
         int n = s.length();
        int[][] dp = new int[n][n];
        String ans = "";
        int maxLength = 0;

        for (int diff = 0; diff < n; diff++) {
            for (int i = 0, j = i + diff; j < n; i++, j++) {
                if (i == j) {
                    dp[i][j] = 1;  // single char is palindrome
                } else if (diff == 1) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j)) ? 2 : 0;
                } else {
                    if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] > 0) {
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    }
                }

                // Update answer if palindrome found
                if (dp[i][j] > 0) {
                    //"aba"
                    // 0  2
                    // 2-0+1=3
                    if (j - i + 1 > maxLength) {
                        maxLength = j - i + 1;
                        ans = s.substring(i, j + 1);
                    }
                }
            }
        }
        return ans;
    }
}