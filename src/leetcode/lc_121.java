package leetcode;

public class lc_121 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for(int i=0; i<prices.length; i++) {
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i]-min);
        }

        return profit;
    }

    public void run() {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
