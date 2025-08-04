package arrays;

public class MaxSubArraySum {
    public static void main(String[] args) {
       int arr[] = {2, 3, -8, 7, -1, 2, 3};
       System.out.println(maxSubarraySum(arr));
    }

    static int maxSubarraySum(int[] arr){

        //To find the maximum sum possible
        int max_so_far = arr[0];

        //To store the maximum found at a position
        int curr_max = arr[0];

        for(int i=1; i<arr.length; i++ ){

            //equivalent to step3
            curr_max = Math.max(arr[i], arr[i] +curr_max);

            //equivalent to step3
            max_so_far = Math.max(curr_max, max_so_far);
        }
        return max_so_far;
    }
}
