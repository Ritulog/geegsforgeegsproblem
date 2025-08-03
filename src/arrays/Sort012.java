package arrays;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        sort012(arr);
        for(int n:arr){
            System.out.println(n);
        }
    }

    static void sort012(int[] arr){
        Arrays.sort(arr);
    }

}
