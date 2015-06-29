package pathSum;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class Solution {

	public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)return false;
        //当前节点非叶子节点，继续向下查找
        if(root.left!=null)
        {
        	if(hasPathSum(root.left,sum-root.val))
        		return true;
        }
        if(root.right!=null)
        {
        	if(hasPathSum(root.right, sum-root.val))
        		return true;
        }
        //已达到叶子节点
        if((root.left==null)&&(root.right==null))
        {
        	if(root.val==sum)return true;
        }
        return false;
    }
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(5);
		TreeNode node2 = new TreeNode(4);
		TreeNode node3 = new TreeNode(8);
		TreeNode node4 = new TreeNode(11);
		TreeNode node5 = new TreeNode(13);
		TreeNode node6 = new TreeNode(4);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(2);
		TreeNode node9 = new TreeNode(1);
		
		node1.left=node2;
		node1.right=node3;
		node2.left=node4;
		node3.left=node5;
		node3.right=node6;
		node4.left=node7;
		node4.right=node8;
		node6.right=node9;
		
		Solution s = new Solution();
		
		System.out.println(s.hasPathSum(node1, 22));
		
		TreeNode node11 = new TreeNode(1);
		TreeNode node12 = new TreeNode(2);
		node11.left=node12;
		System.out.println(s.hasPathSum(node11, 1));

	}

}
