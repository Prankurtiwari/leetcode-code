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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if (root == null) {
            return res;
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
        return res;
    }
}