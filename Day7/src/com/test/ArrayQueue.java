package com.test;

public class ArrayQueue {
	
	private int rear,front,size;
	private int capacity;
	private int queue[];
	
	public ArrayQueue(int capacity)
	{
		this.capacity=capacity;
		queue=new int[capacity];
		front=size=0;
		rear=capacity-1;
	}
	
	boolean isEmpty()
	{
		return (size==0);
	}
	
	boolean isFull()
	{
		return (size==capacity);
	}
	
	void enqueue(int item)
	{
			if(isFull())
			{
				System.out.println("Queue is full!");
				return;
			}
			
			rear=(rear+1)%capacity;
			queue[rear]=item;
			size++;
	}
	
	
	int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty!");
			return-1;
		}
		
		int item=queue[front];
		front=(front+1)%capacity;
		size--;
		return item;
	}
	
	int front()
	{
		if(isEmpty()) return -1;
		return queue[front];
	}
	
	
	int rear()
	{
		if(isEmpty()) return -1;
		
		return queue[rear];
	}
	
	void display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty!");
			return;
		}
		
		System.out.println("Queue :");
		for(int i=0;i<size;i++)
		{
			int index=(front+i)%capacity;
			System.out.print(queue[index]+" ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		ArrayQueue queue=new ArrayQueue(5);
		queue.enqueue(11);
		queue.enqueue(22);
		queue.enqueue(33);
		queue.enqueue(44);
		
		queue.display();
		
		queue.dequeue();
		
		queue.display();
		
		System.out.println(queue.rear());
		System.out.println(queue.front());
	}

}
