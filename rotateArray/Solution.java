package rotateArray;

public class Solution {

	public void rotate(int[] nums, int k) {
        if(nums==null)return;
        k=k%(nums.length);
		
		int temp[] = new int[k];
        for(int i=0;i<k;i++)
        {
        	temp[i]=nums[nums.length-k+i];
        }
        for(int i=nums.length-1;i>k-1;i--)
        {
        	nums[i]=nums[i-k];
        }
        for(int i=0;i<k;i++)
        {
        	nums[i]=temp[i];
        }
        
    }
	public static void main(String[] args) {
		Solution s = new Solution();
		int nums[] = {1,2,3,4,5,6};
		s.rotate(nums, 3);
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]);
		}

	}

}
