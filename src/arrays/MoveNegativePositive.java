package arrays;

import java.util.Arrays;

public class MoveNegativePositive {
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int[] arr1 = move3(arr);

        for(int a:arr1){
            System.out.print(a + " ");
        }
    }

    //Using Sorting - O(nlogn) Time and O(1) Space
    static int[] move(int[] arr){
        Arrays.sort(arr);
        return arr;
    }


    //Using Quick Sort Partition - O(n) time and O(1) space
    static int[] move1(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {

            // If negative number is present
            // swap it with arr[j]
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        return arr;
    }

    //Using Two Pointer Method - O(n) time and O(1) space
    static int[] move3(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {

            // increment left while arr[left]
            // is negative
            while (left < right && arr[left] < 0) {
                left++;
            }

            // decrement right while arr[right]
            // is positive
            while (right > left && arr[right] > 0) {
                right--;
            }

            // swap the two values.
            if (right > left) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return arr;
    }



}
