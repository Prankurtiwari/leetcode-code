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

    int steps = 0;
    public int distributeCoins(TreeNode root) {
        
        dfs(root);
        return steps;
    }

    public int dfs(TreeNode root) {
        if(root == null ) return 0;

        int leftRequired = dfs(root.left);
        int rightRequired = dfs(root.right);

        steps += (Math.abs(leftRequired) + Math.abs(rightRequired));

        return (root.val -1) + leftRequired + rightRequired;
    }
}