package arraygfg;

import java.util.*;

public class AddOneOptimal {
    public static int[] addOne(int[] digits) {
        int n = digits.length;

        // Traverse from last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  // Just add 1
                return digits; // Done, no carry
            }
            digits[i] = 0; // Set to 0 and carry 1 to next digit
        }

        // If all digits were 9 (like [9,9,9]), we need extra digit
        int[] result = new int[n + 1];
        result[0] = 1; // e.g. [1,0,0,0]
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4};
        System.out.println(Arrays.toString(addOne(arr1))); // [1, 2, 5]

        int[] arr2 = {9, 9, 9};
        System.out.println(Arrays.toString(addOne(arr2))); // [1, 0, 0, 0]
    }
}
