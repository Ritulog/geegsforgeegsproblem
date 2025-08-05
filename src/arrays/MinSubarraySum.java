package arrays;

class MinSubarraySum {
    public static int minSubarraySum(int[] arr) {
        int minSoFar = arr[0];
        int currMin = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currMin = Math.min(arr[i], currMin + arr[i]);
            minSoFar = Math.min(minSoFar, currMin);
        }

        return minSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {3, -4, 2, -3, -1, 7, -5};
        System.out.println("Minimum Sum Subarray: " + minSubarraySum(arr));  // Output: -6
    }
}
