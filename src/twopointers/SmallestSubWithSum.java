package twopointers;// Java program to find smallest
// subarray with sum greater than x

class SmallestSubWithSum {
  
    // Returns length of smallest subarray 
    // with sum greater than x. If no such 
    // subarray exists, returns 0.
    static int smallestSubWithSum(int x, int[] arr) {
        int n = arr.length;
        int res = Integer.MAX_VALUE;

        // Pick every element as starting point
        for (int i = 0; i < n; i++) {
            int curr = 0;

            for (int j = i; j < n; j++) {
                curr += arr[j];
                
                if (curr > x) {
                    res = Math.min(res, j - i + 1);
                    break;
                }
            }
        }

        // Return 0 if answer does 
        // not exists.
        if (res == Integer.MAX_VALUE) return 0;

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 19};
        int x = 51;

        System.out.println(smallestSubWithSum(x, arr));
    }
}