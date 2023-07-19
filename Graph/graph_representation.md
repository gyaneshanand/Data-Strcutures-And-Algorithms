# Graph Representation 

Graph is a complex data structure and Hence we need to look into how we can store this complex Data Structure.

### Points to consider while representing a Graph - 

1. **Is Graph 0 OR 1 based indexed.**
   1. If its 0 then we need to create Matrix/Adj List till ( 0 -> N-1)
      1. mat graph[][] = new int[N][N] 
   2. If its 1 based indexing then we need to create Matrix/Adj List till ( 1 -> N)
      1. mat graph[][] = new int[N+1][N+1]
2. **Is Graph Directed or Undirected**
   1. For Undirected Graph , if there is a an (u->v) then we need to add an edge (v->u) also in matrix/Adj List.
   2. For Directed , we do not need to do anything such.
3. **Is Graph Weighted or Unweighted**
   1. For Weighted Graph
      1. In Matrix -> We can put weights at the intersection.
      2. In List we can create a **Pair**. **( src -> (dest, weight))**
   2. For Unweighted Graph , we can assume weight=1 and skip adding weights.

### Input for a Graph

N = No of Nodes
M = No of Edges
List of M Edges

Eg of a Undirected Graph Input

3 4
1 2
2 3
1 2
1 3

