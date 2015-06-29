package StringToInteger;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "  112343";
		System.out.println(s1.matches("\\s|\\d+"));
		
		
		String s2 = "   1.1233";
		Solution sou = new Solution();
		System.out.println(sou.atoi(s2));
		
		System.out.println((int)'1');
		
		String s3 = "";
		System.out.println(s3.equals(""));

	}

}
