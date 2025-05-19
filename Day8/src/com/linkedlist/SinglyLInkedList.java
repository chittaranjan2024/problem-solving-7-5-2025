package com.linkedlist;
class Node
{
	int data;
	Node next;
	
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class SinglyLInkedList {
	
	private Node head;
	
	//add at the beginning
	public void addFirst(int data)
	{
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}
	
	
	public void addLast(int data)
	{
		Node newNode=new Node(data);
		
		if(head==null)
		{
			head=newNode;
			return;
		}
		
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		
		current.next=newNode;
	}

	
	
	public void insertAt(int index,int data)
	{
		if(index<0 || index>=size())
		{
			System.out.println("Invalid index!");
			return;
		}
		
		if(index==0)
		{
			addFirst(data); 
			return;
		}
		
		Node newNode=new Node(data);
		Node current=head;
		
		for(int i=0;i<index-1;i++)
		{
			current=current.next;
		}
		
		newNode.next=current.next;
		current.next=newNode;
		
		
	}
	
	public void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		
		head=head.next;
	}
	
	
	public void deleteLast()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		
		if(head.next==null)
		{
			head=null;
			return;
		}
		
		Node current=head;
		while(current.next.next!=null)
		{
			current=current.next;
		}
		
		current.next=null;
	}
	
	
	public void deleteAt(int index)
	{
		if(index<0 || index>=size())
		{
			System.out.println("Invalid index!");
			return;
		}
		
		if(index==0)
		{
			deleteFirst();
			return;
		}
		
		Node current=head;
		for(int i=0;i<index-1;i++)
		{
			current=current.next;
		}
		
		current.next=current.next.next;
	}
	
	
	public boolean search(int key)
	{
		Node current=head;
		while(current!=null)
		{
			if(current.data==key)
			{
				return true;
			}
			current=current.next;
		}
		
		return false;
	}
	
	public void display()
	{

		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		
		
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+" -> ");
			current=current.next;
		}
		
		System.out.println("NUll");
	}
	
	public int size()
	{
		int count=0;
		Node current=head;
		while(current!=null)
		{
			count++;
			current=current.next;
		}
		return count;
	}
	public static void main(String[] args) {
		

		SinglyLInkedList list=new SinglyLInkedList();
		list.addFirst(11);
		list.addLast(99);
		
		list.insertAt(1, 33);
		list.insertAt(2, 44);
		list.insertAt(3, 55);
		
		list.display();
		
		list.deleteFirst();
		list.deleteLast();
		
		list.display();
		
		System.out.println(list.search(33));
	}

}
