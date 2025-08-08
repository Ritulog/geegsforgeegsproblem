package arrays;

import java.util.*;

public class AlternatePosNeg {

    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();

        // Separate positives and negatives
        for (int num : arr) {
            if (num >= 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }

        arr.clear(); // We’ll rewrite the same ArrayList
        int i = 0, j = 0;
        boolean takePositive = true; // Start with positive

        // Merge positives and negatives alternately
        while (i < positives.size() && j < negatives.size()) {
            if (takePositive) {
                arr.add(positives.get(i++));
            } else {
                arr.add(negatives.get(j++));
            }
            takePositive = !takePositive;
        }

        // Add remaining positives
        while (i < positives.size()) {
            arr.add(positives.get(i++));
        }

        // Add remaining negatives
        while (j < negatives.size()) {
            arr.add(negatives.get(j++));
        }
    }

    public static void main(String[] args) {
        AlternatePosNeg obj = new AlternatePosNeg();

        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(9, 4, -2, -1, 5, 0, -5, -3, 2));
        obj.rearrange(arr1);
        System.out.println(arr1); // [9, -2, 4, -1, 5, -5, 0, -3, 2]

        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(-5, -2, 5, 2, 4, 7, 1, 8, 0, -8));
        obj.rearrange(arr2);
        System.out.println(arr2); // [5, -5, 2, -2, 4, -8, 7, 1, 8, 0]
    }
}
