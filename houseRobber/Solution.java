package houseRobber;

public class Solution {

	public int rob(int[] num) {
        if(num==null)return 0;
        if(num.length==0)return 0;
        if(num.length==1)return num[0];
      //��̬�滮˼�룬dp��i����ʾ����i��λ��ʱ�����ֵ��״̬ת�Ʒ���Ϊdp��i��=max(dp��i-2��+num��i����dp��i-1��)
        int dp[] = new int[num.length];
        dp[0]=num[0];
        dp[1]=num[0]>num[1]?num[0]:num[1];//��ʼ����ʼ����������
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
