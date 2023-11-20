package dsa.graph;
import java.util.*;

public class graphchatgpt {
    public static void main(String[] args) {
        // Assuming 4 vertices (numbered 1 to 4)
        int numVertices = 4;

        // Create an array of lists to represent the adjacency list
        LinkedList<Integer> adj[] = new LinkedList[numVertices + 1];

        // Initialize each element in the array with an empty list
        for (int i = 1; i <= numVertices; i++) {
            adj[i] = new LinkedList<>();
        }

        // Add edges to the graph
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);

        // Print the adjacency list
        printAdjacencyList(adj);
    }

    static void addEdge(LinkedList<Integer> adj[], int u, int v) {
        adj[u].add(v);
        adj[v].add(u); // For undirected graph, add this line to add the edge in both directions
    }

    static void printAdjacencyList(LinkedList<Integer> adj[]) {
        for (int i = 1; i < adj.length; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (Integer neighbor : adj[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
