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
    public TreeNode invertTree(TreeNode root) {
        if(root == null)  return null;

        TreeNode temp = root.left;  //first swap the left and right child of the root node 
        root.left = root.right;
        root.right = temp;

        invertTree(root.left); //traverse through the left tree
        invertTree(root.right); //traverse through the right tree
        return root;
    }
}