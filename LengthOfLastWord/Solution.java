package LengthOfLastWord;
//ʹ����ͨ����ʵ��
public class Solution {
	public int lengthOfLastWord(String s) {
        		
		int wordLength = 0;
		char[] s2char = s.toCharArray();
		int id = s2char.length-1;
		//ȥ���ַ���ĩβ�Ŀո�
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
			
			//��ǰ�ַ�Ϊ��ĸʱ
			if(((s2char[i]>64)&&(s2char[i]<91))||((s2char[i]>96)&&(s2char[i]<123)))
			{
				wordLength++;
			}
			//��ǰ�ַ�Ϊ�ո�ʱ
			//��ǰ�ַ���Ϊ��ĸʱ
			else
			{
				break;
			}
		}
		
		return wordLength;
    }

}
