package Graph.Basics;

public class matrix_representation {

    private static int[][] undirectedGraphMatrix(){

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

        int graph[][] = new int[N+1][N+1];

        graph[1][2] = 1;
        graph[2][1] = 1;

        graph[1][4] = 1;
        graph[4][1] = 1;

        graph[2][3] = 1;
        graph[3][2] = 1;

        graph[2][4] = 1;
        graph[4][2] = 1;

        graph[3][4] = 1;
        graph[4][3] = 1;

        return graph;
    }

    private static int[][] directedGraphMatrix(){

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

        int graph[][] = new int[N+1][N+1];

        graph[1][2] = 1;
        graph[1][4] = 1;
        graph[2][3] = 1;
        graph[2][4] = 1;
        graph[3][4] = 1;

        return graph;
    }

    private static int[][] weightedDirectedGraphMatrix(){

        /**
         * Nodes -> ( 1 , 2 , 3 , 4 )
         * N = 4 , M = 5
         * 1 2 3
         * 1 4 2
         * 2 3 5
         * 2 4 7
         * 3 4 3
         */

        int N = 4;
        int M = 5;

        int graph[][] = new int[N+1][N+1];

        graph[1][2] = 3;
        graph[1][4] = 2;
        graph[2][3] = 5;
        graph[2][4] = 7;
        graph[3][4] = 3;

        return graph;
    }


    public static void main(String[] args) {

        int graph[][] = directedGraphMatrix();
        int N = graph.length;
        int X = graph[0].length;

        System.out.println(N);
        System.out.println(X);

        for (int i = 1; i < N; i++) {
            System.out.print("Nodes originating from "+ i +" are : ");
            for (int j = 1; j < N; j++) {
                if(graph[i][j]!=0)
                    System.out.print(j + " , ");
            }
            System.out.println();
        }
     }
}

// Better and Modular Code 

class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(6, false);
        
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 5);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        
        graph.displayGraph(1);
    }
}

class Graph{
    private int[][] graph;
    private boolean isDirected;
    
    public Graph(int numVertices, boolean isDirected){
        graph = new int[numVertices][numVertices];
        this.isDirected = isDirected;
    }
    
    public boolean addEdge(int src, int dest){
        if(!validateVertex(src) || !validateVertex(dest)){
            return false;
        }
        graph[src][dest] = 1;
        if(!isDirected){
            graph[dest][src] = 1;
        }
        return true;
    }
    
    public void displayGraph(int indexStart){
        for(int i=0; i<graph.length; i++){
            if(i<indexStart){
                continue;
            }
            System.out.print(i + " -> ");
            boolean isFirstNeigbour = true;
            for(int j=0; j<graph.length; j++){
                if(graph[i][j]==1){
                    if(isFirstNeigbour){
                        isFirstNeigbour = false;
                        System.out.print(j);
                    }
                    else{
                        System.out.print( ", "+j);
                    }
                }
            }
            System.out.println();
        }
    }
    
    private boolean validateVertex(int v){
        if(v<0 || v>=graph.length){
            return false;
        }
        return true;
    }
}
