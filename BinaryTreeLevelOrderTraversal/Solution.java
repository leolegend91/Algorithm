package BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {

	public List<List<Integer>> levelOrder(TreeNode root) {
		
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        if(root==null)return resultList;
        int cur=0;
        int last = 1;
        List<TreeNode> treeList = new ArrayList<TreeNode>();
        treeList.add(root);
        while(cur<treeList.size())
        {
        	last=treeList.size();
        	List<Integer> levelList = new ArrayList<Integer>();
        	while(cur<last)
        	{
        		levelList.add(treeList.get(cur).val);
        		if(treeList.get(cur).left!=null)
        			{
        				treeList.add(treeList.get(cur).left);
        			}
        		if(treeList.get(cur).right!=null)
    			{
    				treeList.add(treeList.get(cur).right);
    			}
        		cur++;
        	}
        	resultList.add(levelList);
        }
        return resultList;
   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode node1 = new TreeNode(3);
		TreeNode node2 = new TreeNode(9);
		TreeNode node3 = new TreeNode(20);
		TreeNode node4 = new TreeNode(15);
		TreeNode node5 = new TreeNode(7);
		
		node1.left=node2;
		node1.right=node3;
		node3.left=node4;
		node3.right=node5;
		
		Solution s = new Solution();
		
		System.out.println(s.levelOrder(null));
	}

}
