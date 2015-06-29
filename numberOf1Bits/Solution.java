package numberOf1Bits;

import java.util.HashMap;

public class Solution {

	public int hammingWeight(int n) {
        int count = 0;
		while(n!=0)
        {
        	count++;
        	n=n&(n-1);
        }
		return count;
    }
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.hammingWeight(-1));

	}

}
