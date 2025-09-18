package arraygfg;

import java.util.*;

public class AlternatePosNegInPlace {
    
    // Right rotate subarray between 'start' and 'end'
    private static void rightRotate(int[] arr, int start, int end) {
        int temp = arr[end];
        for (int i = end; i > start; i--) {
            arr[i] = arr[i - 1];
        }
        arr[start] = temp;
    }
    
    public static void rearrange(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            // Condition: even index → positive, odd index → negative
            if ((i % 2 == 0 && arr[i] < 0) || (i % 2 == 1 && arr[i] >= 0)) {
                
                // Find the next opposite signed element
                int j = i + 1;
                while (j < n && ((i % 2 == 0 && arr[j] < 0) || (i % 2 == 1 && arr[j] >= 0))) {
                    j++;
                }
                
                // If no opposite element found, break
                if (j == n) break;
                
                // Rotate subarray to bring arr[j] at position i
                rightRotate(arr, i, j);
            }
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
