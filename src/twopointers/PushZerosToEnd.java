package twopointers;

import java.util.Arrays;

public class PushZerosToEnd {
    public static void main(String[] args) {
      int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
      pushZerosToEnd1(arr);
      System.out.println(Arrays.toString(arr));
    }

    // brute force approch
    static void pushZerosToEnd(int arr[]){
        int n = arr.length;
        int temp[] = new int[n];
        int j = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] != 0){
                temp[j++] = arr[i];
            }
        }
        while(j<n){
            temp[j++] = 0;
        }

        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }
    }

    // two pointer approch
    static void pushZerosToEnd1(int[] arr) {

        // Count of non-zero elements
        int count = 0;

        // If the element is non-zero, replace the element at
        // index 'count' with this element and increment count
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                arr[count++] = arr[i];
        }

        // Now all non-zero elements have been shifted to
        // the front. Make all elements 0 from count to end.
        while (count < arr.length)
            arr[count++] = 0;
    }
// Expected approch
static void pushZerosToEnd3(int[] arr) {

    // Pointer to track the position
    // for next non-zero element
    int count = 0;

    for (int i = 0; i < arr.length; i++) {

        // If the current element is non-zero
        if (arr[i] != 0) {

            // Swap the current element with
            // the 0 at index 'count'
            int temp = arr[i];
            arr[i] = arr[count];
            arr[count] = temp;

            // Move 'count' pointer to
            // the next position
            count++;
        }
    }
}

}
