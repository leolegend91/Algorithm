package StringToInteger;
//atoi�������ܣ�
public class Solution {
	public int atoi(String str) {
		 int result = 0;
		 //����Ϊ�գ�ֱ�ӷ���0
		 if(str.equals(""))
		 {
			 return 0;
		 }
		//����Ϊ�������ָ�ʽ
		if(str.matches("\\d+"))
		{
			char[] str2array = str.toCharArray();
			
			for(int i=0;i<str2array.length;i++)
			{
				result = result*10+(str2array[i]-48);
			}
		}
		//����Ϊ�������ָ�ʽ
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
		//���벻���Ϲ淶
		else
		{			
		}
		
		return result;       
    }

}
