package slidingwindow;

class IncreasingSubarraysBrute {

    // brute force
    public static int countIncreasingBrute(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                boolean increasing = true;

                // Check if arr[i..j] is strictly increasing
                for (int k = i + 1; k <= j; k++) {
                    if (arr[k] <= arr[k - 1]) {
                        increasing = false;
                        break;
                    }
                }

                if (increasing) {
                    count++;
                } else {
                    break; // No need to check longer subarrays
                }
            }
        }
        return count;
    }

    //optimal approcch
    public static int countIncreasing(int[] arr) {
        int n = arr.length;
        int count = 0, len = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                len++;
            } else {
                count += (len * (len - 1)) / 2;
                len = 1;
            }
        }

        // Add last sequence
        count += (len * (len - 1)) / 2;

        return count;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 3, 7, 9};
        System.out.println(countIncreasingBrute(arr1)); // 6

        int[] arr2 = {1, 3, 3, 2, 3, 5};
        System.out.println(countIncreasingBrute(arr2)); // 4

        int[] arr3 = {2, 2, 2, 2};
        System.out.println(countIncreasingBrute(arr3)); // 0
    }
}
