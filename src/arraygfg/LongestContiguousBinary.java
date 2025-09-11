package arraygfg;

public class LongestContiguousBinary {

    //using brute force
    public static int longestSequence(int[] arr) {
        if (arr.length == 0) return 0;

        int maxLen = 1, currLen = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currLen++;
            } else {
                currLen = 1;
            }
            maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }

     // using brute force
    public static int longestSequence1(int[] arr) {
        if (arr.length == 0) return 0;

        int maxLen = 1, currLen = 1;

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] ^ arr[i - 1]) == 0) { // same bits
                currLen++;
            } else {
                currLen = 1;
            }
            maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 1, 1, 1, 1};
        System.out.println(longestSequence(arr1)); // Output: 4

        int[] arr2 = {0, 0, 1, 0, 1, 0};
        System.out.println(longestSequence(arr2)); // Output: 2

        int[] arr3 = {0, 0, 0, 0};
        System.out.println(longestSequence(arr3)); // Output: 4
    }
}
