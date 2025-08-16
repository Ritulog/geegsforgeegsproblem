package arrays.Array2d;

class RowWithMax1s {
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





    static int rowWithMax1s(int arr[][]) {
        // code here
        int n = arr.length;
        int m = arr[0].length;
        int col = m-1;
        int row = -1;
        
        //Traversing row by row
        for(int i=0; i<n; i++){
            
            //last column to first
            for(int j=col; j>=0; j--){
               if(arr[i][j]== 1){
                    row=i;
                // we will not see same column again
                col--;
               }
               
               // if you see zero then skip that row
               else{
                   break;
               }
            }
            
        }
        return row;
    }


    // brute force approach
    static int rowWithMax1s1(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int maxCount = 0;
        int rowIndex = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                rowIndex = i;
            }
        }
        return rowIndex;
    }
}