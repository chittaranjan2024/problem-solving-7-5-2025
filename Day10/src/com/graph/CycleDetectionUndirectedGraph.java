package com.graph;

import java.util.*;

public class CycleDetectionUndirectedGraph {
    
    // Graph represented as an adjacency list
    static class Graph {
        int V; // Number of vertices
        List<List<Integer>> adjList;

        Graph(int vertices) {
            V = vertices;
            adjList = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                adjList.add(new ArrayList<>());
            }
        }

        // Add edge for undirected graph
        void addEdge(int u, int v) {
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        // Function to detect cycle in the graph
        boolean hasCycle() {
            boolean[] visited = new boolean[V];

            // Check each component
            for (int i = 0; i < V; i++) {
                if (!visited[i]) {
                    if (dfs(i, visited, -1)) {
                        return true;
                    }
                }
            }

            return false;
        }

        // DFS helper
        boolean dfs(int node, boolean[] visited, int parent) {
            visited[node] = true;

            for (int neighbor : adjList.get(node)) {
                if (!visited[neighbor]) {
                    if (dfs(neighbor, visited, node)) {
                        return true;
                    }
                } else if (neighbor != parent) {
                    // Visited neighbor not equal to parent -> cycle
                    return true;
                }
            }

            return false;
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 1); // This edge creates a cycle

        if (g.hasCycle()) {
            System.out.println("Graph contains a cycle.");
        } else {
            System.out.println("Graph does not contain a cycle.");
        }
    }
}
