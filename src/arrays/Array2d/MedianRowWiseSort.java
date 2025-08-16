package arrays.Array2d;

class MedianRowWiseSort {
    public int median(int[][] mat) {
        int R = mat.length;
        int C = mat[0].length;
        int N = R * C;
        int medianIndex = N / 2;

        int start = 1;   // min possible value (given constraint)
        int end = 2000;  // max possible value (given constraint)

        while (start <= end) {
            int assumedMedian = start + (end - start) / 2;

            // count how many elements <= assumedMedian
            int lesserElement = findSmallerElement(mat, assumedMedian);

            if (lesserElement <= medianIndex) {
                start = assumedMedian + 1;
            } else {
                end = assumedMedian - 1;
            }
        }
        return start;
    }

    // Count elements <= assumedMedian in the matrix
    private int findSmallerElement(int[][] matrix, int assumedMedian) {
        int noOfSmallerElement = 0;

        for (int i = 0; i < matrix.length; i++) {
            int low = 0, high = matrix[i].length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (matrix[i][mid] <= assumedMedian) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            // 'low' will be the count of elements <= assumedMedian in this row
            noOfSmallerElement += low;
        }
        return noOfSmallerElement;
    }

    // ✅ Main method with examples
    public static void main(String[] args) {
        MedianRowWiseSort sol = new MedianRowWiseSort();

        int[][] mat1 = {
            {1, 3, 5},
            {2, 6, 9},
            {3, 6, 9}
        };
        System.out.println("Median of mat1 = " + sol.median(mat1)); // Expected 5

        int[][] mat2 = {
            {2, 4, 9},
            {3, 6, 7},
            {4, 7, 10}
        };
        System.out.println("Median of mat2 = " + sol.median(mat2)); // Expected 6
    }
}
