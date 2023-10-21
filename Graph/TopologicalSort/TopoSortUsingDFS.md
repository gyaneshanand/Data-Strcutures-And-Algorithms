# Topological Sort Using DFS

## Intution
- We can think of this as when we complete DFS of a node then we can put that into stack.
![img.png](../assets/topo2.png)

## Additional Data Structure - Stack

## Algorithm

1. We must traverse all components of the graph.
2. Make sure to carry a visited array(all elements are initialized to 0) and a stack data structure, where we are going to store the nodes after completing the DFS call.
3. In the DFS call, first, the current node is marked as visited. Then DFS call is made for all its adjacent nodes.
4. **After visiting all its adjacent nodes, DFS will backtrack to the previous node and meanwhile, the current node is pushed into the stack.**
5. Finally, we will get the stack containing one of the topological sortings of the graph.