package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };

        reverseArray(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");

        // inbuilt function
        List<Integer> arr1 =
                new ArrayList<>(Arrays.asList(1, 4, 3, 2, 6, 5));

        reverseArray(arr1);

        for (int i = 0; i < arr1.size(); i++)
            System.out.print(arr1.get(i) + " ");
    }

    // Using a temporary array - O(n) Time and O(n) Space
    static void reverseArray(int[] arr){
      int n = arr.length;

      // Temporary array to store elements in reversed order
      int[] temp = new int[n];

      // Copy elements from original array to temp in reverse order
      for (int i = 0; i < n; i++)
          temp[i] = arr[n - i - 1];

      // Copy elements back to original array
      for (int i = 0; i < n; i++)
          arr[i] = temp[i];
  }

  //Using Two Pointers - O(n) Time and O(1) Space
  static void reverseArray2(int[] arr) {

      // Initialize left to the beginning and right to the end
      int left = 0;
      int right = arr.length - 1;

      // Iterate till left is less than right
      while (left < right) {

          // Swap the elements at left and right position
          int temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;

          // Increment the left pointer
          left++;

          // Decrement the right pointer
          right--;
      }
  }

  //By Swapping Elements - O(n) Time and O(1) Space
  // function to reverse an array
  static void reverseArray3(int[] arr) {
      int n = arr.length;

      // Iterate over the first half and for every index i,
      // swap arr[i] with arr[n - i - 1]
      for (int i = 0; i < n / 2; i++) {
          int temp = arr[i];
          arr[i] = arr[n - i - 1];
          arr[n - i - 1] = temp;
      }
  }


    // function to reverse an array
    static void reverseArray(List<Integer> arr) {
        Collections.reverse(arr);
    }


}
