package findMinimumInRotatedSortedArray;

public class Solution {
	
	public int findMin(int[] nums) {
        int length = nums.length;
        if(length==0)return -1;
        
        int index1=0,index2=length-1;
        int indexMid = index2;
        
        if(nums[index1]<nums[index2])return nums[index1];
        
        while(nums[index1]>=nums[index2])
        {
        	if(index2-index1 <= 1)
        	{
        		break;
        	}
        	
        	
        	if(nums[index1]<=nums[indexMid])
        	{
        		index1 = indexMid;
        	}
        	else
        	{
        		index2 = indexMid;
        	}
        	indexMid = (index1+index2)>>>1;
        }
        return nums[index2];
    }
	
	public static void main(String[] args) {
		int nums[] = {4,5};
		Solution s = new Solution();
		System.out.println(s.findMin(nums));
	}

}
