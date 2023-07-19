# Graph Representation 

Graph is a complex data structure and Hence we need to look into how we can store this complex Data Structure.

### Input for a Graph

- N = No of Nodes
- M = No of Edges
- List of M Edges

Eg - of a Undirected Graph Input

3 4

1 2

2 3

1 2

1 3

## Two ways to represent Graph

1. Matrix
2. Adjacency List

## Matrix 

An adjacency matrix of a graph is a two-dimensional array of size n x n.

![img.png](../assets/img_4.png)

**Space Complexity** - O(N^2)

It is a costly method as n² locations are consumed.

## Adjacency List

We store the grpah as a List< List<Adjacent Node> >.

**Space complexity** = O(2xE) for Undirected Graph and O(E) for directed Graph.

This representation is much better than the adjacency matrix, as matrix representation consumes n² locations, 
and most of them are unused.

![img_1.png](img_1.png)

## Weighted Graph

- For Matrix We can put weights for each edge.
- For Adjacency List , we can store **List<List<Pair(dest, weight)>>**

## Points to consider while representing a Graph -

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


