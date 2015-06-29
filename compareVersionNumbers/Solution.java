package compareVersionNumbers;

public class Solution {
    public int compareVersion(String version1, String version2) {
    	int result = 0;
    	int i=0;
    	if(version1.equals(version2))return 0;
    	
    	String[] str1 = version1.split("\\.");
    	String[] str2 = version2.split("\\.");
    	
    	int minLength = str1.length<str2.length?str1.length:str2.length;
    	for(i=0;i<minLength;i++)
    	{
    		if(Integer.parseInt(str1[i])>Integer.parseInt(str2[i]))
    			{
    				result=1;
    				return result;
    			}
    		else if(Integer.parseInt(str1[i])<Integer.parseInt(str2[i]))
    			{
    				result=-1;
    				return result;
    			}
    		
    		
    	}
    	
    	//检查str1后面的是否全为0
    	if(str1.length>minLength)
    	{
    		for(int j=minLength;j<str1.length;j++)
    		{
    			if(Integer.parseInt(str1[j]) != 0)
    				{
    					result = 1;
    					return result;
    				}
    		}
    	}
    	
    	if(str2.length>minLength)
    	{
    		for(int j=minLength;j<str2.length;j++)
    		{
    			if(Integer.parseInt(str2[j]) != 0)
    				{
    					result = -1;
    					return result;
    				}
    		}
    	}
    	
    	return result;
    	
        
    }
    
    
}
