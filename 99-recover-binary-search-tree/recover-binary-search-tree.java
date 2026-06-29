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
    TreeNode prev;
    TreeNode wrong1first;
    TreeNode wrong1second;
    TreeNode wrong2first;
    TreeNode wrong2second;
    int wrong;


    public void recoverTree(TreeNode root) {

        prev= null;
        wrong1first= null;
        wrong1second= null;
        wrong2first= null;
        wrong2second= null;
        wrong=0;
        fun(root);

        if(wrong==1)
        {
            int temp = wrong1first.val;
            wrong1first.val = wrong1second.val;
            wrong1second.val = temp;
        }
        else
        {
            if (wrong1first != null && wrong1second != null){
            int temp = wrong1first.val;
            wrong1first.val = wrong2second.val;
            wrong2second.val = temp;
            }
        }
    }

    void fun(TreeNode root)
    {
        if(root==null) return;

        fun(root.left);

        if(prev==null){
            prev=root;
        }
        else
        {
            if(root.val<prev.val)      // found wrong
            {
                if(wrong==0)
                {
                    wrong1first=prev;
                    wrong1second= root;
                    wrong++;
                }
                else
                {
                    wrong2first=prev;
                    wrong2second=root;
                    wrong++;
                }
            
            }
            prev=root;
        }

        fun(root.right);
    }

}