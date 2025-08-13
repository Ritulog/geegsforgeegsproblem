package arrays;

import java.util.*;

class FindMedian {
    public static double median(int[] arr) {
        Arrays.sort(arr); // Step 1: Sort the array
        int n = arr.length;

        if (n % 2 != 0) {
            // Odd length → middle element
            return arr[n / 2];
        } else {
            // Even length → average of two middle elements
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int arr1[] = {90, 100, 78, 89, 67};
        System.out.println(median(arr1)); // 89.0

        int arr2[] = {56, 67, 30, 79};
        System.out.println(median(arr2)); // 61.5

        int arr3[] = {1, 2};
        System.out.println(median(arr3)); // 1.5
    }
}
