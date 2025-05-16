package com.test;

public class StackArray {
	
	private int maxSize;
	private int stackArray[];
	private int top;
	
	public StackArray(int size)
	{
		this.maxSize=size;
		stackArray=new int[this.maxSize];
		top=-1;
	}
	
	public void push(int value)
	{
		if(top==maxSize-1)
		{
			System.out.println("Stack Overflow!!");
			return;
		}
		
		stackArray[++top]=value;
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack Underflow!!");
			return -1;
		}
		 
		return stackArray[top--];
	}
	
	
    public int peek()
    {
    	if(isEmpty())
		{
			System.out.println("Stack is empty!!");
			return -1;
		}	
    	
    	return stackArray[top];
    }
	
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty!!");
			return;
		}
		
		System.out.println("Stack(top to bottom):");
		for(int i=top;i>=0;i--)
		{
			System.out.print(stackArray[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		
		StackArray stack=new StackArray(5);
		
		stack.push(11);
		stack.push(22);
		stack.push(33);
		stack.push(44);
		stack.push(55);
		
		stack.display();
		
		stack.push(66);
		
		stack.pop();
		stack.pop();
		
		stack.display();
		
		stack.pop();
		stack.pop();
		stack.pop();
		
		stack.pop();
		
		System.out.println(stack.isEmpty());
	}

}
