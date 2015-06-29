package linkedListCycleII;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
     public String toString()
     {
    	 return String.valueOf(this.val);
     }
}

public class Solution {
	
	public ListNode detectCycle(ListNode head){
		//如果输入为null或只有一个节点，返回null
        if(head==null || head.next==null)return null;
        
        ListNode fast=head;
        ListNode slow=head;
        
        while(fast!=null && fast.next!=null)
        {
        	fast=fast.next.next;
        	slow = slow.next;
        	//有环
        	if(fast == slow)
        	{
        		fast = head;
        		while(fast!=slow)
        		{
        			fast = fast.next;
        			slow = slow.next;
        		}
        		break;
        	}
        }
        //如果有环
        if(fast!=null && fast.next!=null) return fast;
        else return null;
    }
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		ListNode n7 = new ListNode(7);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		n7.next=n5;
		
		Solution s = new Solution();
		System.out.println(s.detectCycle(n1));

	}

}
