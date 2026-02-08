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
        List<List<Integer>> result= new ArrayList<>();

        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);

        if (root==null) return result;

        while(!q.isEmpty())
        {
            int levelSize=q.size();
            ArrayList<Integer> currentList= new ArrayList<>();
            for(int i= 0; i<levelSize; i++)
            {
                TreeNode currentNode= q.poll();
                currentList.add(currentNode.val);
                if(currentNode.left!=null)
                {
                    q.offer(currentNode.left);
                }
                if(currentNode.right!=null)
                {
                    q.offer(currentNode.right);
                }
            }
            result.add(currentList);

        }
        return result;
        
    }
}