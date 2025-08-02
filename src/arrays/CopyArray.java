package arrays;

import java.util.Arrays;

public class CopyArray {
    public static void copyArray(int[] arr) {
        int[] arr1 = new int[arr.length];

        for(int i = 0; i < arr.length; ++i) {
            arr1[i] = arr[i];
        }

        System.out.println("Copy array =" + Arrays.toString(arr1));

        for(int i = 0; i < arr1.length; ++i) {
            System.out.println("Copy array is=" + arr1[i]);
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        copyArray(arr);
        int[] copyarr2 = Arrays.stream(arr).toArray();
        System.out.println("Copy array using stream api" + Arrays.toString(copyarr2));
    }
}
