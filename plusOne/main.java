package plusOne;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution s1 = new Solution();
		
		int[] digits = {9};
		int result[] = s1.plusOne(digits);
		if(result != null)
		{
			for(int i=0;i<result.length;i++)
			{
				System.out.print(result[i]);
			}
		}
		else System.out.println("null");
		
		
	}

}
