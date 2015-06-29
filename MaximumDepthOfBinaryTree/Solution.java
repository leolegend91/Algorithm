package MaximumDepthOfBinaryTree;

public class Solution {

	public int maxDepth(TreeNode root)
	{
		
		int u = 0 , v = 0;
		
		if(root == null)return 0;
		u=maxDepth(root.left);
		v=maxDepth(root.right);
		if(u>v) return (u+1);
		return(v+1);
	}
	
}
