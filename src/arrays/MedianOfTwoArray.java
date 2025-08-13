package arrays;

import java.util.ArrayList;
import java.util.List;

class MedianOfTwoArray {
    public static void main(String[] args) {
      int  a[] = {3, 5, 6, 12, 15}, b[] = {3, 4, 6, 10, 10, 12};
    }

    public double medianOf2(int a[], int b[]) {
        int n = a.length;   // length, not last index
        int m = b.length;
        
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        // Merge two sorted arrays
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                list.add(a[i]);
                i++;
            } else {
                list.add(b[j]);
                j++;
            }
        }

        // Remaining elements of a
        while (i < n) {
            list.add(a[i]);
            i++;
        }

        // Remaining elements of b
        while (j < m) {
            list.add(b[j]);
            j++;
        }

        // Find median
        int size = list.size();
        if (size % 2 == 0) {
            return (list.get(size / 2 - 1) + list.get(size / 2)) / 2.0;
        } else {
            return list.get(size / 2);
        }
    }
}
