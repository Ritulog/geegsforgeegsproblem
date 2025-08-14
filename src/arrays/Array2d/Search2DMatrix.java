package arrays.Array2d;

class Search2DMatrix {
    public static void main(String[] args) {
       int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
             int  target = 3;
        int[][]  matrix1= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
       int target1 = 13;
             System.out.println(searchMatrix(matrix1, target1));
    }
    static boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return true;
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return false;
    }
}