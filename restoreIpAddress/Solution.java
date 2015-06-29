package restoreIpAddress;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {

	public List<String> restoreIpAddresses(String s) {
		List<String> resultList = new ArrayList<String>();
        if(s.length()<4||s.length()>12)return resultList;
		
        int sLength = s.length();
		int firstDot,secondDot,thirdDot;
		String seg1,seg2,seg3,seg4;
		for(firstDot=1;firstDot<4&&firstDot<sLength;firstDot++)
		{
			for(secondDot=firstDot+1;secondDot<7&&secondDot<sLength;secondDot++)
			{
				for(thirdDot=secondDot+1;thirdDot<10&&thirdDot<sLength;thirdDot++)
				{
					seg4=s.substring(thirdDot,sLength);
					if(!check(seg4))continue;
					seg3=s.substring(secondDot,thirdDot);
					if(!check(seg3))continue;
					seg2=s.substring(firstDot,secondDot);
					if(!check(seg2))continue;
					seg1=s.substring(0,firstDot);
					if(!check(seg1))continue;
					
					StringBuffer sb = new StringBuffer();
					sb.append(seg1);
					sb.append(".");
					sb.append(seg2);
					sb.append(".");
					sb.append(seg3);
					sb.append(".");
					sb.append(seg4);
					resultList.add(sb.toString());				
				}
			}
		}
        
        return resultList;
    }
	
	public boolean check(String s)
	{
		boolean check = false;
		if(Integer.parseInt(s)>255)return false;
		if(s.length()>1&&s.charAt(0)=='0')return false;
		return true;
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		List<String> result = new ArrayList<String>();
		
		result = s.restoreIpAddresses("");
		Iterator ite = result.iterator();
		
		while(ite.hasNext())
		{
			System.out.print(ite.next());
			System.out.print(",");
		}

	}

}
