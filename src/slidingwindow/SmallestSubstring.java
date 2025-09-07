package slidingwindow;

class SmallestSubstring {

    // Function to find the length of the smallest substring containing 0,1,2
    public static int smallestSubstring(String S) {
        int res = Integer.MAX_VALUE;

        // To check 0, 1 and 2
        boolean zero = false, one = false, two = false;

        // To store indexes of 0, 1 and 2
        int zeroindex = 0, oneindex = 0, twoindex = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                zero = true;
                zeroindex = i;
            } else if (S.charAt(i) == '1') {
                one = true;
                oneindex = i;
            } else if (S.charAt(i) == '2') {
                two = true;
                twoindex = i;
            }

            // Check only if all found
            if (zero && one && two) {
                int maxIndex = Math.max(zeroindex, Math.max(oneindex, twoindex));
                int minIndex = Math.min(zeroindex, Math.min(oneindex, twoindex));
                res = Math.min(res, maxIndex - minIndex + 1);
            }
        }

        // If no valid substring exists
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }


    // Function to find smallest substring containing 0,1,2
    public static int smallestSubstring1(String S) {
        int n = S.length();
        int[] count = new int[3]; // count[0], count[1], count[2]
        int left = 0, res = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            count[S.charAt(right) - '0']++;

            // If we have all 0,1,2 → try to shrink window
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                res = Math.min(res, right - left + 1);
                count[S.charAt(left) - '0']--;
                left++;
            }
        }

        return (res == Integer.MAX_VALUE) ? -1 : res;
    }

    public static void main(String[] args) {
        String S = "01212";
        System.out.println(smallestSubstring(S)); // Output: 3
    }
}
