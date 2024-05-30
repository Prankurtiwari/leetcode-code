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
    
    // using recursion
    
    // public void postorder(TreeNode root, List<Integer> res) {
    //     if (root != null) {
    //         postorder(root.left, res);
    //         postorder(root.right, res);
    //          res.add(root.val);
    //     }
    // }
    
    
    // using 2- stack
//     public void postorder(TreeNode root, List<Integer> res) {
//         Stack<TreeNode> st1 = new Stack<TreeNode>();
//         Stack<TreeNode> st2 = new Stack<TreeNode>();
//         if (root == null ) {
//             return;
//         }
//         st1.push(root);
//         while(!st1.isEmpty()) {
//             TreeNode node= st1.pop();
//             if (node.left != null) {
//                 st1.push(node.left);
//             }
//             if (node.right != null) {
//                 st1.push(node.right);
//             }
//             st2.push(node);
//         }
        
//         while(!st2.isEmpty()) {
//             res.add(st2.pop().val);
//         }
//     }
    
    // using 1 stack (imp)
     public void postorder(TreeNode root, List<Integer> res) {
         Stack<TreeNode> st = new Stack<TreeNode>();
         if (root == null ) {
            return;
        }
        TreeNode cur =root;
        while(cur != null || !st.isEmpty()) {
             if (cur != null) {
                 st.push(cur);
                 cur = cur.left;
             } else {
                 TreeNode temp = st.peek().right;
                 if (temp == null) {
                     temp = st.pop();
                     res.add(temp.val);
                     while(!st.isEmpty() && temp == st.peek().right) {
                         temp = st.pop();
                         res.add(temp.val);
                     }
                 } else {
                     cur = temp;
                 }
             }
        }
         
     }
    
    
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res; 
    }
}