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
		
		long startTime=System.currentTimeMillis();   //获取开始时间
		System.out.println(mySolu2.convert(s1, 3));
		long endTime=System.currentTimeMillis(); //获取结束时间

		System.out.println("程序开始时间： "+(startTime)+"ms");
		System.out.println("程序结束时间： "+(endTime)+"ms");
		
		System.out.println(2>>1);
		
	}
}
