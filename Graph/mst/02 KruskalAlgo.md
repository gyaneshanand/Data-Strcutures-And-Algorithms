```java
class Solution{
	static int spanningTree(int V, int E, int edges[][]){
	    
        // Create Edges which can sorted
	    List<Edge> graphEdges = new ArrayList<>();
	    for(int e=0; e<E; e++){
	        graphEdges.add(new Edge(edges[e][0], edges[e][1], edges[e][2]));
	    }
	    
        // Sort the edges
	    Collections.sort(graphEdges, (x, y) -> x.weight - y.weight);
	    
        // Create a Disjoint Set
	    DisjointSet ds = new DisjointSet(V);
	    
	    int minMstWeight = 0;
        
	    for(Edge edge : graphEdges){
	        // If two nodes in the graph do not belong to same component , add that to mst
            // This works because edges are already sorted according to their weight
	        if(ds.findParent(edge.src) != ds.findParent(edge.dest)){
	            ds.unionBySize(edge.src, edge.dest);
	            minMstWeight+=edge.weight;
	        }
	    }
	    
	    return minMstWeight;
	}

}

class Edge{
    int src;
    int dest;
    int weight;
    public Edge(int _src, int _dest, int _weight){
        this.src = _src;
        this.dest = _dest;
        this.weight = _weight;
    }
}

class DisjointSet{
    
    public List<Integer> size;
    public List<Integer> parent;
    
    public DisjointSet(int N){
        size = new ArrayList<>();
        parent = new ArrayList<>();
        
        for(int i=0; i<=N; i++){
            size.add(1);
            parent.add(i);
        }
    }
    
    public int findParent(int node){
        if(node == parent.get(node)){
            return node;
        }
        int ulp = findParent(parent.get(node));
        parent.set(node, ulp);
        return ulp;
    }
    
    public void unionBySize(int u, int v){
        int ulp_u = parent.get(u);
        int ulp_v = parent.get(v);
        
        if(ulp_u == ulp_v){
            return;
        }
        
        int size_ulp_u = size.get(ulp_u);
        int size_ulp_v = size.get(ulp_v);
        
        if(size_ulp_u < size_ulp_v){
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size_ulp_u + size_ulp_v);
        }
        else{
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size_ulp_u + size_ulp_v);
        }
    }
}
```