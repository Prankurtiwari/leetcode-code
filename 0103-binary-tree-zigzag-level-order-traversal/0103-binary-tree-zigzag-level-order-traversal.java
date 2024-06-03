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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        if (root == null) {
            return res;
        }
        qu.add(root);
        while(!qu.isEmpty()) {
            List<Integer> sub_res = new ArrayList<>();
            int size = qu.size();
            
            for (int i=0;i<size;i++) {
                TreeNode node = qu.peek();
                
                if(node.left!= null) {
                    qu.add(node.left);
                }
                if(node.right!= null) {
                    qu.add(node.right);
                }
                sub_res.add(qu.remove().val);
            }
            res.add(sub_res);
        }
        int count =0;
        for(List<Integer> ls : res) {
            if (count %2 != 0) {
               Collections.reverse(ls);
            }
            count++;
        }
        
        return res;
    
    }
}