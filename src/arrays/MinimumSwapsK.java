package arrays;

class MinimumSwapsK {
    // Function for finding maximum and value pair
    int minSwap(int[] arr,int k) {
        // Complete the function
        int n = arr.length;
        int count =0;
        for(int i=0; i<n; i++){
            if(arr[i] <=k){
                count++;
            }
        }
        int i=0;
        int j=0;
        int ans =Integer.MAX_VALUE;
        int swap =0;
        while(i<n){
            if(arr[i] >k){
                swap++;
            }
            while(i-j+1>count){
            if(arr[j] >k){
                swap--;
            }
            j++;
        }
        if(i-j+1 == count){
            ans = Math.min(ans, swap);
        }
        i++;
    }
    return ans;
}
}
