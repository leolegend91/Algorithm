package isomorphicString;

import java.util.HashMap;

public class Solution {

	public boolean isIsomorphic(String s, String t) {
        //��һ��hashmap��key���ַ���value��������ڵڼ�λ
		//��Ūһ�����飬���ȵ���string�ĳ����ַ�����ǵ�һ�γ�������Ϊ0�����������ֵ��Ϊ�ַ���һ�γ����ڵڼ�λ
		if(s==null||t==null)return false;
		if(s.length()!=t.length())return false;
		if(s.length()==0||t.length()==0)return true;
		HashMap<Character,Integer> sMap = new HashMap<Character,Integer>();
		HashMap<Character,Integer> tMap = new HashMap<Character,Integer>();
		
		int length = s.length();
		
		int sCharPlace[] = new int[length];
		int tCharPlace[] = new int[length];
		
		char temp;
		for(int i=0;i<length;i++)
		{
			temp = s.charAt(i);
			if(sMap.containsKey(temp))
				sCharPlace[i]= sMap.get(temp);
			else
			{
				sMap.put(temp, i+1);
				sCharPlace[i]=0;
			}
		}
		for(int i=0;i<length;i++)
		{
			temp = t.charAt(i);
			if(tMap.containsKey(temp))
				tCharPlace[i]= tMap.get(temp);
			else
			{
				tMap.put(temp, i+1);
				tCharPlace[i]=0;
			}
		}
		
		for(int i=0;i<length;i++)
		{
			if(sCharPlace[i]!=tCharPlace[i])return false;
		}
		return true;
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution so = new Solution();
		String s = "ab";
		String t = "aa";
		System.out.println(so.isIsomorphic(s, t));
	}

}
