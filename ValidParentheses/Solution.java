package ValidParentheses;

import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {
        Stack<Character> bracketStack = new Stack<Character>();
        char[] s2char = s.toCharArray();
        for(int i=0;i<s2char.length;i++)
        {
        	//������������ŵ������ţ�����ջ��
        	if((s2char[i]=='(')||(s2char[i]=='[')||(s2char[i]=='{'))
        	{
        		bracketStack.push(s2char[i]);
        		continue;
        	}
        	//�����С���ŵ������ţ���ջƥ����
        	else if((s2char[i]==')'))
        	{
        		try{
        		//����һ��С����ƥ��ɹ�
        		if(bracketStack.pop()=='(')
        		{
        			continue;
        		}
        		//����һ��С����ƥ�䲻�ɹ�
        		else{
        			return false;
        		}
        		}
        		catch(Exception e)
        		{
        			return false;
        		}
        	}
        	//����������ŵ������ţ���ջƥ����
        	else if((s2char[i]==']'))
        	{
        		try{
        		//����һ��������ƥ��ɹ�
        		if(bracketStack.pop()=='[')
        		{
        			continue;
        		}
        		//����һ��������ƥ�䲻�ɹ�
        		else{
        			return false;
        		}
        		}
        		catch(Exception e)
        		{
        			return false;
        		}
        	}
        	//����Ǵ����ŵ������ţ���ջƥ����
        	else if((s2char[i]=='}'))
        	{
        		try{
        		//����һ��������ƥ��ɹ�
        		if(bracketStack.pop()=='{')
        		{
        			continue;
        		}
        		//����һ��������ƥ�䲻�ɹ�
        		else{
        			return false;
        		}
        		}
        		catch(Exception e)
        		{
        			return false;
        		}
        	}
        	//���벻�Ϸ�������false
        	else{
        		return false;
        	}
        		
        }
        //ջΪ�գ�����true
        if(bracketStack.isEmpty())
        {
        	return true;
        }
        //ջ��Ϊ�գ�����false
        else {
        	return false;
        }
        
        
    }

}
