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
    public boolean isBalanced(TreeNode root) {
        return check(root) != -1;
    }

    private int check(TreeNode root) {
        if (root == null)
            return 0; //balanced with height 0

        int left = check(root.left);
        int right = check(root.right);

        if (left == -1 || right == -1) { // If either subtree is unbalanced, return -1
            return -1;
        }

        if (Math.abs(left - right) > 1) { // If height difference is more than 1, current node is unbalanced
            return -1;
        }

        return 1 + Math.max(left, right); // Return height of current subtree if balanced
    }
}
