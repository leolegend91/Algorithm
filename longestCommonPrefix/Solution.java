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
        
        //������ջ����洢����һ�κ�Ľ��
        Stack<String> stack1 = new Stack<String>();
        Stack<String> stack2 = new Stack<String>();
        //�������ַ���,�����һ��ֱ����ջ
        if(strs.length%2==1)
        {
        	stack1.push(strs[strs.length-1]);
        }
        int j=(strs.length-strs.length%2)/2;//���ڿ���ѭ������
        for(int i=0;i<j;i++)
        {
        	String tempStr = commonPrefix(strs[2*i], strs[2*i+1]);
        	//���û�й���ǰ׺��ֱ�ӷ���null
        	if(tempStr.equals(""))
        	{
        		return "";
        	}
        	else
        	{
        		stack1.push(tempStr);
        	}
        }
        //��ʼ������ջ���洦��
        while(true)
        {
        	if(stack1.isEmpty())
        	{
        		if(stack2.size()%2==1)//���ջ�����������ַ������ѵ�һ��ֱ�ӵ�������һ��ջ
        		{
        			stack1.push(stack2.pop());
        		}
        		while(!stack2.isEmpty())//��ʼ����ջ2
        		{
        			String tempStr = commonPrefix(stack2.pop(), stack2.pop());
        			if(tempStr.equals(""))//���û�й���ǰ׺��ֱ�ӷ���null
                	{
                		return "";
                	}
                	else
                	{
                		stack1.push(tempStr);
                	}
        		}
        		if(stack1.size()==1)//���ջ��ֻʣ��һ��Ԫ�أ�����ѭ��
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
	//Ѱ�������ַ�����������Ӵ�
	public String commonPrefix(String str1,String str2)
	{
		//str1��str2�н϶��ַ����ĳ���
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
