package addBinary;



public class Solution {
    public String addBinary(String a, String b) {
        char cf = '0';//标志位
        
        String longstr = a.length()>=b.length()?a:b;
        String shortstr = a.length()<b.length()?a:b;
        //处理两个字符串长度不一致问题
        char[] longArr = longstr.toCharArray();
        char[] shortArr = new char[longstr.length()];
        char[] tempshortArr = shortstr.toCharArray();
        
        for(int i=0;i<longstr.length();i++)
        {
        	if(i<tempshortArr.length)
        	{
        		shortArr[shortArr.length-1-i] = tempshortArr[tempshortArr.length-1-i];
        	}
        	else shortArr[shortArr.length-1-i] = '0';
        	
        }
        
        char[] resultArr = new char[longArr.length+1];
        
        for(int i=longstr.length()-1;i>-1;i--)
        {
        	Integer temp = cf+longArr[i]+shortArr[i];
        	switch (temp){
    		case 144:cf='0';resultArr[i+1]='0';break;
    		case 145:cf='0';resultArr[i+1]='1';break;
    		case 146:cf='1';resultArr[i+1]='0';break;
    		case 147:cf='1';resultArr[i+1]='1';break;
    		default:return "0";
        	}
        }
                
        if(cf == '1')resultArr[0]='1';
        String result = String.valueOf(resultArr);
        if(resultArr[0] == '1')
        {        	
        	return result;        	
        }
        else
        {        	
        	return result.substring(1, result.length());
        }
               	
        //return result.toString();
    }
}