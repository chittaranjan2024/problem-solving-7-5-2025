package com.linkedlist;

public class ReverseLinkedList {

	public static Node reverse(Node head)
	{
		Node prev=null;
		Node current=head;
		Node next=null;
		
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		
		return prev;
	}
	
	public static void printList(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" -->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		
      Node head=new Node(1);
      head.next=new Node(2);
      head.next.next=new Node(3);
      head.next.next.next=new Node(4);
      
      ReverseLinkedList list=new ReverseLinkedList();
      printList(head);
      
      Node newHead=reverse(head);
      
      printList(newHead);
	}

}
