package twopointers;

// Java program to find a Pair Sum in a Sorted
// and Rotated Array using Two Pointer Technique
public class PairInSortedRotated2Pointer {

        static boolean pairInSortedRotated(int[] arr, int target) {
            int n = arr.length;

            // Find the pivot element
            int i;
            for (i = 0; i < n - 1; i++)
                if (arr[i] > arr[i + 1])
                    break;

            // l is now index of smallest element
            int l = (i + 1) % n;

            // r is now index of largest element
            int r = i;

            // Keep moving either l or r till they meet
            while (l != r) {

                // If we find a pair with sum target, return true
                if (arr[l] + arr[r] == target)
                    return true;

                // If current pair sum is less, move to higher sum
                if (arr[l] + arr[r] < target)
                    l = (l + 1) % n;

                    // Move to lower sum side
                else
                    r = (r - 1 + n) % n;
            }
            return false;
        }

        public static void main(String[] args) {
            int[] arr = {11, 15, 6, 8, 9, 10};
            int target = 16;
            if (pairInSortedRotated(arr, target))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }

