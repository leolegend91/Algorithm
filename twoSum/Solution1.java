package twoSum;

import java.util.Hashtable;

public class Solution1 {
	public int[] twoSum(int[] numbers, int target) {
		int result[] = new int[2];
		Hashtable<Integer,Integer> myHashTable = new Hashtable<Integer,Integer>();
		for(int i=0;i<numbers.length;i++)
		{
			//���hashtable�д���numbers[i]��target-numbers[i]����ֱ�ȡ��
			if(myHashTable.get(target-numbers[i])!=null)
			{
				int index1=i;
				int index2 = myHashTable.get(target-numbers[i]);
				
				result[0] = index1<index2?(index1+1):(index2+1);
				result[1] = index1>index2?(index1+1):(index2+1);
				return result;
			}
			//���hashtable��û�е�ǰ���֣���������У�������ֵ��Ϊkeyֵ��������Ϊvalueֵ
			if(myHashTable.get(numbers[i])==null)
			{
				myHashTable.put(numbers[i],i);
			}
			
		}
		return result;
	}

}
