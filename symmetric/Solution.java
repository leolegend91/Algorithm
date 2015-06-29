package symmetric;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class Solution {

	/**
	 * @param args
	 */
	public boolean isSymmetric(TreeNode root) {
	
		if(root==null)return true;
		return isSymmetricTree(root.left,root.right);
	}
	
	public boolean isSymmetricTree(TreeNode p, TreeNode q) {
        boolean result = true;
        //如果pq同时为null则返回true，这种情况只有在根节点为null时才会出现，因为后面都控制了p不为null时才执行递归操作
        if(p==null&&q==null)return true;
        //如果q为null则返回false
        if(p==null||q==null)return false;
        if(p.val!=q.val)   	return false;
        if(p.left!=null)
        {
        	result = isSymmetricTree(p.left,q.right);
        	if(!result)return result;
        	
        }
        //如果不加下面的判断，则对于p的空左子树，如果q对应位置有值，是不同的树，但不能正确判断
    	if(p.left==null&&q.right!=null)return false;
        if(p.right!=null)
        {
        	result = isSymmetricTree(p.right,q.left);
        	if(!result)return result;
        	
        }
        if(p.right==null&&q.left!=null)return false;
        return result;
    }
	

}
