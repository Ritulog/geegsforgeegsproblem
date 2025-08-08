package arrays;

import java.util.*;

public class UniqueZeroSumPairs {

    public static ArrayList<ArrayList<Integer>> findPairs(int[] arr) {
        Arrays.sort(arr); // Step 1: Sort the array
        int left = 0, right = arr.length - 1;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == 0) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                result.add(pair);

                // Skip duplicates for left
                int leftVal = arr[left];
                while (left < right && arr[left] == leftVal) {
                    left++;
                }

                // Skip duplicates for right
                int rightVal = arr[right];
                while (left < right && arr[right] == rightVal) {
                    right--;
                }

            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {-1, 0, 1, 2, -1, -4};
        int[] arr2 = {6, 1, 8, 0, 4, -9, -1, -10, -6, -5};

        System.out.println(findPairs(arr1)); // [[-1, 1]]
        System.out.println(findPairs(arr2)); // [[-6, 6], [-1, 1]]
    }
}
/*
How It Works
Sorting: Arrays.sort() makes it easy to use the two-pointer approach.

Two Pointers:

If sum == 0 → store the pair and skip duplicates.

If sum < 0 → move left pointer to increase sum.

If sum > 0 → move right pointer to decrease sum.

Skipping Duplicates:

After adding a pair, move both pointers past any same values to avoid repeated pairs.

This will:

Return unique zero-sum pairs.

Keep pairs sorted internally.

Return result sorted in ascending order.

Run in O(n log n) time.

Return type is now ArrayList<ArrayList<Integer>>.

Used new ArrayList<>() explicitly for storing each pair.

*/