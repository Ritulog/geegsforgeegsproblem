package twopointers;

import java.util.ArrayList;

class RemoveDuplicatesList {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        
        if (arr.length == 0) return result; // handle empty array case
        
        result.add(arr[0]); // first element always included
        
        for (int i = 1; i < arr.length; i++) {
            // add only if current element is different from previous
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        RemoveDuplicatesList sol = new RemoveDuplicatesList();
        
        int[] arr1 = {2, 2, 2, 2, 2};
        System.out.println(sol.removeDuplicates(arr1)); // [2]
        
        int[] arr2 = {1, 2, 4};
        System.out.println(sol.removeDuplicates(arr2)); // [1, 2, 4]
        
        int[] arr3 = {1, 1, 2, 3, 3, 4};
        System.out.println(sol.removeDuplicates(arr3)); // [1, 2, 3, 4]
    }
}
