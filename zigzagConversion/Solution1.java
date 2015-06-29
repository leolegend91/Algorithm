package zigzagConversion;

//在leetcode上运行Time Limit Exceeded错误

public class Solution1 {
	public String convert(String s, int nRows) {
		
		if(nRows<2||s.length()<nRows)
			return s;
		
		String res = "";
		final int loopNum = 2*(nRows-1);		
		char[] inputCharArray = s.toCharArray();
		int sLength = inputCharArray.length-1;
		
//		char[][] resCharArr = new char[nRows][];
		
		//计算首尾两行的长度，生成数组
//		resCharArr[0] = new char[sLength/loopNum+1];//这样定义的结果是什么？是否会有浮点数？调试的时候注意一下
//		resCharArr[nRows-1] = new char[(sLength+1-nRows)/loopNum+1];
		//计算中间几行的长度，生成数组
//		for(int i=1;i<nRows-1;i++)
//		{
//			int length = (sLength+i)/loopNum+(sLength-i)/loopNum+1;
//			resCharArr[i] = new char[length];
//		}
		
		
		
		
		//为数组添加数据
		for(int i=0;i<nRows-1;i++)
		{
			//首尾行添加数据
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
