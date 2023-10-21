# Kahn's Algorithm : Topological Sort Using BFS

## Code 

```java
private static List<Integer> doTopoSort(List<List<Integer>> graph, int numVertex){

        Queue<Integer> q = new LinkedList<>();
        List<Integer> topologicalOrder = new ArrayList<>();
        int[] inDegrees = new int[numVertex];

        for(int ind=0; ind<numVertex; ind++){
            for(int n : graph.get(ind)){
                inDegrees[n] = inDegrees[n]+1; 
            }
        }

        for(int ind=0; ind<numVertex; ind++){
            if(inDegrees[ind]==0)
                q.add(ind);
        }

        while(!q.isEmpty()){
            int node = q.remove();
            topologicalOrder.add(node);
            for(int n : graph.get(node)){
                inDegrees[n] = inDegrees[n] - 1;
                if(inDegrees[n]==0)
                    q.add(n);
            }
        }
        return topologicalOrder;
    }
```