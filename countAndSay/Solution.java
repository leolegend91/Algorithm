package countAndSay;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static String countAndSay(int n)
	{
		n--;
		int tempNum = 0;
		int count = 0;
		char tempChar;
		StringBuffer temp = new StringBuffer();
		List<String> list = new ArrayList<String>();
		list.add("1");
		for(int i=0;i<n;i++)
		{
			//获取List中最后一个数字字符串，并打散存在char[]数组中；
			String lastStr = list.get(i);
			char[] lastStrArray = lastStr.toCharArray();
			tempChar = lastStrArray[0];
			//代码核心部分
			for(int j=0;j<lastStrArray.length;j++)
			{
				if( lastStrArray[j]==tempChar ){
					count++;
				}
				else{
					
					temp.append(count);
					temp.append(tempChar);
					tempChar = lastStrArray[j];
					count = 1;
				}
			}
			temp.append(count);
			temp.append(tempChar);
			count = 0;
			//获取的下一个count String存到list中
			try{
				list.add(temp.toString());			
				temp.delete(0, temp.length());
			}
			catch(Exception e){
				System.out.println("temp is null!");
			}
			
			
		}
		return list.get(list.size()-1);
	}
	
	public static void main(String args[])
	{
		int n = 4;
		for(int i=1;i<10;i++)
		{
			System.out.println(countAndSay(i));
			//System.out.println("/n");
		}
		
	}

}
