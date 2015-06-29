package sortList;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
public class Solution {

	public ListNode sortList(ListNode head) {
        if(head==null)return null;
        int length=0;
        ListNode p=head;
        while(p!=null&&p.next!=null)
        {
        	p=p.next.next;
        	
        	length+=2;
        }
        return mergeSort(head, length);
    }	
	
	public ListNode mergeSort(ListNode head,int length)
	{
		if(length>1)
		{
			ListNode middle = head;
			int fast=0,slow=0;
			while(fast<length)
			{
				fast+=2;
				slow+=1;
				middle=middle.next;
			}
			head = mergeSort(head,slow);
			middle = mergeSort(middle,length-slow);
			return merge(head,middle,slow,length-slow);
		}
		else
			return head;
	}
	public ListNode merge(ListNode head,ListNode middle,int leftLength,int rightLength)
	{
		ListNode p;
		int i=0,j=0;
		int temp;
		if(head.val<middle.val)
		{
			p=head;
			head=head.next;
			i++;
		}
		else
		{
			p=middle;
			middle=middle.next;
			j++;
		}
		ListNode q=p;
		while(i<leftLength && j<rightLength)
		{
			if(head.val<middle.val)
			{
				p.next=head;
				head=head.next;
				p=p.next;
				i++;
			}
			else
			{
				p.next=middle;
				middle=middle.next;
				p=p.next;
				j++;
			}			
		}
		if(i<leftLength)p.next=head;
		if(j<rightLength)p.next=middle;
		return q;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
