package twopointers;

public class FindPivot {
    static int findPivot(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;

        // Binary Search approach
        while (low <= high) {
            int mid = (low + high) / 2;

            // Case 1: mid is pivot (greater than next element)
            if (mid < n - 1 && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: move to the right half
            if (arr[mid] >= arr[low]) {
                low = mid + 1;
            }
            // Case 3: move to the left half
            else {
                high = mid - 1;
            }
        }
        return -1; // array not rotated (sorted normally)
    }

    public static void main(String[] args) {
        int[] arr = {11, 15, 6, 8, 9, 10};
        int pivotIndex = findPivot(arr);
        if (pivotIndex != -1) {
            System.out.println("Pivot element: " + arr[pivotIndex] + " at index " + pivotIndex);
        } else {
            System.out.println("Array is not rotated, pivot doesn't exist.");
        }
    }
}
