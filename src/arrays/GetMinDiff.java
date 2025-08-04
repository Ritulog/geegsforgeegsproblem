package arrays;

import java.util.Arrays;

public class GetMinDiff {
    public static void main(String[] args) {
      int  k = 2, arr[] = {1, 5, 8, 10};
       System.out.println(getMinDiff(arr,k));
    }

    static int getMinDiff(int[] arr, int k) {
        Arrays.sort(arr);

        int ans = arr[arr.length - 1]- arr[0];
        int smallest = arr[0]+ k;
        int largest = arr[arr.length - 1]-k;
        int min =0, maxi=0;
        for(int i=0; i<arr.length-1; i++){
            min = Math.min(smallest, arr[i+1]-k);
            maxi = Math.max(largest, arr[i]+k);
            if(min < 0){
                continue;
            }
            ans = Math.min(ans, maxi-min);
        }
        return ans;

    }
}
