package arrays;

import java.util.*;

public class CommonElementsThreeLists {

    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2, List<Integer> arr3) {
        int i = 0, j = 0, k = 0;
        List<Integer> result = new ArrayList<>();

        while (i < arr1.size() && j < arr2.size() && k < arr3.size()) {
            
            int a = arr1.get(i);
            int b = arr2.get(j);
            int c = arr3.get(k);

            // If all are equal
            if (a == b && b == c) {
                if (result.isEmpty() || !result.get(result.size() - 1).equals(a)) {
                    result.add(a);
                }
                // Skip duplicates in arr1
                while (i < arr1.size() && arr1.get(i) == a) i++;
                // Skip duplicates in arr2
                while (j < arr2.size() && arr2.get(j) == b) j++;
                // Skip duplicates in arr3
                while (k < arr3.size() && arr3.get(k) == c) k++;
            }
            // Move smallest pointer
            else if (a < b) {
                i++;
            } else if (b < c) {
                j++;
            } else {
                k++;
            }
        }

        return result.isEmpty() ? Arrays.asList(-1) : result;
    }

    public static void main(String[] args) {
        CommonElementsThreeLists obj = new CommonElementsThreeLists();

        List<Integer> arr1 = Arrays.asList(1, 5, 10, 20, 40, 80);
        List<Integer> arr2 = Arrays.asList(6, 7, 20, 80, 100);
        List<Integer> arr3 = Arrays.asList(3, 4, 15, 20, 30, 70, 80, 120);
        System.out.println(obj.commonElements(arr1, arr2, arr3)); // [20, 80]

        List<Integer> arr4 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> arr5 = Arrays.asList(6, 7);
        List<Integer> arr6 = Arrays.asList(8, 9, 10);
        System.out.println(obj.commonElements(arr4, arr5, arr6)); // [-1]

        List<Integer> arr7 = Arrays.asList(1, 1, 1, 2, 2, 2);
        List<Integer> arr8 = Arrays.asList(1, 1, 2, 2, 2);
        List<Integer> arr9 = Arrays.asList(1, 1, 1, 1, 2, 2, 2, 2);
        System.out.println(obj.commonElements(arr7, arr8, arr9)); // [1, 2]
    }
}
