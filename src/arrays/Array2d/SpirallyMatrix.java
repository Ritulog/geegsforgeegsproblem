package arrays.Array2d;

import java.util.ArrayList;
import java.util.List;

class SpirallyMatrix {
    public static void main(String[] args) {
      int  mat[][] = {
              {1, 2, 3, 4},
              {5, 6, 7, 8},
              {9, 10, 11, 12},
              {13, 14, 15, 16}
      };

        List<Integer> matrixResult = spirallyTraverse(mat);
        for(int num : matrixResult){
            System.out.print(num + " ");
        }
    }
    static ArrayList<Integer> spirallyTraverse(int[][] mat) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;
        int startRow = 0;
        int endRow = n-1;
        int startCol = 0;
        int endCol = m-1;
        
        while(startRow <= endRow && startCol<=endCol){
            //first row
            for(int j=startCol; j<=endCol; j++){
                result.add(mat[startRow][j]);
            }
            startRow +=1;
            
            //end col
            for(int i=startRow; i<=endRow; i++){
                result.add(mat[i][endCol]);
            }
            endCol -= 1;
            
            //last Row
            if(startRow <= endRow){
               for(int j=endCol; j>=startCol; j--){
                result.add(mat[endRow][j]);
            }
            endRow -= 1; 
            }
            
            if(startCol <= endCol){
                //fisrt col
                for(int i=endRow; i>=startRow; i--){
                    result.add(mat[i][startCol]);
                }
                startCol +=1;
            }
            
        }
        return result;
    }
}
