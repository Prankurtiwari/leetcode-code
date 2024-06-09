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
class Tuple {
    TreeNode node;
    int vertical;
    int level;

    public Tuple(TreeNode node, int vertical, int level) {
        this.node = node;
        this.vertical = vertical;
        this.level = level;
    }
}


class Solution {
    
    public List<List<Integer>> verticalTraversal(TreeNode node) {
        List<List<Integer>> res = new ArrayList<>();
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> queue = new LinkedList<>();
        queue.add(new Tuple(node, 0,0));
        while(!queue.isEmpty()) {
            Tuple tuple = queue.poll();
            TreeNode curNode = tuple.node;
            int vertical = tuple.vertical;
            int level = tuple.level;

            if (!map.containsKey(vertical)) {
                map.put(vertical, new TreeMap<>());
            }
            if (!map.get(vertical).containsKey(level)) {
                map.get(vertical).put(level, new PriorityQueue<>());
            }

            map.get(vertical).get(level).offer(curNode.val);

            if (curNode.left != null) {
                queue.add(new Tuple(curNode.left, vertical-1, level+1));
            }
            if (curNode.right != null) {
                queue.add(new Tuple(curNode.right, vertical+1, level+1));
            }
        }
        for (TreeMap<Integer, PriorityQueue<Integer>> treeMap : map.values()) {
            res.add(new ArrayList<>());
            for (PriorityQueue<Integer> priorityQueue :treeMap.values()) {
                while (!priorityQueue.isEmpty()) {
                    res.get(res.size()-1).add(priorityQueue.poll());
                }
            }
        }
        return res;
    }
}