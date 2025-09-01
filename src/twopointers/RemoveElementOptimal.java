package twopointers;

class RemoveElementOptimal {
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

    // Optimal function (two pointers)
    public static int removeElement(int[] arr, int ele) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] == ele) {
                arr[i] = arr[n - 1]; // swap with last element
                n--;                 // shrink array size
            } else {
                i++; // move forward only if not equal
            }
        }
        return n; // number of valid elements
    }

    // Helper to print modified array
    public static void printArray(int[] arr, int n) {
        System.out.print("Modified arr[] = [");
        for (int i = 0; i < arr.length; i++) {
            if (i < n) System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
            else System.out.print("_" + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
