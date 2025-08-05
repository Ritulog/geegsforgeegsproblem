package arrays;

public class MinJumps {
    public static void main(String[] args) {
     int  arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}; //3
      int[]  arr1 = {1, 4, 3, 2, 6, 7}; //2
       int[] arr2 = {0, 10, 20}; //-1
     System.out.println(minJumps(arr2));
    }

    static int minJumps(int[] arr) {

        if(arr[0] == 0){
            return -1;
        }

        int totalJumps = 0;

        int destination = arr.length - 1;

        int coverage = 0, lastJumpIdx = 0;

        // if (arr.length == 1) return 0;

        for (int i = 0; i < arr.length; i++) {

            coverage = Math.max(coverage, i + arr[i]);

            if (i == lastJumpIdx) {
                lastJumpIdx = coverage;
                totalJumps++;

                if (coverage >= destination) {
                    return totalJumps;
                }

                if (i == coverage) {
                    return -1;
                }

            }
        }

        return -1;

    }

}
