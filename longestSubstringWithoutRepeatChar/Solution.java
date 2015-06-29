package longestSubstringWithoutRepeatChar;

import java.util.HashMap;

public class Solution {

	public int lengthOfLongestSubstring(String s) {
		if(s==null)return 0;
		if(s.equals(""))return 0;
		if(s.length()==1)return 1;
		char str2char[] = new char[s.length()];
		str2char = s.toCharArray();
		int startIndex=0;
		int endIndex=0;
		//key表示字符，value表示字符所在位置
        HashMap<Character,Integer> strMap = new HashMap<Character,Integer>(); 
        int maxLength = 0;
        for(int i=0;i<s.length();i++)
        {
        	//如果不包含当前字符，直接存入
        	if(!strMap.containsKey(str2char[i])){
        		strMap.put(str2char[i], i);
        		endIndex++;
        	}
        	else{
        		int tempLength = endIndex-startIndex;
        		maxLength=tempLength>maxLength?tempLength:maxLength;
        		if((strMap.get(str2char[i])+1)>startIndex)
        		{
        			startIndex=strMap.get(str2char[i])+1;
        		}
        		
        		endIndex++;
        		strMap.put(str2char[i], i);
        	}
        }
        maxLength = (endIndex-startIndex)>maxLength?(endIndex-startIndex):maxLength;
        return maxLength;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution s = new Solution();
		StringBuilder sb = new StringBuilder();
		String str1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!";
		String str2 = "#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ ";
		for(int i=0;i<326;i++)
		{
			sb.append(str1);
			sb.append('"');
			sb.append(str2);
		}
		System.out.println(sb.toString().length());
		System.out.println(s.lengthOfLongestSubstring(sb.toString()));
		
		System.out.println(s.lengthOfLongestSubstring("abba"));
	}

}
