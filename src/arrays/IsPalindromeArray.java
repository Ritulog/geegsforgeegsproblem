package arrays;

class IsPalindromeArray {
    public static void main(String[] args) {
        int arr[] = {111, 222, 333, 444, 555};
       int arr1[] = {121, 131, 20};
        System.out.println(isPalinArray(arr1));
    }

    public static boolean isPalinArray(int[] arr) {
        // add code here.
        int n =arr.length;
        for(int i=0; i<n; i++){
            int temp = arr[i];
            int x=0;
            while(temp != 0){
                x=x*10+(temp%10);
                temp = temp/10;
            }
            if(x != arr[i]){
                return false;
            }
        }
         return true;
    }
}