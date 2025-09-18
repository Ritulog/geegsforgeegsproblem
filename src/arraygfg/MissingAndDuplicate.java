package arraygfg;

public class MissingAndDuplicate {
    public static void findNumbers(int[] arr) {
        int n = arr.length;
        int duplicate = -1, missing = -1;

        // Check each number from 1 to n
        for (int i = 1; i <= n; i++) {
            int count = 0;
            // Count frequency of i
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }
            // If found twice -> duplicate
            if (count == 2) {
                duplicate = i;
            }
            // If not found -> missing
            else if (count == 0) {
                missing = i;
            }
        }

        System.out.println("Duplicate: " + duplicate + ", Missing: " + missing);
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 3};
        findNumbers(arr1);  // Output: Duplicate: 3, Missing: 2

        int[] arr2 = {4, 3, 6, 2, 1, 1};
        findNumbers(arr2);  // Output: Duplicate: 1, Missing: 5
    }
}
