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
    
    // using recurssion
    // public void inorder(TreeNode root, List<Integer> res) {
    //     if (root != null) {
    //         inorder(root.left, res);
    //         res.add(root.val);
    //         inorder(root.right, res);
    //     }
    // }
    
    

     // using stack
    public void inorder(TreeNode root, List<Integer> res) {
        Stack<TreeNode> st = new Stack<>();
        if (root == null) {
            return ;
        }
        TreeNode node =root;
        while(true) {
            if (node != null) {
                st.push(node);
                node = node.left;
            } else {
                if (st.isEmpty()) {
                    break;
                }
                node = st.pop();
                res.add(node.val);
                node = node.right;
            }
        }
    }
    
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;    
    }
}