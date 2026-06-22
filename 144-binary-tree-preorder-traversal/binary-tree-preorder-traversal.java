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
    List<Integer> list= new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        return fun(root);
    }

    public List<Integer> fun(TreeNode root)
    {
        if(root==null) return list;

        list.add(root.val);
        fun(root.left);
        fun(root.right);

        return list;
    }


}