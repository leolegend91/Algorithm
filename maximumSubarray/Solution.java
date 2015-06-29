package maximumSubarray;

import java.util.HashMap;

public class Solution {
	
	public int maxSubArray(int[] nums) {
        if(nums==null || nums.length<1)return 0;
        int length = nums.length;
        int sum[] = new int[length];
        sum[0]=nums[0];
        int maxSum=sum[0];
        for(int i=1;i<length;i++)
        {
        	sum[i]=max(nums[i],nums[i]+sum[i-1]);
        	if(sum[i]>maxSum)maxSum=sum[i];
        }
        return maxSum;
    }
	public int max(int a,int b)
	{
		return a>b?a:b;
	}
	public static void main(String[] args) {
		int array[] ={-2,1,-3,4,-1,2,1,-5,4};
		Solution s = new Solution();
		System.out.println(s.maxSubArray(array));
		HashMap m = new HashMap();

	}

}
