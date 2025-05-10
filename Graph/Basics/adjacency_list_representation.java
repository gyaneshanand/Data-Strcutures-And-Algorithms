package Graph.Basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class adjacency_list_representation {

    private static List<List<Integer>> directedGraphAdjacenyList(){

        /**
         * Nodes -> ( 1 , 2 , 3 , 4 )
         * N = 4 , M = 5
         * 1 2
         * 1 4
         * 2 3
         * 2 4
         * 3 4
         */

        int N = 4;
        int M = 5;

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        addEdgeInDirectedGraph(graph, 1, 2);
        addEdgeInDirectedGraph(graph, 1, 4);
        addEdgeInDirectedGraph(graph, 2, 3);
        addEdgeInDirectedGraph(graph, 2, 4);
        addEdgeInDirectedGraph(graph, 3, 4);

        return graph;
    }

    private static void addEdgeInDirectedGraph(List<List<Integer>> graph, int src, int dest){
        graph.get(src).add(dest);
    }

    private static void addEdgeInUnDirectedGraph(List<List<Integer>> graph, int src, int dest){
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }

    public static void main(String[] args) {

        // Graph Storage ( Creation )

        // Addition of an Edge in Graph

        // Addition of a Vertex

        // Getting All Edges of a Node O(no of Edges connected to a Vertex )

        // Is Edge Present (u -> v) : O(V)
    }

}

// ===============================

// Another Better and Modular Code

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(6, false);   // 6 vertices, undirected
        
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);
        
        g.printFrom(1);  // prints adjacency from vertex 1 onward
    }
}

class Graph {
    private final List<List<Integer>> adj;
    private final boolean isDirected;

    public Graph(int numVertices, boolean isDirected) {
        this.isDirected = isDirected;
        adj = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        checkVertex(u); 
        checkVertex(v);
        adj.get(u).add(v);
        if (!isDirected) {
            adj.get(v).add(u);
        }
    }

    public List<Integer> neighbors(int u) {
        checkVertex(u);
        return Collections.unmodifiableList(adj.get(u));
    }

    public void printFrom(int start) {
        IntStream.range(start, adj.size())
                 .forEach(u -> {
                     String joined = adj.get(u).stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(", "));
                     System.out.printf("%d -> %s%n", u, joined);
                 });
    }

    private void checkVertex(int u) {
        if (u < 0 || u >= adj.size()) {
            throw new IndexOutOfBoundsException("Vertex " + u + " is out of range");
        }
    }
}

