package arraygfg;

public class ReverseInGroups {

    // ---------- Brute Force Approach ----------
    public static void reverseInGroupsBrute(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n; i += k) {
            int end = Math.min(i + k, n);
            int[] temp = new int[end - i];

            // Copy to temp
            for (int j = 0; j < temp.length; j++) {
                temp[j] = arr[i + j];
            }

            // Reverse temp back into arr
            for (int j = 0; j < temp.length; j++) {
                arr[i + j] = temp[temp.length - 1 - j];
            }
        }
    }

    // ---------- Optimal In-place Approach ----------
    public static void reverseInGroupsOptimal(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            while (left < right) {
                // Swap arr[left] and arr[right]
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }

    // ---------- Utility to print array ----------
    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // ---------- Main Method for Testing ----------
    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int k1 = 3;

        int[] bruteArr1 = arr1.clone();
        reverseInGroupsBrute(bruteArr1, k1);
        System.out.print("Brute Force Result: ");
        printArray(bruteArr1);

        int[] optArr1 = arr1.clone();
        reverseInGroupsOptimal(optArr1, k1);
        System.out.print("Optimal Result:     ");
        printArray(optArr1);

        System.out.println();

        // Example 2
        int[] arr2 = {1, 2, 3, 4, 5};
        int k2 = 3;

        int[] bruteArr2 = arr2.clone();
        reverseInGroupsBrute(bruteArr2, k2);
        System.out.print("Brute Force Result: ");
        printArray(bruteArr2);

        int[] optArr2 = arr2.clone();
        reverseInGroupsOptimal(optArr2, k2);
        System.out.print("Optimal Result:     ");
        printArray(optArr2);

        System.out.println();

        // Example 3 (k > n)
        int[] arr3 = {5, 6, 8, 9};
        int k3 = 5;

        int[] bruteArr3 = arr3.clone();
        reverseInGroupsBrute(bruteArr3, k3);
        System.out.print("Brute Force Result: ");
        printArray(bruteArr3);

        int[] optArr3 = arr3.clone();
        reverseInGroupsOptimal(optArr3, k3);
        System.out.print("Optimal Result:     ");
        printArray(optArr3);
    }
}
