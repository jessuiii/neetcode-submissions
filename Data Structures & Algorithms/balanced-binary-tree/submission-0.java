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
        int diff = Math.abs(left - right);
        if(diff <= 1) 
            return true;
        return false;
    }
    private int checkHeight(TreeNode node){
        if(node == null)return 0;
        int left = checkHeight(node.left);
        int right = checkHeight(node.right);
        return 1 + Math.max(left, right);
    }
}
