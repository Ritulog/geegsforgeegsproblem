package arrays;

import java.util.HashMap;

class SubArrayWith0Sum {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int sum =0;
       for(int i=0; i<arr.length; i++){
           sum +=arr[i];
           if(!map.containsKey(sum)){
               map.put(sum, i);
           }
           else{
               return true;
           }
           if(sum==0){
               return true;
           }
           if(arr[i] == 0){
               return true;
           }
       }
       return false;
    }
}