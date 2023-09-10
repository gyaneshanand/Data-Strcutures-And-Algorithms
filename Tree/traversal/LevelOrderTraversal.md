# Level Order Tree Traversal

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->

# Approach
<!-- Describe your approach to solving the problem. -->

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> levelOrder = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        if(root!=null)
            q.add(root);

        while(!q.isEmpty())
        {

            List<TreeNode> curLevelNodes = new ArrayList<>();
            while(!q.isEmpty())
            {
                curLevelNodes.add(q.poll());
            }

            List<Integer> curLevel = new ArrayList<>();

            for(TreeNode node : curLevelNodes)
            {
                curLevel.add(node.val);
                addChildren(node, q);
            }

            levelOrder.add(curLevel);
        }
        return levelOrder;      
    }

    private void addChildren(TreeNode node, Queue<TreeNode> q)
    {
        if(node.left != null)
            q.add(node.left);
        if(node.right != null)
            q.add(node.right);
    }
}
```