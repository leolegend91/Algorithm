package plusOne;

public class Solution1 {
public int[] plusOne(int[] digits) {
    	
		if(digits[digits.length-1]!=9)
		{
			digits[digits.length-1] +=1;
			return digits;
		}
		int flag=1;
		int temp=0;
		int result[] = new int[digits.length+1];
    	for(int i=digits.length-1;i>-1;i--)
    	{
    		//�����ʽ���淶��ֱ�ӷ���null
    		if(digits[i]>9)return null;
    		//�Ѽ��ϵ�1���������һλ�Ľ�λ���򻯴���
    		temp = digits[i]+flag;
    		if(temp>9)
    		{
    			digits[i]=0;
    			result[i+1]=0;
    			flag=1;
    		}
    		else
    		{
    			digits[i]=temp;
    			result[i+1]=temp;
    			flag=0;
    			return digits;
    		}
    	}
    	if(flag==1)
    	{
    		result[0]=1;
    		return result;
    	}
    	else return digits;
    }
	

}
