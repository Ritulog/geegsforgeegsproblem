package arrays;

import java.util.*;

public class ZeroSumSubarray {

    public static boolean hasZeroSumSubarray(int[] arr) {
        Set<Integer> prefixSums = new HashSet<>();
        int sum = 0;

        for (int num : arr) {
            sum += num;

            // Check if prefix sum is zero, element is zero, or sum seen before
            if (sum == 0 || num == 0 || prefixSums.contains(sum)) {
                return true;
            }

            prefixSums.add(sum);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 2, -3, 1, 6};
        System.out.println(hasZeroSumSubarray(arr1)); // true

        int[] arr2 = {4, 2, 0, 1, 6};
        System.out.println(hasZeroSumSubarray(arr2)); // true

        int[] arr3 = {1, 2, -1};
        System.out.println(hasZeroSumSubarray(arr3)); // false
    }
}
