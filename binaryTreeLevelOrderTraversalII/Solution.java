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
		//�����������У��ֱ𱣴游�ڵ���ӽڵ�
		Queue<TreeNode> fatherNodeList = new LinkedList<TreeNode>();
		Queue<TreeNode> childNodeList = new LinkedList<TreeNode>();
		
		TreeNode fatherNode,childNode;
		//List<Integer> list = new ArrayList<Integer>();
		
		//�����г�ʼ���������м������ĸ��ڵ�
		fatherNodeList.offer(root);
		while(!fatherNodeList.isEmpty()){
			List<Integer> list = new ArrayList<Integer>();
			//�������в�Ϊ��ʱ����ȡ����������
			while(!fatherNodeList.isEmpty())
			{
				//��ȡ��ǰ��ڵ��ֵ
				fatherNode = fatherNodeList.poll();
				list.add(fatherNode.val);
				//���ӽڵ�����Ӷ���
				if(fatherNode.left != null)
					childNodeList.offer(fatherNode.left);
				if(fatherNode.right != null)
					childNodeList.offer(fatherNode.right);
				
			}
		
			
			//������ȫ����ȡ֮�󣬽����ڵ�list���������У������list
			tempList.add(list);
			//System.out.println(list);
			//list.clear();
		
			//������ȫ����ȡ֮�󣬽��Ӷ���������ӽ�������!!!!!!!!!!!!
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
