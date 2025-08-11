package arrays;

public class MaxProfitTwoTransactions {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int n = prices.length;
        
        int[] left = new int[n];   // max profit up to i (one transaction)
        int[] right = new int[n];  // max profit from i to end (one transaction)
        
        // forward pass -> fill left[]
        int minPrice = prices[0];
        left[0] = 0;
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            left[i] = Math.max(left[i-1], prices[i] - minPrice);
        }
        
        // backward pass -> fill right[]
        int maxPrice = prices[n-1];
        right[n-1] = 0;
        for (int i = n-2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            right[i] = Math.max(right[i+1], maxPrice - prices[i]);
        }
        
        // combine
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, left[i] + right[i]);
        }
        return maxProfit;
    }

    // quick test with the examples
    public static void main(String[] args) {
        int[] a1 = {10, 22, 5, 75, 65, 80};
        int[] a2 = {2, 30, 15, 10, 8, 25, 80};
        System.out.println(maxProfit(a1)); // 87
        System.out.println(maxProfit(a2)); // 100
    }
}
