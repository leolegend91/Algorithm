package implementStrstr;

public class Solution {

	public int strStr(String haystack, String needle) {
        if(haystack==null||needle==null)return -1;
        if(needle.length()==0)return 0;
        if(haystack.length()==0)return -1;
        if(haystack.length()<needle.length())return -1;
		
		int next[] = new int[needle.length()];
        next=getNext(needle);
        
        int i=0,j=0;//两个字符串的索引
        int hayLength = haystack.length();
        int needleLength = needle.length();
		
        while(i<hayLength&&j<needleLength)
        {
        	if(j==-1||(haystack.charAt(i)==needle.charAt(j)))
        	{
        		++i;
        		++j;
        	}
        	else
        	{
        		j=next[j];
        	}
        }
        
        if(j==needleLength)
        	return (i-j+1);
        else return -1;
    }
	
	public static int[] getNext(String comp)
	{
		char comp2array[] = new char[comp.length()];
		comp2array = comp.toCharArray();
		int next[] = new int[comp.length()];
		next[0]=-1;
		int k=-1;//记录前一个字符对应的相同前缀后缀的最大值；
		int j=0;//字符串位置指针
		while(j<comp.length()-1)
		{
			if(k==-1||comp2array[j]==comp2array[k])
			{
				++k;
				++j;
				next[j]=k;
			}
			else
			{
				k=next[k];//递归求前面comp[0...k-1]的子串，以匹配comp[j]
			}
		}
		return next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "";
		String s2 = "";
		Solution s = new Solution();
		System.out.println(s.strStr(s1, s2));
	}

}
