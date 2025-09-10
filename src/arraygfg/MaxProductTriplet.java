package arraygfg;

public class MaxProductTriplet {

    // brute force
    public static int maxProductBruteForce(int[] arr) {
        int n = arr.length;
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int product = arr[i] * arr[j] * arr[k];
                    maxProduct = Math.max(maxProduct, product);
                }
            }
        }
        return maxProduct;
    }



    //optimal
    public static int maxProductOptimal(int[] arr) {
        int n = arr.length;

        // Initialize
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : arr) {
            // Update max values
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            // Update min values
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 3, 5, 6, 20};
        int[] arr2 = {-10, -3, -5, -6, -20};
        int[] arr3 = {1, -4, 3, -6, 7, 0};

        System.out.println("Max Product (Optimal) arr1: " + maxProductOptimal(arr1));
        System.out.println("Max Product (Optimal) arr2: " + maxProductOptimal(arr2));
        System.out.println("Max Product (Optimal) arr3: " + maxProductOptimal(arr3));
    }
}
