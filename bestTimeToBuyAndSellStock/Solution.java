package bestTimeToBuyAndSellStock;

public class Solution {

	public int maxProfit(int[] prices) {
        if(prices==null || prices.length<1)return 0;
		int min = prices[0];
		int max = 0;
		int length = prices.length;
		for(int i=1;i<length;i++)
		{
			if((prices[i]-min)>max)max = (prices[i]-min);
			if(prices[i]<min)min = prices[i];
		}
		return max;
    }
	public static void main(String[] args) {
		Solution s = new Solution();
		int array[] = {1,2};
		
		System.out.println(s.maxProfit(array));

	}

}
