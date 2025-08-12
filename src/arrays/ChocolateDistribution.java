package arrays;

import java.util.ArrayList;
import java.util.Collections;

class ChocolateDistribution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int n= arr.size();
        int res =Integer.MAX_VALUE;
        for(int i=0; i<n-m+1; i++){
            int minElement =  arr.get(i);
            int maxElement = arr.get(i+m-1);
            res = Math.min(res,maxElement- minElement);
        }
        return res;
    }
}