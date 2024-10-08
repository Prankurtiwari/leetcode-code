/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    
    public void markParent(TreeNode root,  Map<TreeNode, TreeNode> par, Queue<TreeNode> qu) {
        if (root ==null) {
            return;
        }
        qu.offer(root);
        while(!qu.isEmpty()) {
            TreeNode cur = qu.peek();
            if (cur.left != null) {
                par.put(cur.left,cur);
                qu.offer(cur.left);
            }
            if (cur.right != null) {
                par.put(cur.right,cur);
                qu.offer(cur.right);
            }
            qu.poll();
        }
    }
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Queue<TreeNode> qu = new LinkedList<>();
        Map<TreeNode, TreeNode> par = new HashMap<>();
        markParent(root, par, qu);
            
        Map<TreeNode, Boolean> vis = new HashMap<>();
        int cur_lvl = 0;
        
        qu.offer(target);
        vis.put(target, true);
        while(!qu.isEmpty()) {
            int size = qu.size();
            if (cur_lvl == k) {
                break;
            }
            cur_lvl++;
            for(int i=0;i<size;i++) {
                TreeNode cur = qu.peek();
                if (cur.left != null && vis.get(cur.left) == null) {
                    vis.put(cur.left, true);
                    qu.offer(cur.left);
                }
                if (cur.right != null && vis.get(cur.right) == null) {
                    vis.put(cur.right, true);
                    qu.offer(cur.right);
                }
                if (par.get(cur) != null && vis.get(par.get(cur)) == null) {
                    vis.put(par.get(cur), true);
                    qu.offer(par.get(cur));
                }
                qu.poll();            
            }
        }
        
        List<Integer> res = new ArrayList<>();
        while(!qu.isEmpty())  {
            res.add(qu.poll().val);
        }                  
        
        return res;
        
    }
}