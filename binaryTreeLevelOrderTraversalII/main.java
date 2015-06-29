package binaryTreeLevelOrderTraversalII;

import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) 
	{
		Solution mySolu = new Solution();
		TreeNode root = new TreeNode(3);
		root.left=new TreeNode(9);
		root.right=new TreeNode(20);
		root.right.left=new TreeNode(15);
		root.right.right=new TreeNode(7);
		//System.out.println(mySolu.levelOrderBottom(root));
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list = mySolu.levelOrderBottom(null);
		System.out.println(list);
//		List<List<Integer>> result = new ArrayList<List<Integer>>();
//		List<Integer> list1=new ArrayList<Integer>();
//		List<Integer> list2=new ArrayList<Integer>();
//		List<Integer> list3=new ArrayList<Integer>();
//		
//		list1.add(1);
//		list1.add(11);
//		list2.add(2);
//		list2.add(21);
//		list3.add(3);
//		list3.add(31);
//		result.add(list1);
//		result.add(list2);
//		result.add(list3);
//		System.out.println(result);
				
	}
}
