package com.graph;

import java.util.*;

public class IncidenceMatrix {
    private int[][] incMatrix;
    private int numVertices;
    private int edgeCount;

    // Each edge is represented as a pair of vertices
    private List<int[]> edges;

    public IncidenceMatrix(int numVertices) {
        this.numVertices = numVertices;
        this.edges = new ArrayList<>();
    }

    public void addEdge(int u, int v) {
        edges.add(new int[]{u, v});
        edgeCount = edges.size();
    }

    public void buildMatrix() {
        incMatrix = new int[numVertices][edgeCount];

        for (int e = 0; e < edgeCount; e++) {
            int u = edges.get(e)[0];
            int v = edges.get(e)[1];

            incMatrix[u][e] = 1;
            incMatrix[v][e] = 1;
        }
    }

    public void printMatrix() {
        System.out.println("Incidence Matrix:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < edgeCount; j++) {
                System.out.print(incMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        IncidenceMatrix graph = new IncidenceMatrix(4);

        // Edges: (0-1), (0-2), (1-2), (2-3)
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        graph.buildMatrix();
        graph.printMatrix();
    }
}

