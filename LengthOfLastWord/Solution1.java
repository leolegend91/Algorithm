package LengthOfLastWord;
//ʹ��������ʽ����ʵ��
public class Solution1 {
	public int lengthOfLastWord(String s) {
        
		String[] s2array = s.split(" ");
		int wordLength = 0;
		if(s2array.length == 0)
		{
			return wordLength;
		}
		else
		{
			wordLength = s2array[s2array.length-1].length();
			return wordLength;
		}
		
    }
}
