package arrays;

class SmallestSubWithSumGreaterX {

    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int i=0;
        int j =0;
        int ans = Integer.MAX_VALUE;
        int sum =0;
        while(i<arr.length){
            sum +=arr[i];
            while(sum>x){
                ans = Math.min(ans, i-j+1);
                sum -= arr[j];
                j++;
            }
            i++;
        }
        if(ans == Integer.MAX_VALUE){
            return 0;
        }
        return ans;
    }
}
