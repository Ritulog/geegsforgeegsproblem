package twopointers;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
       int[] arr = {1,2,2,3,4,4,4,5,5};
       int newArrDis = removeDuplicate1(arr);
       for(int i=0; i<newArrDis; i++){
           System.out.println(arr[i]);
       }
    }

    // using hashset

    static int removeDuplicate1(int []arr){
        HashSet set = new HashSet<>();
        int j=0;
        for(int i=0; i< arr.length; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                arr[j++] = arr[i];
            }
        }
       return j;
    }

    // using two pointer approch
    static int removeDuplicate(int []arr){
        int j=1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[j++] = arr[i];
            }
        }
        return  j;
    }

}
