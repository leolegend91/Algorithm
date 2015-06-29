package wordBreak;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
	
	public boolean wordBreak(String s, Set<String> wordDict) {
		if(s==null||s.length()<1||wordDict.isEmpty())return false;
		boolean result[] = new boolean[s.length()+1];
		result[0]=true;
		int sLength = s.length();
		for(int i=0;i<sLength;i++)
		{
			if(!result[i])continue;//���ҵ����ַ�������һλ��ʼ�ж�
			for(String str:wordDict)
			{
				if((s.length()-i)<str.length())continue;
				else
				{
					if(s.substring(i,i+str.length()).equals(str))
					{	
						result[i+str.length()]=true;
					}
						
				}
			}
		}
		return result[s.length()];
		
	}
/*	�ʼ�Ľⷨ��ʱ�临�Ӷȸߣ�û������contains���������ҽ��Ҳ����
	public boolean wordBreak(String s, Set<String> wordDict) {
        if(s==null||s.length()<1)return false;
        //���ڱ���set�ĵ�����
        Iterator<String> itea;
        String temp;
 outer: while(s.length()>0)
        {
	 		itea  = wordDict.iterator();
        	char firstChar = s.charAt(0);
 inner:		while(itea.hasNext())
        	{
        		temp = itea.next();
        		if(temp.charAt(0)!=firstChar)continue;//�����ǰ�ַ�������ĸ�������ַ�������ĸ��ͬ������ѭ��
        		else if(temp.length()>s.length())continue;
        		else
        		{
        			int tempLength = temp.length();
        			for(int i=0;i<tempLength;i++)
        			{
        				//�����ǰ�ַ����������ַ�����ƥ�䣬����ѭ��������set�е���һ���ַ���
        				if(temp.charAt(i)!=s.charAt(i))continue inner;
        			}
        			//�ɹ�ƥ����һ���ַ�������s�ضϣ���������ѭ��
        			s=s.substring(tempLength, s.length());
        			continue outer;
        		}
        	}
        	//û��ƥ����ַ���������false
        	return false;       	
        }
        return true;
    }
 */
	public static void main(String[] args) {
		Solution s = new Solution();
		String str = "abcd";
		Set<String> set = new HashSet<String>();
		set.add("a");
		set.add("abc");
		set.add("b");
		set.add("cd");
		
		System.out.println(s.wordBreak(str, set));

	}

}
