package arraygfg;

public class StockProfit {
    public static int maxProfitBruteForce(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {          // buy day
            for (int j = i + 1; j < n; j++) {  // sell day
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static int maxProfitOptimal(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);        // best buy so far
            maxProfit = Math.max(maxProfit, price - minPrice); // best profit so far
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfitBruteForce(prices)); // 8
        int[] prices2 = {7, 6, 4, 3, 1};
        int[] prices3 = {1, 3, 6, 9, 11};

        System.out.println(maxProfitOptimal(prices)); // 8
        System.out.println(maxProfitOptimal(prices2)); // 0
        System.out.println(maxProfitOptimal(prices3)); // 10
    }
}
