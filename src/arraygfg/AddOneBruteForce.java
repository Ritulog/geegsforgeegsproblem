package arraygfg;

import java.util.*;

public class AddOneBruteForce {
    public static int[] addOne(int[] digits) {
        // Step 1: Convert array to number
        StringBuilder sb = new StringBuilder();
        for (int d : digits) {
            sb.append(d);
        }
        long number = Long.parseLong(sb.toString()); // ⚠ may overflow for very large input
        
        // Step 2: Add 1
        number += 1;

        // Step 3: Convert back to array
        String result = String.valueOf(number);
        int[] output = new int[result.length()];
        for (int i = 0; i < result.length(); i++) {
            output[i] = result.charAt(i) - '0';
        }
        return output;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4};
        System.out.println(Arrays.toString(addOne(arr1))); // [1, 2, 5]

        int[] arr2 = {9, 9, 9};
        System.out.println(Arrays.toString(addOne(arr2))); // [1, 0, 0, 0]
    }
}
