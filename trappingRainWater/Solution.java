package trappingRainWater;

public class Solution {

//	public int trap(int[] height) {
//        if(height==null )return 0;
//        int length = height.length;
//        int leftMax[] = new int[length];
//        int left=height[0];
//        int right=height[length-1];
//        int sec;
//        int sum=0;
//        for(int i=0;i<length;i++)
//        {
//        	if(height[i]>left)
//        	{
//        		left = height[i];
//        	}
//        	leftMax[i]=left;
//        }
//        
//        for(int i=length-1;i>=0;i--)
//        {
//        	if(height[i]>right)
//        	{
//        		right = height[i];
//        	}
//        	
//        	sec = leftMax[i]<right?leftMax[i]:right;
//        	sum += sec-height[i];
//        }
//        return sum;
//	}
	
	public int trap(int[] height) {
        if(height==null || height.length<1 )return 0;
        int length = height.length;
        int left = 0;
        int right = length-1;
        int leftMax = height[left];
        int rightMax = height[right];
        int sum = 0;
        boolean leftToRight = leftMax<rightMax?true:false;
        while(left<right)
        {
        	if(leftToRight)
        	{
        		left++;
        		if(height[left]>leftMax)
        		{
        			leftMax = height[left];
        			if(leftMax>rightMax)
        			{
        				leftToRight=false;
        			}
        		}
        		else
        		{
        			sum += leftMax-height[left];
        		}
        	}
        	else
        	{
        		right--;
        		if(height[right]>rightMax)
        		{
        			rightMax = height[right];
        			if(rightMax>leftMax)
        			{
        				leftToRight=true;
        			}
        		}
        		else
        		{
        			sum += rightMax-height[right];
        		}
        	}
        }
        return sum;
	}
	public static void main(String[] args) {
		int array[] = {};
		Solution s = new Solution();
		System.out.println(s.trap(array));

	}

}
