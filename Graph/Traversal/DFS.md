# DFS

DFS is a traversal technique which involves the idea of recursion and backtracking. DFS goes in-depth, 
i.e., traverses all nodes by going ahead, 
and when there are no further nodes to traverse in the current path, 
then it backtracks on the same path and traverses other unvisited nodes.



```java
public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
    boolean visited[] = new boolean[V];
    ArrayList<Integer> dfsPath = new ArrayList<Integer>();
    dfsPath.add(0);
    visited[0] = true;
    dfs(0, visited, adj, dfsPath);
    return dfsPath;
}

private static void dfs(int node, boolean visited[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> dfsPath){
        for(int v: adj.get(node)){
            if(!visited[v]){
                visited[v] = true;
                dfsPath.add(v);
                dfs(v, visited, adj, dfsPath);
            }
        }
    }
```

### Space Complexity

### Time Complexity 
O(N) + O(2E), Where N = Nodes,
2E is for total degrees as we traverse all adjacent nodes.