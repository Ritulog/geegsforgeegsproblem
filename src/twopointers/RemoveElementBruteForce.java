package twopointers;

class RemoveElementBruteForce {
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 2, 3};
        int ele1 = 3;
        int result1 = removeElement(arr1, ele1);
        System.out.println("Output: " + result1);
        printArray(arr1, result1);

        int[] arr2 = {0, 1, 3, 0, 2, 2, 4, 2};
        int ele2 = 2;
        int result2 = removeElement(arr2, ele2);
        System.out.println("Output: " + result2);
        printArray(arr2, result2);
    }

    // Brute Force function
    public static int removeElement(int[] arr, int ele) {
        int k = 0; // pointer for non-ele elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ele) {
                arr[k] = arr[i]; // copy valid element forward
                k++;
            }
        }
        return k; // number of valid elements
    }

    // Helper to print modified array
    public static void printArray(int[] arr, int k) {
        System.out.print("Modified arr[] = [");
        for (int i = 0; i < arr.length; i++) {
            if (i < k) System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
            else System.out.print("_" + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
