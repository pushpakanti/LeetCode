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
    public boolean isCompleteTree(TreeNode root) {
        if(root==null) return true;
        boolean nullFound= false;

        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty())
        {
            TreeNode current= q.peek();

            q.poll();

            if(current==null)
            {
                nullFound= true;
            }
            else
            {
                if(nullFound)
                {
                    return false;
                }
                q.offer(current.left);
                q.offer(current.right);  
            }       

        }

        return true;

    }
}