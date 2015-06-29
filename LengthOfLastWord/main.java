package LengthOfLastWord;

import java.util.Arrays;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int)'a');
		System.out.println((int)'z');
		System.out.println((int)'A');
		System.out.println((int)'Z');
		System.out.println((int)' ');
		
		
		String s1 = "";
		Solution sou1 = new Solution();
		System.out.println(sou1.lengthOfLastWord(s1));
		
		String s2 = "     ";
		System.out.println(Arrays.toString(s2.split(" ")));
		System.out.println(s2.split(" ").length);
		
		String s3 = "hello world   ";
		Solution1 sou3 = new Solution1();
		System.out.println(sou3.lengthOfLastWord(s3));
		
	}

}
