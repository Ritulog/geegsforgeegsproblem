package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class ChocolateDistribution {
    static int findMinDiff(ArrayList<Integer> arr, int m) {
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

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 4, 1, 9, 56, 7, 9, 12));
        int m = 5;
        System.out.println(findMinDiff(arr, m));
    }
}