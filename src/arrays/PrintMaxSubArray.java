package arrays;

import static java.lang.Math.max;

public class PrintMaxSubArray {
    public static void main(String[] args) {
        int n =5;
        int arr[] ={1,2,3,4,5};
        int maxsum = Integer.MIN_VALUE;
        for(int st=0; st<n; st++){
          int currsum = 0;
            for(int end = st; end<n; end++) {
               currsum += arr[end];
               maxsum = max(currsum, maxsum);
            }
        }
        System.out.println("max subarray sum =" + maxsum);
    }
}
