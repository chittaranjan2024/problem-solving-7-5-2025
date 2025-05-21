package com.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
	
	static class Edge
	{
		int target;
		int weight;
		
		
		Edge(int target,int weight)
		{
			this.target=target;
			this.weight=weight;
		}
		
		
	}
	
	static class Node implements Comparable<Node>
	{
		int vertex;
		int distance;
		
		Node(int vertex,int distance)
		{
			this.vertex=vertex;
			this.distance=distance;
		}
		
		public int compareTo(Node other)
		{
			return Integer.compare(this.distance, other.distance);
		}
	}
	
	
	static void dijkstra(List<List<Edge>> graph,int source)
	{
		int V=graph.size();
		int dist[]=new int[V];
		
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[source]=0;
		
		PriorityQueue<Node> pq=new PriorityQueue<>() ;
		
		pq.add(new Node(source,0));
		
		
		while(!pq.isEmpty())
		{
			Node current=pq.poll();
			int u=current.vertex;
			
			for(Edge edge:graph.get(u))
			{
				int v=edge.target;
				int weight=edge.weight;
				
				if(dist[u]+weight<dist[v])
				{
					dist[v]=dist[u]+weight;
					pq.add(new Node(v, dist[v]));
				}
			}
			
			
		}
		System.out.println("Vertex distance from source "+source);
		for(int i=0;i<V;i++)
		{
			System.out.println(i+" \t\t "+dist[i]);
		}
	}

	public static void main(String[] args) {
		
		int v=5;
		List<List<Edge>> graph=new ArrayList<List<Edge>>();
		
		for(int i=0;i<v;i++)
		{
			graph.add(new ArrayList<>());
		}
		
		graph.get(0).add(new Edge(1,10));
		graph.get(0).add(new Edge(4,3));
		graph.get(1).add(new Edge(2,2));
		graph.get(1).add(new Edge(4,4));
		graph.get(2).add(new Edge(3,9));
		graph.get(3).add(new Edge(2,7));
		graph.get(4).add(new Edge(1,1));
		graph.get(1).add(new Edge(2,8));
		graph.get(1).add(new Edge(3,2));
		
		dijkstra(graph, 0);
	}

}
