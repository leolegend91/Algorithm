package uniquePaths;

public class Solution {

	//m:rows,n:columns;
	public int uniquePaths(int m, int n) {
		
		if(m<1||n<1)return 0;
		else if(m==1 || n==1)return 1;
		
        int steps[][] = new int[m][n];
        for(int i=0;i<n;i++)
        {
        	steps[0][i]=1;
        }
        for(int i=0;i<m;i++)
        {
        	steps[i][0]=1;
        }
        
        for(int i=1;i<m;i++)
        {
        	for(int j=1;j<n;j++)
        	{
        		steps[i][j]=steps[i-1][j]+steps[i][j-1];
        	}
        }
        return steps[m-1][n-1];
        
    }
	public static void main(String[] args) {
		Solution s = new Solution();
		int m=1,n=2;
		System.out.println(s.uniquePaths(m, n));

	}

}
