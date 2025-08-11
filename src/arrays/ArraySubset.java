package arrays;

import java.util.Arrays;
import java.util.HashMap;

class ArraySubset {

     static boolean isSubset(int[] a, int[] b) {
        // Iterate over each element in the second array
        int m = a.length;
        int n = b.length;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            // Check if the element exists in the first array
            for (int j = 0; j < m; j++) {
                if (b[i] == a[j]) {
                    found = true;
                    break;
                }
            }
            // If any element is not found, return false
            if (!found) return false;
        }
        // If all elements are found, return true
        return true;
    }


    //2nd approch
    static boolean isSubset1(int a[], int b[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of elements in 'a'
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check each element in 'b'
        for (int num : b) {
            if (map.containsKey(num)) {
                if (map.get(num) == 1) {
                    map.remove(num);
                } else {
                    map.put(num, map.get(num) - 1); // decrement count
                }
            } else {
                return false; // element missing
            }
        }

        return true; // all elements found
    }

//3rd  two poniter approch
static boolean isSubset2(int[] a, int[] b) {
    Arrays.sort(a);
    Arrays.sort(b);

    int i = 0;
    int j = 0;

    // Traverse both arrays using two pointers
    while (i < a.length && j < b.length) {
        if (a[i] < b[j]) {
            // Element in a is smaller, move to the next element in a
            i++;
        } else if (a[i] == b[j]) {
            // Element found in both arrays, move to the next element in both arrays
            i++;
            j++;
        } else {
            // Element in b not found in a, not a subset
            return false;
        }
    }

    // If we have traversed all elements in b, it is a subset
    return j == b.length;
}



    public static void main(String[] args) {
        int[] a = {11, 1, 13, 21, 3, 7};
        int[] b = {11, 3, 7, 1};

        if (isSubset1(a, b)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}