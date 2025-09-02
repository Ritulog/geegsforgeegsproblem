package twopointers;

import java.util.Arrays;

public class Sort012 {

    //  Naive Approach: Using Arrays.sort()
    static void sortUsingLibrary(int[] arr) {
        Arrays.sort(arr);
    }

    //  Counting Approach
    static void sortUsingCounting(int[] arr) {
        int c0 = 0, c1 = 0, c2 = 0;

        for (int num : arr) {
            if (num == 0) c0++;
            else if (num == 1) c1++;
            else c2++;
        }

        int idx = 0;
        while (c0-- > 0) arr[idx++] = 0;
        while (c1-- > 0) arr[idx++] = 1;
        while (c2-- > 0) arr[idx++] = 2;
    }

    //  Dutch National Flag Algorithm (Optimal)
    static void sortUsingDNF(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    // Helper function to swap
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Helper function to print array
    static void printArray(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        //  Edge Cases to test
        int[][] testCases = {
            {},                          // empty array
            {0},                         // single element
            {2},                         // single element (2)
            {1, 1, 1, 1},                // all 1s
            {0, 0, 0, 0},                // all 0s
            {2, 2, 2, 2},                // all 2s
            {0, 1, 2, 0, 1, 2},          // mixed
            {2, 1, 0, 2, 1, 0},          // reverse order
            {0, 2, 1, 0, 2, 1, 0},       // random
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Test Case " + (i+1));

            // Naive
            int[] arr1 = Arrays.copyOf(testCases[i], testCases[i].length);
            sortUsingLibrary(arr1);
            System.out.print("Naive     : ");
            printArray(arr1);

            // Counting
            int[] arr2 = Arrays.copyOf(testCases[i], testCases[i].length);
            sortUsingCounting(arr2);
            System.out.print("Counting  : ");
            printArray(arr2);

            // Dutch National Flag
            int[] arr3 = Arrays.copyOf(testCases[i], testCases[i].length);
            sortUsingDNF(arr3);
            System.out.print("DNF       : ");
            printArray(arr3);

            System.out.println("-------------------------");
        }
    }
}
