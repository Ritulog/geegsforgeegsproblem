package arrays.Array2d;

import java.util.*;

class SortMatrix {
    // Function to sort the matrix
    int[][] sortedMatrix(int N, int Mat[][]) {
        int[] arr = new int[N * N];
        int idx = 0;

        // Flatten matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[idx++] = Mat[i][j];
            }
        }

        // Sort array
        Arrays.sort(arr);

        // Fill matrix again
        idx = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Mat[i][j] = arr[idx++];
            }
        }
        return Mat;
    }

    // Main method
    public static void main(String[] args) {
        int N = 4;
        int[][] Mat = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        SortMatrix sol = new SortMatrix();
        int[][] ans = sol.sortedMatrix(N, Mat);

        // Print result
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
