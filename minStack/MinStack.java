package minStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStack {
	
	Stack<Integer> minStack = new Stack<Integer>();
	Stack<Integer> stack = new Stack<Integer>();
	List<Integer> minIdList = new ArrayList<Integer>();
	List<Integer> minList = new ArrayList<Integer>();
	
	public void push(int x) {
        stack.push(x);   
        
    }

    public void pop() {
        if(!stack.isEmpty())
        	stack.pop();
    }

    public int top() {
    	if(stack.isEmpty())
    		return 0;
    	else
    		return stack.peek();
    }

    public int getMin() {
    	if(stack.isEmpty())
    		return 0;
    	else
    		return minStack.peek();
    }
}
