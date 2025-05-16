package com.test;

public class StackLinkedList {
	
	private static class Node
	{
		int data;
		Node next;
		
		Node(int value)
		{
			this.data=value;
			this.next=null;
		}
	}
	
	private Node top;
	
	
	StackLinkedList()
	{
		top=null; 
	}
	
	public void push(int value)
	{
		Node newNode=new Node(value);
		newNode.next=top;//new node points to old top
		top=newNode;
	}
	
	
	//[22,next]->[11,null]
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack Underflow!!");
			return -1;
		}
		
		int value=top.data;
		top=top.next;
		return value;
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty!!");
			return -1;
		}
		
	
		return top.data;
	}
	
	
	public boolean isEmpty()
	{
		return top==null;
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty!!");
			return;
		}
		
		System.out.println("Stack(top to bottom):");
		Node current=top;
		
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		StackLinkedList stack=new StackLinkedList();
		
		stack.push(11);
		stack.push(22);
		stack.push(33);
		stack.push(44);
		stack.push(55);
		
		stack.display();
		
		
		stack.pop();
		stack.pop();
		
		stack.display();
		
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());

	}

}
