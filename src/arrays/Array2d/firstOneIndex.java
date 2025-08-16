package arrays.Array2d;

class firstOneIndex {
    public static void main(String[] args) {
        RowWithMax1s sol = new RowWithMax1s();
        int[][] arr1 = {
                {0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}
        };
        System.out.println("Row with max 1s in arr1 = " + sol.rowWithMax1s(arr1));
        // Expected: 2

        int[][] arr2 = {
                {0, 0},
                {1, 1}
        };
        System.out.println("Row with max 1s in arr2 = " + sol.rowWithMax1s(arr2));
        // Expected: 1
    }
    // Binary search to find index of first 1 in a row
    private int firstOneIndex(int[] row) {
        int low = 0, high = row.length - 1, ans = row.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (row[mid] == 1) {
                ans = mid;  // possible first 1
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int rowWithMax1s(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int maxCount = 0;
        int rowIndex = -1;

        for (int i = 0; i < n; i++) {
            int firstOne = firstOneIndex(arr[i]);
            int countOnes = m - firstOne; // total ones in this row
            if (countOnes > maxCount) {
                maxCount = countOnes;
                rowIndex = i;
            }
        }
        return rowIndex;
    }
}
