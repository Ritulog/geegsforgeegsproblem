package slidingwindow;

public class MaxSubarraySum {

    static int maxSubarraySum(int[] arr, int target) {
        int n = arr.length;
        int maxSum = 0;

        // check all subarrays
        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = i; j < n; j++) {
                currSum += arr[j];

                // check condition
                if (currSum <= target) {
                    maxSum = Math.max(maxSum, currSum);
                }
            }
        }

        return maxSum;
    }

   // optimal approch

    static int maxSubarraySum1(int[] arr, int target) {
        int n = arr.length;
        int maxSum = 0;
        int currSum = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            currSum += arr[end];

            // shrink window if sum > target
            while (currSum > target && start <= end) {
                currSum -= arr[start];
                start++;
            }

            // update maxSum
            if (currSum <= target) {
                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;
    }



    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int target1 = 11;
        System.out.println(maxSubarraySum(arr1, target1)); // 10

        int[] arr2 = {2, 4, 6, 8, 10};
        int target2 = 7;
        System.out.println(maxSubarraySum(arr2, target2)); // 6
    }
}
