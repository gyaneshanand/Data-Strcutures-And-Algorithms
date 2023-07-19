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
