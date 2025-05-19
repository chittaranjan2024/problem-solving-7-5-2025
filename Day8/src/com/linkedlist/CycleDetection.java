package com.linkedlist;

class ListNode
{
	int data;
	ListNode next;
	
	public ListNode(int data)
	{
		this.data=data;
		this.next=null;
	}
}

public class CycleDetection {
	
	public static boolean hasCycle(ListNode head)
	{
		if(head==null || head.next==null)
		{
			return false;
		}
		
		ListNode slow=head;
		ListNode fast=head;
		
		
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			
			
			if(slow==fast)
			{
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		
		ListNode head=new ListNode(3);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(8);
		ListNode node4=new ListNode(78);
		
		
		head.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node2;//cycle
		
		// head->node2->node3->node4->node2
		
		System.out.println(hasCycle(head));
		

	}

}
