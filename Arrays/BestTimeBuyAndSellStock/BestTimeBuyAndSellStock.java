package Arrays.BestTimeBuyAndSellStock;

public class BestTimeBuyAndSellStock {
    public static void main(String[] args) {

        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println("Max profit : " + maxProfit(prices));

        int[] prices1 = new int[]{7, 6, 4, 3, 1};
        System.out.println("Max profit : " + maxProfit(prices1));

        int[] prices2 = new int[]{-7, 6, -4, 3, 1};
        System.out.println("Max profit : " + maxProfit(prices2));
    }

    //keep track of maxProfit and minPrice at each particular day.
    // max profit can be determined if we have minPrice till that date
    //if we have minPrice at that day no need to check for max profit.
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i <= prices.length - 1; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (maxProfit < prices[i] - minPrice) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
