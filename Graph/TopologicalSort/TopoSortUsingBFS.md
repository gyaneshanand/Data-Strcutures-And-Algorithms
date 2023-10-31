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
## Intution
Topological sorting is a kind of dependencies problem so, we can start with the tasks which do not have any dependencies and can be done straight away or simply if we talk about in the term of node,

- We will always try to execute those nodes that have outdegree 0.
- Then after execution of all those 0 outdegrees, we will execute which are directly dependent on currently resolved tasks (currently resolved tasks’ outdegrees will become 0 now) and so on will execute all other tasks. 

## Algorithm

