package removeLinkedListElements;


class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
public class Solution {

	public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        //把等于val的头结点删除
        while((head!=null)&&(head.val==val))
        {
        	head = head.next;
        }
        if(head == null) return null;
        ListNode p = head;
        while(p.next!=null)
        {
        	//如果p的下一个节点的val等于val，则将其删除，否则把p变为p.next
        	if(p.next.val==val)
        	{
        		p.next = p.next.next;
        	}
        	else{
        		p = p.next;
        	}
        }
        return head;
        
    }
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		Solution s = new Solution();
		
		ListNode head = s.removeElements(l1, 1);
		while(head != null)
		{
			System.out.println(head.val);
			head = head.next;
		}

	}

}
