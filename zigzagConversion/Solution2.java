package zigzagConversion;

public class Solution2 {

	public String convert(String s, int nRows) {
		
		if(nRows<2||s.length()<nRows)
			return s;
		String res = new String();
		int sLength = s.length()-1;
		char[] resArray = new char[sLength+1];
		char[] inputCharArray = s.toCharArray();
		
		int[] RowsTotalNum = new int[nRows];//ÿһ�е�Ԫ�ظ�������СΪ1
		int[] RowsStartId = new int[nRows];//ÿ��Ԫ����ʼλ�ã���СΪ0
		int[] RowsOffsetNum = new int[nRows];//����ͳ��ÿ�������Ѿ�����˶��ٸ�Ԫ�أ�����ƫ��������СΪ0		
		
		int loop = (nRows-1)<<1;
		
		//������β���еĳ��ȣ���������
		RowsTotalNum[0] = sLength/loop+1;//��������Ľ����ʲô���Ƿ���и����������Ե�ʱ��ע��һ��
		RowsTotalNum[nRows-1] = (sLength+1-nRows)/loop+1;
		//�����м伸�еĳ��ȣ���������
		for(int i=1;i<nRows-1;i++)
		{
			int length = (sLength+i)/loop+(sLength-i)/loop+1;
			RowsTotalNum[i] = length;
		}
		//����ÿ��Ԫ����ʼλ��
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
