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
			if(!result[i])continue;//从找到的字符串的下一位开始判断
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
/*	最开始的解法，时间复杂度高，没有利用contains方法，并且结果也不对
	public boolean wordBreak(String s, Set<String> wordDict) {
        if(s==null||s.length()<1)return false;
        //用于遍历set的迭代器
        Iterator<String> itea;
        String temp;
 outer: while(s.length()>0)
        {
	 		itea  = wordDict.iterator();
        	char firstChar = s.charAt(0);
 inner:		while(itea.hasNext())
        	{
        		temp = itea.next();
        		if(temp.charAt(0)!=firstChar)continue;//如果当前字符串首字母与待检测字符串首字母不同，继续循环
        		else if(temp.length()>s.length())continue;
        		else
        		{
        			int tempLength = temp.length();
        			for(int i=0;i<tempLength;i++)
        			{
        				//如果当前字符串与待检测字符串不匹配，跳出循环，查找set中的下一个字符串
        				if(temp.charAt(i)!=s.charAt(i))continue inner;
        			}
        			//成功匹配了一个字符串，把s截断，再跳到外循环
        			s=s.substring(tempLength, s.length());
        			continue outer;
        		}
        	}
        	//没有匹配的字符串，返回false
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
