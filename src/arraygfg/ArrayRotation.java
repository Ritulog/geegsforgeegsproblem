package arraygfg;

public class ArrayRotation {

    // Brute Force O(d*n)
    public static void rotateBruteForce(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // normalize
        for (int i = 0; i < d; i++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }
    }

    // Optimal (Reversal Algorithm) O(n)
    public static void rotateOptimal(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // normalize
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Helper function to reverse part of array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6};

        System.out.println("Brute Force Rotation:");
        rotateBruteForce(arr1, 2);
        printArray(arr1); // Output: 3 4 5 6 1 2

        System.out.println("Optimal Rotation:");
        rotateOptimal(arr2, 2);
        printArray(arr2); // Output: 3 4 5 6 1 2
    }
}
