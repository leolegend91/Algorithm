package reverseWordsIAaString;

public class Solution {
	
	public String reverseWords(String s) {
		if(s.length()<1)return s;
		
		int begin=0;
		while((begin<s.length()) && (s.charAt(begin)==' '))
		{
			begin++;
		}
		
		if(begin == s.length())return "";
		s = s.substring(begin);		
		
        String in[] = s.split(" ");
        int length = in.length;
        
        StringBuilder sb = new StringBuilder();
        for(int i=length-1;i>=0;i--)
        {
        	if(in[i].length()>0)
        	{
        		sb.append(in[i]);
        		if(i>0)
            	{
            		sb.append(" ");
            	}
        	}
        	else
        	{
        		continue;
        	}
        	
        	
        }
        
        return sb.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution s = new Solution();
		System.out.println(s.reverseWords("   "));
	}

}
