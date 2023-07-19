# BFS Traversal : Breadth First Search

- Level Wise Traversal

### Algorithm to do BFS Traversal from a Node

1. Create a Queue
2. Push the starting node in Queue
3. Mark the Starting node as Vistited 
4. While Queue is not Empty 
   1. Pop a Node from Queue
   2. Add it to result
   3. Loop through all the neighbours of Node
      1. If the neighbour has not been visited yet. 
         1. Mark that as visited.
         2. Add that neighbour to Queue

    ```java
   public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean visited[] = new boolean[V];
        
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        visited[0] = true;
        
        while(!q.isEmpty()) {
            int x = q.poll();
            bfs.add(x);
            
            for(int n : adj.get(x))
            {
                if(!visited[n])
                {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
        
        return bfs;
        
    }
   ```