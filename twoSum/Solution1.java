package twoSum;

import java.util.Hashtable;

public class Solution1 {
	public int[] twoSum(int[] numbers, int target) {
		int result[] = new int[2];
		Hashtable<Integer,Integer> myHashTable = new Hashtable<Integer,Integer>();
		for(int i=0;i<numbers.length;i++)
		{
			//如果hashtable中存在numbers[i]和target-numbers[i]，则分别取出
			if(myHashTable.get(target-numbers[i])!=null)
			{
				int index1=i;
				int index2 = myHashTable.get(target-numbers[i]);
				
				result[0] = index1<index2?(index1+1):(index2+1);
				result[1] = index1>index2?(index1+1):(index2+1);
				return result;
			}
			//如果hashtable中没有当前数字，则存入其中，并将数值作为key值，索引作为value值
			if(myHashTable.get(numbers[i])==null)
			{
				myHashTable.put(numbers[i],i);
			}
			
		}
		return result;
	}

}
