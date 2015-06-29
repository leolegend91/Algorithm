package houseRobber;

public class Solution {

	public int rob(int[] num) {
        if(num==null)return 0;
        if(num.length==0)return 0;
        if(num.length==1)return num[0];
      //动态规划思想，dp【i】表示到第i个位置时的最大值，状态转移方程为dp【i】=max(dp【i-2】+num【i】，dp【i-1】)
        int dp[] = new int[num.length];
        dp[0]=num[0];
        dp[1]=num[0]>num[1]?num[0]:num[1];//初始化起始的两个数字
        for(int i=2;i<num.length;i++)
        {
        	dp[i]=(dp[i-2]+num[i])>dp[i-1]?(dp[i-2]+num[i]):dp[i-1];
        }
        
        return dp[dp.length-1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test[]=new int[0];
		Solution s = new Solution();
		
		System.out.println(test.length);
		for(int i=0;i<test.length;i++)
		{
			System.out.println(test[i]);
			System.gc();
		}
		
	}

}
