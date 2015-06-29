package ValidParentheses;

import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {
        Stack<Character> bracketStack = new Stack<Character>();
        char[] s2char = s.toCharArray();
        for(int i=0;i<s2char.length;i++)
        {
        	//如果是三个括号的左括号，则入栈；
        	if((s2char[i]=='(')||(s2char[i]=='[')||(s2char[i]=='{'))
        	{
        		bracketStack.push(s2char[i]);
        		continue;
        	}
        	//如果是小括号的右括号，出栈匹配检查
        	else if((s2char[i]==')'))
        	{
        		try{
        		//与上一个小括号匹配成功
        		if(bracketStack.pop()=='(')
        		{
        			continue;
        		}
        		//与上一个小括号匹配不成功
        		else{
        			return false;
        		}
        		}
        		catch(Exception e)
        		{
        			return false;
        		}
        	}
        	//如果是中括号的右括号，出栈匹配检查
        	else if((s2char[i]==']'))
        	{
        		try{
        		//与上一个中括号匹配成功
        		if(bracketStack.pop()=='[')
        		{
        			continue;
        		}
        		//与上一个中括号匹配不成功
        		else{
        			return false;
        		}
        		}
        		catch(Exception e)
        		{
        			return false;
        		}
        	}
        	//如果是大括号的右括号，出栈匹配检查
        	else if((s2char[i]=='}'))
        	{
        		try{
        		//与上一个大括号匹配成功
        		if(bracketStack.pop()=='{')
        		{
        			continue;
        		}
        		//与上一个大括号匹配不成功
        		else{
        			return false;
        		}
        		}
        		catch(Exception e)
        		{
        			return false;
        		}
        	}
        	//输入不合法，返回false
        	else{
        		return false;
        	}
        		
        }
        //栈为空，返回true
        if(bracketStack.isEmpty())
        {
        	return true;
        }
        //栈不为空，返回false
        else {
        	return false;
        }
        
        
    }

}
