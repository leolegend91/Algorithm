package StringToInteger;
//atoi函数功能：
public class Solution {
	public int atoi(String str) {
		 int result = 0;
		 //输入为空，直接返回0
		 if(str.equals(""))
		 {
			 return 0;
		 }
		//输入为正数数字格式
		if(str.matches("\\d+"))
		{
			char[] str2array = str.toCharArray();
			
			for(int i=0;i<str2array.length;i++)
			{
				result = result*10+(str2array[i]-48);
			}
		}
		//输入为负数数字格式
		else if(str.matches("(-|\\+)\\d+"))
		{
			char[] str2array = str.toCharArray();
			
			for(int i=1;i<str2array.length;i++)
			{
				result = result*10+(str2array[i]-48);
			}
			if(str2array[0]=='-')
			{		
				result = -result;
			}
			
		}
		//输入不符合规范
		else
		{			
		}
		
		return result;       
    }

}
