package removeLinkedListElements;


class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
public class Solution {

	public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        //�ѵ���val��ͷ���ɾ��
        while((head!=null)&&(head.val==val))
        {
        	head = head.next;
        }
        if(head == null) return null;
        ListNode p = head;
        while(p.next!=null)
        {
        	//���p����һ���ڵ��val����val������ɾ���������p��Ϊp.next
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
