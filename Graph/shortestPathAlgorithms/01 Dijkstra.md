
## Code 

```java
import java.util.*;
public class Solution {
    public static List<Integer> dijkstra(int[][] edge,int vertices, int edges,int source){

        List<List<Pair>> graph = new ArrayList<>();

        // Create the Graph
        for(int it=0; it<vertices; it++){
            graph.add(new ArrayList<Pair>());
        }
        for(int it=0; it<edges; it++){
            graph.get(edge[it][0]).add(new Pair(edge[it][2], edge[it][1]));
            graph.get(edge[it][1]).add(new Pair(edge[it][2], edge[it][0]));
        }

        // Create a min Heap to store the distance from source to a node <distance , node>
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.distance - y.distance);
        
        // Create a distance array to store the shortest distance from source to a node.
        List<Integer> distances = new ArrayList<Integer>();
        for(int it=0; it<vertices; it++){
            distances.add(Integer.MAX_VALUE);
        }

        // Add souce node and mark its distance as 0
        pq.add(new Pair(0, source));
        distances.set(source, 0);

        while(!pq.isEmpty()){

            Pair cur = pq.poll();

            int curDistance = cur.distance;
            int curNode = cur.node;

            for(Pair nbr : graph.get(curNode)){
                int newDistance = curDistance + nbr.distance;
                // If we find a shorter/better distance we will update the distance and add that to pq
                if(newDistance < distances.get(nbr.node)){
                    distances.set(nbr.node, newDistance);
                    pq.add(new Pair(newDistance, nbr.node));
                }
            }
        }

        return distances;
    }
}

class Pair{
    int distance;
    int node;

    public Pair(int distance, int node){
        this.distance = distance;
        this.node = node;
    }
}

```


## Youtube Videos

- Just gives an illustration :- https://www.youtube.com/watch?v=bZkzH5x0SKU Dont Get confused. Its code implementation will be using PQ. 

## Discussions 

- In some sense , Dijkstra Seems to be a greedy algorithm. At each point it choosed the vertes with shortest path and then computes the path from that node.
- 