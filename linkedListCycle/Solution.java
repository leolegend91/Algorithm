package linkedListCycle;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
public class Solution {

    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null)return false;
        
        ListNode px = head;
        ListNode py = head;
        
        while(px!=null&&px.next!=null&&py!=null)
        {
        	px = px.next.next;
        	py = py.next;
        	if(px == py)return true;        	
        }
        return false;        
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
