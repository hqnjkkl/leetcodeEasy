package leetcodeEasy;

public class BestTimeToBuyAndSellStockII122 {

	public static void main(String[] args) {
		int prices[] = {7,1,5,3,6,4};
		BestTimeToBuyAndSellStockII122 bt = new BestTimeToBuyAndSellStockII122();
		System.out.println(bt.maxProfit(prices));
		System.out.println(bt.maxProfit(new int[]{1,2,3,4,5}));
		System.out.println(bt.maxProfit(new int[]{7,6,4,3,1}));
	}
	/**
	 * Accepted
	 * @param prices
	 * @return
	 */
    public int maxProfit(int[] prices) {
       int res = 0;
        for (int i=1;i<prices.length;i++)
            if(prices[i]-prices[i-1]>0)
                res += prices[i]-prices[i-1];
        return res;
    }
}
