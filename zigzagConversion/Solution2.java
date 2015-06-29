package zigzagConversion;

public class Solution2 {

	public String convert(String s, int nRows) {
		
		if(nRows<2||s.length()<nRows)
			return s;
		String res = new String();
		int sLength = s.length()-1;
		char[] resArray = new char[sLength+1];
		char[] inputCharArray = s.toCharArray();
		
		int[] RowsTotalNum = new int[nRows];//每一行的元素个数，最小为1
		int[] RowsStartId = new int[nRows];//每行元素起始位置，最小为0
		int[] RowsOffsetNum = new int[nRows];//用于统计每组数据已经添加了多少个元素，设置偏移量，最小为0		
		
		int loop = (nRows-1)<<1;
		
		//计算首尾两行的长度，生成数组
		RowsTotalNum[0] = sLength/loop+1;//这样定义的结果是什么？是否会有浮点数？调试的时候注意一下
		RowsTotalNum[nRows-1] = (sLength+1-nRows)/loop+1;
		//计算中间几行的长度，生成数组
		for(int i=1;i<nRows-1;i++)
		{
			int length = (sLength+i)/loop+(sLength-i)/loop+1;
			RowsTotalNum[i] = length;
		}
		//设置每行元素起始位置
		for(int i=1;i<nRows;i++)
		{			
			RowsStartId[i] = RowsStartId[i-1]+RowsTotalNum[i-1];
		}
				
		
		int i=0;
		while(i<sLength+1)
		{
			int rowId = (i%loop)>=nRows?(loop-i%loop):(i%loop);
			resArray[RowsStartId[rowId]+RowsOffsetNum[rowId]] = inputCharArray[i];
			RowsOffsetNum[rowId]++;
			i++;
		}
		return res.valueOf(resArray);
	}
}
