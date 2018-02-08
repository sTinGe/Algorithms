package leetcode;

public class lc_122 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=1; i<prices.length; i++) {
            profit += Math.max(prices[i]-prices[i-1], 0);
        }
        return profit;
    }

    public void run() {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

}
