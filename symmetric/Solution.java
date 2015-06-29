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
        //���pqͬʱΪnull�򷵻�true���������ֻ���ڸ��ڵ�Ϊnullʱ�Ż���֣���Ϊ���涼������p��Ϊnullʱ��ִ�еݹ����
        if(p==null&&q==null)return true;
        //���qΪnull�򷵻�false
        if(p==null||q==null)return false;
        if(p.val!=q.val)   	return false;
        if(p.left!=null)
        {
        	result = isSymmetricTree(p.left,q.right);
        	if(!result)return result;
        	
        }
        //�������������жϣ������p�Ŀ������������q��Ӧλ����ֵ���ǲ�ͬ��������������ȷ�ж�
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
