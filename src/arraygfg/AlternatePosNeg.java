package arraygfg;

import java.util.*;

public class AlternatePosNeg {
    public static void rearrange(int[] arr) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();
        
        // Step 1: Split into positives and negatives
        for (int num : arr) {
            if (num >= 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }
        
        // Step 2: Merge alternately
        int i = 0, j = 0, k = 0;
        boolean turnPositive = true; // Start with positive
        
        while (i < positives.size() && j < negatives.size()) {
            if (turnPositive) {
                arr[k++] = positives.get(i++);
            } else {
                arr[k++] = negatives.get(j++);
            }
            turnPositive = !turnPositive;
        }
        
        // Step 3: Add remaining positives
        while (i < positives.size()) {
            arr[k++] = positives.get(i++);
        }
        
        // Step 4: Add remaining negatives
        while (j < negatives.size()) {
            arr[k++] = negatives.get(j++);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, -4, -1, 4};
        rearrange(arr1);
        System.out.println(Arrays.toString(arr1)); // [1, -4, 2, -1, 3, 4]

        int[] arr2 = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        rearrange(arr2);
        System.out.println(Arrays.toString(arr2)); // [5, -5, 2, -2, 4, -8, 7, 1, 8, 0]
    }
}
