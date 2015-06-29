package LengthOfLastWord;
//使用普通方法实现
public class Solution {
	public int lengthOfLastWord(String s) {
        		
		int wordLength = 0;
		char[] s2char = s.toCharArray();
		int id = s2char.length-1;
		//去除字符串末尾的空格
		for(;id>-1;id--)
		{
			if(s2char[id]==32)
			{
				continue;
			}
			else
			{
				break;
			}
		}
		for(int i=id;i>-1;i--)
		{
			
			//当前字符为字母时
			if(((s2char[i]>64)&&(s2char[i]<91))||((s2char[i]>96)&&(s2char[i]<123)))
			{
				wordLength++;
			}
			//当前字符为空格时
			//当前字符不为字母时
			else
			{
				break;
			}
		}
		
		return wordLength;
    }

}
