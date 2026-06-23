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

    int num=0;
    int res=0;
    public int sumNumbers(TreeNode root) {
        fun(root,num);
        return res;
        
    }

    public int fun(TreeNode root, int num)
    {
        if(root==null) return num;

        num=(num*10) + root.val;

        if(root.left==null && root.right==null)
        {
            res+=num;
            return res;
        }

        fun(root.left,num);
        fun(root.right,num);
        return num;

    }
}