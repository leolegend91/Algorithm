package zigzagConversion;

public class main {
	public static void main(String[] args)
	{
		Solution mySolu = new Solution();
		Solution1 mySolu1 = new Solution1();
		Solution2 mySolu2 = new Solution2();
		String s1 = "PAYPALISHIRING";
		String s2 = "ABCDEFGHIJKLM";
		String s3 = "twckwuyvbihajbmhmodminftgpdcbquupwflqfiunpuwtigfwjtgzzcfofjpydjnzqysvgmiyifrrlwpwpyvqadefmvfshsrxsltbxbziiqbvosufqpwsucyjyfbhauesgzvfdwnloojejdkzugsrksakzbrzxwudxpjaoyocpxhycrxwzrpllpwlsnkqlevjwejkfxmuwvsyopxpjmbuexfwksoywkhsqqevqtpoohpd";
		
		long startTime=System.currentTimeMillis();   //��ȡ��ʼʱ��
		System.out.println(mySolu2.convert(s1, 3));
		long endTime=System.currentTimeMillis(); //��ȡ����ʱ��

		System.out.println("����ʼʱ�䣺 "+(startTime)+"ms");
		System.out.println("�������ʱ�䣺 "+(endTime)+"ms");
		
		System.out.println(2>>1);
		
	}
}
