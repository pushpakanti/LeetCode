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

    HashMap<Integer, Integer> inorderMap = new HashMap<>();
    int preorderIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return construct(preorder, 0, inorder.length - 1);
    }

    private TreeNode construct(int[] preorder, int low, int high) {

        if (low > high) {   // Base Case
            return null;
        }

        // Pick current root from preorder
        int rootValue = preorder[preorderIndex];
        TreeNode root = new TreeNode(rootValue);
        preorderIndex++;

        // Find root position in inorder
        int inorderIndex = inorderMap.get(rootValue);

        // Build left subtree
        root.left = construct(preorder, low, inorderIndex - 1);

        // Build right subtree
        root.right = construct(preorder, inorderIndex + 1, high);

        return root;
    }
}