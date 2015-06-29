package binaryTreeLevelOrderTraversalII;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		
		
		List<List<Integer>> tempList = new ArrayList<List<Integer>>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		if(root == null)return result;
		//设置两个队列，分别保存父节点和子节点
		Queue<TreeNode> fatherNodeList = new LinkedList<TreeNode>();
		Queue<TreeNode> childNodeList = new LinkedList<TreeNode>();
		
		TreeNode fatherNode,childNode;
		//List<Integer> list = new ArrayList<Integer>();
		
		//父队列初始化，在其中加入树的根节点
		fatherNodeList.offer(root);
		while(!fatherNodeList.isEmpty()){
			List<Integer> list = new ArrayList<Integer>();
			//当父队列不为空时，读取父队列内容
			while(!fatherNodeList.isEmpty())
			{
				//读取当前层节点的值
				fatherNode = fatherNodeList.poll();
				list.add(fatherNode.val);
				//将子节点存入子队列
				if(fatherNode.left != null)
					childNodeList.offer(fatherNode.left);
				if(fatherNode.right != null)
					childNodeList.offer(fatherNode.right);
				
			}
		
			
			//父队列全部读取之后，将根节点list加入结果集中，并清空list
			tempList.add(list);
			//System.out.println(list);
			//list.clear();
		
			//父队列全部读取之后，将子队列内容添加进父队列!!!!!!!!!!!!
			while(!childNodeList.isEmpty())
			{				
				fatherNodeList.offer(childNodeList.poll());
			}
		}
		for(int i=tempList.size();i>0;i--)
		{
			result.add(tempList.get(i-1));
		}
		return result;
    }
}
