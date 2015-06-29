package excelColumnNumber;

import java.util.regex.*;
public class Solution {
	public int titleToNumber(String s) {
        int result = 0;
        int charToNum = 0;
        double add = 0;
        Pattern p = Pattern.compile("[A-Z]*");
        Matcher m = p.matcher(s);        
        if(!m.matches())return 0;
        
        char[] sArray = s.toCharArray();
        for(int i=0;i<sArray.length;i++)
        {
        	charToNum = (int)sArray[i]-64;
        	add = charToNum*(Math.pow(26, sArray.length-i-1));
        	result += add;
        }
        
        return result;
    }
}
