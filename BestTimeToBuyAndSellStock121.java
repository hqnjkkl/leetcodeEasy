package leetcodeEasy;

public class BestTimeToBuyAndSellStock121 {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		int res = new BestTimeToBuyAndSellStock121().maxProfit(prices);
		System.out.println(res);
		int[] prices2 = {7,6,4,3,1};
		res = new BestTimeToBuyAndSellStock121().maxProfit(prices2);
		System.out.println(res);
	}
	
    public int maxProfit(int[] prices) {
    	int res = 0;
        for(int i=0;i<prices.length-1;i++) {
        	for(int j=i+1;j<prices.length;j++) {
        		if(prices[j]-prices[i]>res)
        			res = prices[j]-prices[i];
        	}
        }
        return res;
    }
}
