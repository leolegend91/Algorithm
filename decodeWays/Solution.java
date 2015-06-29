package decodeWays;

public class Solution {

	public int numDecodings(String s) {
        if(!check(s))return 0;
        
        int length = s.length();
        int decodeNum[] = new int[length];
        
        char tmp = s.charAt(0);
        boolean isZero =false;
        decodeNum[0]=1;
        
        for(int i=1;i<length;i++)
        {
        	if(isZero)
        	{
        		decodeNum[i]=decodeNum[i-1];
        	}
        	else
        	{
        		int decode = Integer.parseInt(s.substring(i-1, i+1));
        		if(s.charAt(i)!='0')
        		{
        			decodeNum[i] += decodeNum[i-1];
        			
        			if(decode>=10 && decode<=26)
            		{
            			decodeNum[i]+=(i>1?decodeNum[i-2]:1);        			
            		}
            		
            		
        		}
        		else
        		{
        			if(s.charAt(i-1)=='1' || s.charAt(i-1)=='2')
        			{
        				decodeNum[i]=(i>1?decodeNum[i-2]:1);
        			}
        			else
        			{
        				return 0;
        			}
        		}
        		
        	}        	
    		
    		if(s.charAt(i)=='0')
    			isZero=true;
    		else isZero=false;
        }
        return decodeNum[length-1];
        
    }
	public boolean check(String s)
	{
		if(s==null || s.length()<1)return false;
		else if(s.charAt(0)=='0')return false;
		int length = s.length();
		boolean isZero=false;
		for(int i=0;i<length;i++)
		{
			char c = s.charAt(i);
			if((c-'0')>=0 &&(c-'9')<=0)
			{
				if((c=='0')&&(!isZero))
				{
					isZero=true;
				}
				else if((c=='0')&&(isZero))
				{
					return false;
				}
				else
				{
					isZero=false;
				}
			}
			else
			{
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.numDecodings("101"));

	}

}
