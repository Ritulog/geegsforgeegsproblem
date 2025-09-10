package arraygfg;

import java.util.Arrays;

public class SecondLargestOptimized {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) return -1;

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num < first && num > second) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        Arrays.sort(arr); // ascending
        int n = arr.length;

        if (n < 2) {
            System.out.println("Not enough elements");
        } else {
            System.out.println("Third Largest = " + arr[n - 2]);
        }

        System.out.println("Second Largest: " + findSecondLargest(arr));
    }
}
