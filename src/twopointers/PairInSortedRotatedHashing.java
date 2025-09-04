package twopointers;

import java.util.HashSet;

public class PairInSortedRotatedHashing {

    static boolean pairInSortedRotated(int[] arr, int target) {
        // Edge case: array must have at least 2 elements
        if (arr == null || arr.length < 2) {
            return false;
        }

        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            // Calculate complement carefully (to avoid overflow use long)
            long complement = (long) target - num;

            // Check if complement already exists in the set
            if (seen.contains((int) complement)) {
                return true;
            }

            // Add current element to the set
            seen.add(num);
        }

        // If no pair found
        return false;
    }

    public static void main(String[] args) {
        // ✅ Test cases

        // Example 1
        int[] arr1 = {11, 15, 6, 8, 9, 10};
        System.out.println(pairInSortedRotated(arr1, 16)); // true

        // Example 2
        int[] arr2 = {11, 11, 15, 26, 38, 9, 10};
        System.out.println(pairInSortedRotated(arr2, 35)); // true

        // Example 3
        int[] arr3 = {9, 10, 10, 11, 15, 26, 38};
        System.out.println(pairInSortedRotated(arr3, 45)); // false

        // Edge case: Empty array
        int[] arr4 = {};
        System.out.println(pairInSortedRotated(arr4, 10)); // false

        // Edge case: Single element
        int[] arr5 = {5};
        System.out.println(pairInSortedRotated(arr5, 10)); // false

        // Edge case: Duplicate elements
        int[] arr6 = {8, 8};
        System.out.println(pairInSortedRotated(arr6, 16)); // true

        // Edge case: Negative numbers
        int[] arr7 = {-3, 1, 4, 6};
        System.out.println(pairInSortedRotated(arr7, 3)); // true (-3 + 6)

        // Edge case: Large numbers (overflow check)
        int[] arr8 = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        System.out.println(pairInSortedRotated(arr8, -1)); // true
    }
}
