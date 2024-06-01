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
    
    // using level order traversal 
    public int maxDepthLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if (root == null) {
            return 0;
        }
        que.offer(root);
        while(!que.isEmpty()) {
            int size = que.size();
            List<Integer> sub_res = new ArrayList<>();
            for(int i=0; i<size; i++) {
                TreeNode peek = que.peek();
                if (peek.left != null) {
                    que.offer(peek.left);
                }
                if (peek.right != null) {
                    que.offer(peek.right);
                }
                sub_res.add(que.poll().val);
            }
            res.add(sub_res);
        }
        return res.size();
    }
    
    public int maxDepthRecursion(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = maxDepthRecursion(root.left);
        int rh = maxDepthRecursion(root.right);
        
        return 1 + Math.max(lh,rh);
    }
    
    
    
    public int maxDepth(TreeNode root) {
        // return maxDepthLevelOrder(root);
        return maxDepthRecursion(root);
    }
}