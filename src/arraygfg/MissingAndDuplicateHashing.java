package arraygfg;

public class MissingAndDuplicateHashing {
    public static void findNumbers(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n + 1]; // index 1..n

        for (int num : arr) {
            freq[num]++;
        }

        int duplicate = -1, missing = -1;
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) duplicate = i;
            if (freq[i] == 0) missing = i;
        }

        System.out.println("Duplicate: " + duplicate + ", Missing: " + missing);
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 3};
        findNumbers(arr1);  // Duplicate: 3, Missing: 2

        int[] arr2 = {4, 3, 6, 2, 1, 1};
        findNumbers(arr2);  // Duplicate: 1, Missing: 5
    }
}
