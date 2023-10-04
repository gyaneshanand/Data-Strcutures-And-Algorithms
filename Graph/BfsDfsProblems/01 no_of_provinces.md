# No of Provinces 

https://leetcode.com/problems/number-of-provinces/description/?source=submission-ac

## Intuition
Its just a problem to find number of connected components in the graph.

## Approach
<!-- Describe your approach to solving the problem. -->

## Complexity

### Time complexity:
O(N^2)
- First we need to visit each node
- For each Node we need to visit all the neighbour nodes which can be (n-1) in worst case.

### Space complexity:
O(N)
- We need to store the visited array of size N.
- We also need to store N nodes in queue in worst case or N nodes in dfs stack.

# Code
```java
class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int n = isConnected.length;
        int res = 0;

        boolean visited[] = new boolean[n];

        Queue<Integer> q = new LinkedList<>();
        

        for(int x = 0; x<n; x++)
        {
            if(visited[x])
                continue;
                
            q.add(x);
            visited[x] = true;
            while(!q.isEmpty()){
                int v = q.poll();
                for(int i = 0 ; i<n; i++)
                {
                    if(isConnected[v][i]==1 && !visited[i])
                    {
                        q.add(i);
                        visited[i] = true;
                    }
                }
            }
            res++;
        }
        return res;
    }
}
```
