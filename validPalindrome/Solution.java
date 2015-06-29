package validPalindrome;
//时间复杂度较高
public class Solution {

	public boolean isPalindrome(String s) {
        if(s.equals(null))
        {
        	return true;
        }
        else if(pickAlphaNum(s).equals(""))
        {
        	return true;
        }
        else if(pickAlphaNum(s).length()==1)
        {
        	return true;
        }
        
        String pickS = pickAlphaNum(s);
        for(int i=0;i<(pickS.length()>>1);i++)
        {
        	if(pickS.charAt(i)!=pickS.charAt(pickS.length()-1-i))
        	{
        		return false;
        	}
        }
        return true;
    }
	
	public String pickAlphaNum(String s)
	{
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			char tempchar = s.charAt(i);
			
			if(((tempchar+1>'0')&&(tempchar-1<'9'))||((tempchar+1>'a')&&(tempchar-1<'z')))
			{
				builder.append(tempchar);
			}
			else if((tempchar+1>'A')&&(tempchar-1<'Z'))
			{
				builder.append(Character.toLowerCase(tempchar));
			}
		}
		return builder.toString();
	}
	public static int foo(int x,int y)
	{
		if(x<=0||y<=0)
			return 1;
		return 3*foo(x-1,y/2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.isPalindrome("    abaa "));
		
		
		int m=10,n=9,x,y,z;
		x=(--m==n++)?--m:++n;
		y=m++;
		z=n;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		System.out.println(foo(3,5));
		
		
		
		
	}

}
