package zigzagConversion;

//��leetcode������Time Limit Exceeded����

public class Solution1 {
	public String convert(String s, int nRows) {
		
		if(nRows<2||s.length()<nRows)
			return s;
		
		String res = "";
		final int loopNum = 2*(nRows-1);		
		char[] inputCharArray = s.toCharArray();
		int sLength = inputCharArray.length-1;
		
//		char[][] resCharArr = new char[nRows][];
		
		//������β���еĳ��ȣ���������
//		resCharArr[0] = new char[sLength/loopNum+1];//��������Ľ����ʲô���Ƿ���и����������Ե�ʱ��ע��һ��
//		resCharArr[nRows-1] = new char[(sLength+1-nRows)/loopNum+1];
		//�����м伸�еĳ��ȣ���������
//		for(int i=1;i<nRows-1;i++)
//		{
//			int length = (sLength+i)/loopNum+(sLength-i)/loopNum+1;
//			resCharArr[i] = new char[length];
//		}
		
		
		
		
		//Ϊ�����������
		for(int i=0;i<nRows-1;i++)
		{
			//��β���������
			if(i==0)
			{
				for(int j=0;j<s.length();j++)
				{
					try{
						res+= inputCharArray[loopNum*j+i];
					}
					catch(Exception e)
					{
						break;
					}			
				}
				continue;
			}
			
			int k=-1;
			for(int j=0;;j=j+2)
			{
				k++;
				try{
					res  += inputCharArray[loopNum*k+i];
				}
				catch(Exception e)
				{
					break;
				}
				
				try{
					res += inputCharArray[loopNum*k+loopNum-i];
				}
				catch(Exception e)
				{
					break;
				}				
			}			
		}
		
		for(int j=0;j<s.length();j++)
		{
			try{
				res+= inputCharArray[loopNum*j+nRows-1];
			}
			catch(Exception e)
			{
				break;
			}			
		}
		return res;
	}
}
