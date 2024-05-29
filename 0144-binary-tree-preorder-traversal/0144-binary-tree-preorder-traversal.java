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
    // public void preorder(TreeNode root, List<Integer> res) {
    //     if (root !=  null)
    //     {
    //         res.add(root.val);
    //         preorder(root.left, res);
    //         preorder(root.right, res);
    //     }
    // }
    
    // using stack
    public void preorder(TreeNode root, List<Integer> res) {
        Stack<TreeNode> st = new Stack<>();
        if (root == null) {
            return ;
        }
        st.push(root);
        while(!st.isEmpty()) {
            TreeNode node = st.pop();
                res.add(node.val);
                if (node.right != null ) {
                    st.push(node.right);
                }
                if (node.left != null ) {
                    st.push(node.left);
                }
        }
    }
    

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        preorder(root, res);
        return res;
    }
}