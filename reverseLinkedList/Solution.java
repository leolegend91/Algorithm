package reverseLinkedList;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

public class Solution {

	public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null)return head;
        
        ListNode pCur = head;
        ListNode pNext = pCur.next;
        ListNode pNextNext = pNext.next;
        pCur.next=null;
        while(true)
        {
        	pNext.next=pCur;
        	
        	pCur = pNext;
        	pNext = pNextNext;
        	if(pNext == null)break;
        	else
        	{
        		pNextNext = pNext.next;
        	}
        	
        }
        return pCur;
    }
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		
		Solution s = new Solution();
		ListNode p = s.reverseList(n1);
		
		while(p!=null)
		{
			System.out.print(p.val);
			System.out.print(" ");
			p = p.next;
		}
		

	}

}
