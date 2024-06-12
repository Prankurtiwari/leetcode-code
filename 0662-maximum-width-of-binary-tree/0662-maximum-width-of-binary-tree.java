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

class Pair {
    int num;
    TreeNode root;
    Pair(int num, TreeNode root) {
        this.num = num;
        this.root = root;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int ans = 0;
        if (root == null) {
            return ans;
        }
        Queue<Pair> qu = new LinkedList<>();
        qu.offer(new Pair(0,root));
        while(!qu.isEmpty()) {
            int size = qu.size();
            int min = qu.peek().num;
            int last = 0;
            int first = 0;
            for(int i=0;i<size;i++) {
                int curr_i = qu.peek().num-min;
                TreeNode node =  qu.peek().root;
                qu.poll();
                if (i==0) {
                    first = curr_i;
                }
                if (i==size-1) {
                    last = curr_i;
                }
                if (node.left != null) {
                    qu.offer(new Pair((2*curr_i) +1, node.left));
                }
                if (node.right != null) {
                    qu.offer(new Pair((2*curr_i) +2, node.right));
                }
            }
            ans = Math.max(ans, (last-first +1));
        }
        return ans;
    }
}