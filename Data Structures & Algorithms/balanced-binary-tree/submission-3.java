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
        if(root == null)return true;
        int left = checkHeight(root.left);
        int right = checkHeight(root.right);
        if(Math.abs(left - right) > 1)return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    private int checkHeight(TreeNode node){
        if(node == null)return 0;
        return 1 + Math.max(checkHeight(node.left), checkHeight(node.right));
    }
}
