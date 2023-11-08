
```java
class Solution{
	static int spanningTree(int V, int E, int edges[][]){
	    
	    // Create the graph from the edges
	    List<List<Pair>> graph = new ArrayList<>();
	    for(int i=0; i<V; i++){
	        graph.add(new ArrayList());
	    }
	    for(int i=0; i<E; i++){
	        int u = edges[i][0];
	        int v = edges[i][1];
	        int wt = edges[i][2];
	        graph.get(u).add(new Pair(v, wt));
	        graph.get(v).add(new Pair(u, wt));
	    }
	   
	   // Create a Visited Array -> boolean and mark all of them as unvisited.
	   boolean visited[] = new boolean[V];
	   
	   // Create a Priority Queue
	   PriorityQueue<Pair> pq = new PriorityQueue<>((x,y) -> x.weight - y.weight);
	   pq.add(new Pair(0, 0));
	   
	   // Keep the minimumWeightSum
	   int minimumWeightSum = 0;
	   
	   // While PQ is not empty
	   // Take out the element which is on top in Min Heap
	   // If this node is already vosited do Nothing -> continue
	   // If Unvisited -> Mark it as visited and add it to MST and minimumWeightSum
	   // Visit all the nbrs of the node. 
	   // If any node is not already visted then visit that.
	   while(!pq.isEmpty()){
	       Pair cur = pq.poll();
	       int cur_node = cur.node;
	       
	       if(visited[cur_node])
	        continue;
	        
	       visited[cur_node] = true;
	       minimumWeightSum += cur.weight;
	       
	       for(Pair nbr : graph.get(cur_node)){
	           if(!visited[nbr.node]){
	               pq.add(new Pair(nbr.node, nbr.weight));
	           }
	       }
	   }
	   return minimumWeightSum;
	}
}

class Pair{
    int node;
    int weight;
    public Pair(int node, int weight){
        this.node = node;
        this.weight = weight;
    }
}
```