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
    
    int maxSum = Integer.MIN_VALUE;
    
    public int maxPath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sumL = Math.max(0, maxPath(root.left)); // if value is negative then it's useless
        int sumR = Math.max(0, maxPath(root.right)); // if value is negative then it's useless
        maxSum = Math.max(maxSum, (sumL+sumR+root.val));
        return root.val+Math.max(sumL,sumR);
    }

    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return maxSum;
    }
}