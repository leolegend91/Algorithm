package longestCommonPrefix;

import java.util.Stack;

public class Solution {

	public String longestCommonPrefix(String[] strs) {
        if(strs==null)
        {
        	return null;
        }
        else if(strs.length==0)
        {
        	return "";
        }
        else if(strs.length==1)
        {
        	return strs[0];
        }
        
        //用两个栈交替存储处理一次后的结果
        Stack<String> stack1 = new Stack<String>();
        Stack<String> stack2 = new Stack<String>();
        //奇数个字符串,把最后一个直接入栈
        if(strs.length%2==1)
        {
        	stack1.push(strs[strs.length-1]);
        }
        int j=(strs.length-strs.length%2)/2;//用于控制循环结束
        for(int i=0;i<j;i++)
        {
        	String tempStr = commonPrefix(strs[2*i], strs[2*i+1]);
        	//如果没有公共前缀，直接返回null
        	if(tempStr.equals(""))
        	{
        		return "";
        	}
        	else
        	{
        		stack1.push(tempStr);
        	}
        }
        //开始用两个栈交替处理
        while(true)
        {
        	if(stack1.isEmpty())
        	{
        		if(stack2.size()%2==1)//如果栈中有奇数个字符串，把第一个直接弹出入另一个栈
        		{
        			stack1.push(stack2.pop());
        		}
        		while(!stack2.isEmpty())//开始处理栈2
        		{
        			String tempStr = commonPrefix(stack2.pop(), stack2.pop());
        			if(tempStr.equals(""))//如果没有公共前缀，直接返回null
                	{
                		return "";
                	}
                	else
                	{
                		stack1.push(tempStr);
                	}
        		}
        		if(stack1.size()==1)//如果栈中只剩下一个元素，跳出循环
        		{
        			return stack1.pop();
        		}        		
        	}
        	else
        	{
        		if(stack1.size()%2==1)
        		{
        			stack2.push(stack1.pop());
        		}
        		while(!stack1.isEmpty())
        		{
        			String tempStr = commonPrefix(stack1.pop(), stack1.pop());
        			if(tempStr.equals(""))
        			{
        				return "";
        			}
        			else
        			{
        				stack2.push(tempStr);
        			}
        		}
        		if(stack2.size()==1)
        		{
        			return stack2.pop();
        		}
        	}
        }
        
    }
	//寻找两个字符串的最长公共子串
	public String commonPrefix(String str1,String str2)
	{
		//str1和str2中较短字符串的长度
		int length = str1.length()<str2.length()?str1.length():str2.length();
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<length;i++)
		{
			if(str1.charAt(i)==str2.charAt(i))
			{
				builder.append(str1.charAt(i));
			}
			else
			{
				break;
			}
		}
		return builder.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] s = {};
		Solution so = new Solution();
		System.out.println(so.longestCommonPrefix(s));
	}

}
