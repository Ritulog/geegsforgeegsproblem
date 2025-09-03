package twopointers;

import java.util.Arrays;
import java.util.HashSet;

public class TwoSumPair {

    //Brute force approch
    static boolean twoSum(int[] arr, int target){
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            // For each element arr[i], check every
            // other element arr[j] that comes after it
            for (int j = i + 1; j < n; j++) {

                // Check if the sum of the current pair
                // equals the target
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }

        // If no pair is found after checking
        // all possibilities
        return false;
    }

    //Two Sum
    static boolean twoSum1(int[] arr, int target){

        Arrays.sort(arr);

        int left = 0, right = arr.length - 1;

        // Iterate while left pointer is less than right
        while (left < right) {
            int sum = arr[left] + arr[right];

            // Check if the sum matches the target
            if (sum == target)
                return true;
            else if (sum < target)

                // Move left pointer to the right
                left++;
            else

                // Move right pointer to the left
                right--;
        }
        // If no pair is found
        return false;
    }

    // Hashing technique
    static boolean twoSum2(int[] arr, int target){

        // Create a HashSet to store the elements
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            // Calculate the complement that added to
            // arr[i], equals the target
            int complement = target - arr[i];

            // Check if the complement exists in the set
            if (set.contains(complement)) {
                return true;
            }

            // Add the current element to the set
            set.add(arr[i]);
        }
        // If no pair is found
        return false;
    }


    public static void main(String[] args){

        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;

        if (twoSum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }

}
