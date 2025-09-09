package prefixsum;

public class Equilibrium {
    //brute force element
    int equilibriumIndex1(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int leftSum = 0, rightSum = 0;

            // calculate left sum
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            // calculate right sum
            for (int j = i + 1; j < n; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }



    // prefix. sum
   static int equilibriumIndex(int arr[], int n) {
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int n = arr.length;
        System.out.println(equilibriumIndex(arr,n));
    }
}
