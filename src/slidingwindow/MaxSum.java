package slidingwindow;

class MaxSum {
    // Returns maximum sum in
    // a subarray of size k.
    // brute force approach
    static int maxSum(int arr[], int n, int k){
        // Initialize result
        int max_sum = Integer.MIN_VALUE;

        // Consider all blocks starting with i.
        for (int i = 0; i < n - k + 1; i++) {
            int current_sum = 0;
            for (int j = 0; j < k; j++)
                current_sum = current_sum + arr[i + j];

            // Update result if required.
            max_sum = Math.max(current_sum, max_sum);
        }

        return max_sum;
    }

    // sliding window approch
    // Returns maximum sum in a subarray of size k using sliding window
    static int maxSum1(int arr[], int n, int k) {
        // Step 1: Compute sum of first k elements
        int window_sum = 0;
        for (int i = 0; i < k; i++) {
            window_sum += arr[i];
        }

        // Initialize max_sum with first window
        int max_sum = window_sum;

        // Step 2: Slide the window from index k to n-1
        for (int i = k; i < n; i++) {
            // remove the element going out of window (arr[i-k])
            // add the new element (arr[i])
            window_sum = window_sum - arr[i - k] + arr[i];
            max_sum = Math.max(max_sum, window_sum);
        }

        return max_sum;
    }


    public static void main(String[] args){
        int arr[] = {5, 2, -1, 0, 3};
        int k = 3;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }
}