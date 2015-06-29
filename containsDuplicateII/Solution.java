package containsDuplicateII;

import java.util.HashMap;

public class Solution {


	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if(nums.length<2)return false;
		HashMap<Integer,ListNode> numMap = new HashMap();//构造hashmap，key是第i位nums的值，value是i
		int length = nums.length;
		ListNode pNode,pNext;
		for(int i=0;i<length;i++)
		{
			if(!numMap.containsKey(nums[i]))
			{
				numMap.put(nums[i], new ListNode(i));
			}
			else
			{
				pNode = new ListNode();
				pNext = numMap.get(nums[i]);
				pNode.next = pNext;
				while(pNext!=null)
				{
					if(checkDistance(pNext.val,i,k))
					{
						return true;
					}
					else
					{
						pNode = pNode.next;
						pNext = pNext.next;
					}
				}
				pNode.next = new ListNode(i);
			}
		}
		return false;
		
    }
	public boolean checkDistance(int a,int b,int distance)
	{
		return (Math.abs(a-b))<=distance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {99,99};
		Solution s = new Solution();
		System.out.println(s.containsNearbyDuplicate(nums, 2));
	}

}

class ListNode{
	int val;
	ListNode next;
	public ListNode(int val)
	{
		this.val = val;
	}
	public ListNode()
	{
		
	}
}
