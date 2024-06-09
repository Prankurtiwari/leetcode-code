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
    
    public void rightView(TreeNode root, ArrayList<Integer>res, int level) {
        if (root == null) 
            return;
        
        if (res.size() == level) 
            res.add(root.val);
        if (root.right != null) 
            rightView(root.right, res, level+1);   
        if (root.left != null) 
            rightView(root.left, res, level+1);   
        
    }
    
    
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        rightView(root, res, 0);
        return res;
    }
}