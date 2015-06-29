package countPrimes;

public class Solution {

	public int countPrimes(int n) {
		
		if(n<2)return 0;
		
        boolean isPrime[] = new boolean[n];
        int prime[] = new int[n];
        int primeNum = 0;
        for(int i=0;i<n;i++)
        {
        	isPrime[i]=true;
        }
        for(int i=2;i<n;i++)
        {
        	if(isPrime[i])
        	{
        		prime[primeNum++] = i;
        	}
        	for(int j=0;j<primeNum;j++)
        	{
        		if(i*prime[j]<n)
        		{
        			isPrime[i*prime[j]]=false;
        		}
        		else break;
        		
        		if(i%prime[j] == 0)break;
        	}
        }
        
        return primeNum;
        
        
    }
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.countPrimes(10));
		
	}

}