package tasks.easy;

// [7,1,5,3,6,4] -> 5

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int currentProfit;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }

            currentProfit = price - minPrice;

            if (maxProfit < currentProfit) {
                maxProfit = currentProfit;
            }
        }

        return maxProfit;
    }
}
