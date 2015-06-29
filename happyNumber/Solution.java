package happyNumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public boolean isHappy(int n) {
		if(n<1)return false;
		Set<Integer> numFlagSet = new HashSet<Integer>();
        int num = n;
        while(num!=1)
        {
        	//���㵱ǰnum�ĸ�λƽ����
        	num = cacuPow(num);
        	//num���������1������numFlag�д�ʱ����������������ͻ��˵��������ѭ��������false������������Ӧλ��Ϊ1
        	if(!numFlagSet.add(num))
        	{
        		return false;
        	}
        	
        }
        return true;
        
    }
	
	public static int cacuPow(int n)
	{
		int result = 0;
		int temp;
		while(n>0)
		{
			temp = n%10;
			result += temp*temp;
			n=n/10;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		for(int i=0;i<100000;i++)
		{
			System.out.println(s.isHappy(i));
		}
	}

}
