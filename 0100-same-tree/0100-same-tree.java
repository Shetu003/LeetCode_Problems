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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){  //if both null i.e, identical
            return true;
        }

        if(p==null || q==null || p.val != q.val){  //if null but values are diffrent
            return false;
        }

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right); //recursively check left and right subtrees are same 
    }
}