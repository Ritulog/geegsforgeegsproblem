package arrays.Array2d;

class SpiralMatrixII59 {

    public static void main(String[] args) {
        int n=3;
        int[][] matrix = generateMatrix(3);
        // print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    static int[][] generateMatrix(int n) {
        int[][] matrix= new int[n][n];
        int startRow =0;
        int endRow = n-1;
        int startCol = 0;
        int endCol = n-1;
        int val = 1;
        while(startRow <= endRow && startCol <= endCol){

            //first row fill
            for(int j=startCol; j<=endCol; j++){
                matrix[startRow][j] = val;
                val +=1;
            }
            startRow +=1;

            //fill end col
            for(int i=startRow; i<=endRow; i++){
                matrix[i][endCol] = val;
                val +=1;
            }
            endCol -=1;

           if(startRow <= endRow){
            //fill last Row
            for(int j=endCol; j>=startCol; j--){
                matrix[endRow][j] = val;
                val +=1;
            }
            endRow -=1;
           }
             if(startCol <= endCol){
                // fill first col
                for(int i=endRow; i>=startRow; i--){
                    matrix[i][startCol] = val;
                    val +=1;
                }
                startCol +=1;
             }
        }
        return matrix;
    }
}