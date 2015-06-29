package reverseInteger;

import java.util.ArrayList;

public class Solution {
	public static int reverse(int x)
	{		
		//���ж�x�Ƿ񳬳���Χ����������򷵻�0��
		if((x<=Integer.MIN_VALUE)||(x>=Integer.MAX_VALUE))return 0;
		//��xԤ����������ʱ���������������ٴ���
		int sign;
		if(x>0)
			{	sign = 1; }
		else
			{	sign = -1;
				x=-x;}
		long temp = x;
		ArrayList<Long> list = new ArrayList<Long>();
		//��������λ���ָ����list
		while(temp>0)
		{
			list.add(temp%10);
			temp = temp/10;			
		}
		
		
		for(int i=0;i<list.size();i++)
		{
			temp = temp*10 + (sign)*list.get(i);
			if((temp<=Integer.MIN_VALUE)||(temp>=Integer.MAX_VALUE))return 0;
		}
		
		//System.out.println(Integer.MAX_VALUE);
		
		return (int)temp;
	}
	
	public static void main(String args[])
	{
		int x = reverse(-2147483648);
		//int x = Integer.MAX_VALUE;
		//System.out.println(Integer.MAX_VALUE);
		System.out.println(x);
	}

}
