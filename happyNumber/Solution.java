package happyNumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public boolean isHappy(int n) {
		if(n<1)return false;
		Set<Integer> numFlagSet = new HashSet<Integer>();
        int num = n;
        while(num!=1)
        {
        	//计算当前num的各位平方和
        	num = cacuPow(num);
        	//num如果不等于1，放入numFlag中此时有两种情况：如果冲突，说明发生了循环，返回false；否则把数组对应位置为1
        	if(!numFlagSet.add(num))
        	{
        		return false;
        	}
        	
        }
        return true;
        
    }
	
	public static int cacuPow(int n)
	{
		int result = 0;
		int temp;
		while(n>0)
		{
			temp = n%10;
			result += temp*temp;
			n=n/10;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		for(int i=0;i<100000;i++)
		{
			System.out.println(s.isHappy(i));
		}
	}

}
