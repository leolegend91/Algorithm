package addTwoNumbers;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

public class Solution {

	public ListNode addTwoNumbersOld(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        else if(l2==null)return l1;
        
        int length1=1,length2=1;
        ListNode lx = l1;
        ListNode ly = l2;
        
        //ͳ����������ĳ���
        while(lx.next!=null)
        {
        	lx = lx.next;
        	length1++;
        }
        while(ly.next!=null)
        {
        	ly = ly.next;
        	length2++;
        }
        //�����������ƶ���λ��Ȼ���ٿ�ʼ����
        lx = l1;
        ly = l2;
        int length = 0;
        int flag = 0;
        if(length1>length2)
        {
        	length = length1-length2;
        	while(length>0)
        	{
        		lx = lx.next;
        		length--;
        		
        	}
        	
        	while(lx!=null)
        	{
        		lx.val = lx.val+ly.val+flag;
        		if(lx.val>9)
        		{
        			flag = 1;
        			lx.val = lx.val%10;
        		}
        		
        		if((lx.next==null) && (flag!=0))
        		{
        			lx.next = new ListNode(1);
        			break;
        		}
        		lx = lx.next;
        		ly = ly.next;
        	}
        	
        	return l1;
        }
        else
        {
        	length = length2-length1;
        	while(length>0)
        	{
        		ly = ly.next;
        		length--;
        	}
        	
        	while(ly!=null)
        	{
        		ly.val = lx.val+ly.val+flag;
        		if(ly.val>9)
        		{
        			flag = 1;
        			ly.val = ly.val%10;
        		}
        		if((ly.next==null) && (flag!=0))
        		{
        			ly.next = new ListNode(1);
        			break;
        		}
        		lx = lx.next;
        		ly = ly.next;
        	}
        	if(flag != 0)
        	{
        		ly = new ListNode(1);
        	}
        	return l2;
        }
        
    }
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1==null)return l2;
        else if(l2==null)return l1;
        
        int length1=1,length2=1;
        ListNode lx = l1;
        ListNode ly = l2;
        
        int flag = 0;//��λ��־
        
        //ͳ����������ĳ���
        while(lx.next!=null)
        {
        	lx = lx.next;
        	length1++;
        }
        while(ly.next!=null)
        {
        	ly = ly.next;
        	length2++;
        }
        
        lx = l1;
        ly = l2;
        //���l1>=l2����ѽ������l1�У�����ѽ������l1��
        if(length1>=length2)
        {
out0:      	while(true)
        	{
        		lx.val = lx.val+ly.val+flag;
        		if(lx.val>9)
        		{
        			lx.val = lx.val%10;
        			flag = 1;
        		}
        		else
        		{
        			flag = 0;
        		}
        		//lx�������һ���ڵ㣬ֱ�Ӹ���flag�ж��Ƿ�Ҫ���ӽڵ�
        		if((lx.next==null)&&(flag !=0))
        		{
        			lx.next = new ListNode(1);
        			break out0;
        		}
        		//lxû�е����һ���ڵ㣬ly�������һ���ڵ㣬lxѭ��������ӣ�ֱ��flag����0
        		else if(ly.next==null)
        		{
        			lx = lx.next;
        			while(flag != 0)
        			{
        				lx.val = lx.val+flag;
        				if(lx.val>9)
        				{
        					lx.val = lx.val%10;
        					flag = 1;
        				}
        				else
        				{
        					flag = 0;
        				}
        				//lx�������һ���ڵ㣬ֱ�Ӹ���flag�ж��Ƿ�Ҫ���ӽڵ�
                		if((lx.next==null)&&(flag !=0))
                		{
                			lx.next = new ListNode(1);
                			break out0;
                		}
        				lx = lx.next;
        			}
        			break out0;
        		}
        		lx = lx.next;
        		ly = ly.next;
        	}
        	return l1;
        }
        
        else
        {
out1:      	while(true)
        	{
        		ly.val = lx.val+ly.val+flag;
        		if(ly.val>9)
        		{
        			ly.val = ly.val%10;
        			flag = 1;
        		}
        		else
        		{
        			flag = 0;
        		}
        		if(lx.next==null)
        		{
        			ly = ly.next;
        			while(flag != 0)
        			{
        				ly.val = ly.val+flag;
        				if(ly.val>9)
        				{
        					ly.val = ly.val%10;
        					flag = 1;
        				}
        				else
        				{
        					flag = 0;
        				}
        				//lx�������һ���ڵ㣬ֱ�Ӹ���flag�ж��Ƿ�Ҫ���ӽڵ�
                		if((ly.next==null)&&(flag !=0))
                		{
                			ly.next = new ListNode(1);
                			break out1;
                		}
        				ly = ly.next;
        			}
        			break out1;
        		}
        		lx = lx.next;
        		ly = ly.next;
        	}
        	return l2;
        }
        
    }
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(4);
		ListNode l3 = new ListNode(0);
		ListNode l4 = new ListNode(5);
		ListNode l5 = new ListNode(6);
		ListNode l6 = new ListNode(0);
		
		
		l1.next = l2;
		l2.next = l3;
		l4.next = l5;
		l5.next = l6;
		
		
		Solution s = new Solution();
		ListNode head = s.addTwoNumbers(l1, l4);
		
		while(head!=null)
		{
			System.out.print(head.val);
			System.out.print("->");
			head = head.next;
		}

	}

}
