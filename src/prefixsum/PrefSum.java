package prefixsum;

import java.util.ArrayList;

public class PrefSum {

    // function to find the prefix sum array
    public static ArrayList<Integer> prefSum(int[] arr) {
        int n = arr.length;

        // to store the prefix sum
        ArrayList<Integer> prefixSum = new ArrayList<>();

        // initialize the first element
        prefixSum.add(arr[0]);

        // Adding present element with previous element
        for (int i = 1; i < n; i++)
            prefixSum.add(prefixSum.get(i - 1) + arr[i]);

        return prefixSum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 15};
        ArrayList<Integer> prefixSum = prefSum(arr);
        for (int i : prefixSum) {
            System.out.print(i + " ");
        }


        //array
        int[] arr1 = {2, 4, 6, 8, 10};
        int n = arr.length;
        int[] prefix = new int[n];

        prefix[0] = arr1[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr1[i];
        }

        // Subarray sum from index 1 to 3 -> arr[1..3] = 4+6+8=18
        int l = 1, r = 3;
        int subarraySum = prefix[r] - (l > 0 ? prefix[l - 1] : 0);

        System.out.println("Subarray Sum (1 to 3): " + subarraySum);

    }
}