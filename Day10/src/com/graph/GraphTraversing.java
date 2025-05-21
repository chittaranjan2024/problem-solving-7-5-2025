package com.graph;

import java.util.LinkedList;
import java.util.Queue;

public class GraphTraversing {
	
	private int vertices;
	private LinkedList<Integer>[] adjList;
	
	public GraphTraversing(int vertices)
	{
		this.vertices=vertices;
		adjList=new LinkedList[vertices];
		
		for(int i=0;i<vertices;i++)
		{
			adjList[i]=new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int source,int destination)
	{
		adjList[source].add(destination);
		adjList[destination].add(source);//for directed graph remove the line
		
	}
	//DFS helper method(recursive)
	private void dfsUtil(int vertex,boolean visited[])
	{
		visited[vertex]=true;
		System.out.print(vertex+" ");
		
		
		for(int neighbor:adjList[vertex])
		{
			if(!visited[neighbor])
			{
				dfsUtil(neighbor, visited);
			}
		}
	}
	
	public void dfs(int start)
	{
		boolean visited[]=new boolean[vertices];
		System.out.println("DFS starting from node "+start+": ");
		dfsUtil(start,visited);
		System.out.println();
	}

	public void bfs(int start)
	{
		boolean visited[]=new boolean[vertices];
		Queue<Integer> queue=new LinkedList<Integer>();
		
		
		visited[start]=true;
		queue.offer(start);
		
		System.out.println("BFS starting from node "+start+": ");
		
		while(!queue.isEmpty())
		{
			int current=queue.poll();
			System.out.print(current+" ");
			
			
			for(int neighbor:adjList[current])
			{
				if(!visited[neighbor])
				{
					visited[current]=true;
					queue.offer(neighbor);
				}
			}
		}
		
		System.out.println();
	}
	public static void main(String[] args) {
		
		GraphTraversing graph=new GraphTraversing(6);//0,1,2,3,4,5
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 5);
		
		graph.dfs(0);
		graph.bfs(0);
	}

}
