package arraygfg;

public class WaveArray {

    // Brute Force Approach
    public static void waveBruteForce(int[] arr) {
        // First sort (though already sorted in problem)
        java.util.Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i += 2) {
            // Swap adjacent
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    // Optimal Approach
    public static void waveOptimal(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            // Swap adjacent
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    // Utility Method to Print Array
    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Brute Force:");
        waveBruteForce(arr1);
        printArray(arr1);  // Output: 2 1 4 3 5

        int[] arr2 = {2, 4, 7, 8, 9, 10};
        System.out.println("Optimal:");
        waveOptimal(arr2);
        printArray(arr2);  // Output: 4 2 8 7 10 9
    }
}
