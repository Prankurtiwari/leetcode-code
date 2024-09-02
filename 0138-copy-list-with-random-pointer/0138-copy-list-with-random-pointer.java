/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // O(n) -- space O(n) -- time
        
        if (head == null) {
            return null;
        }
        Node curr = head;
        Map<Node,Node> oldToNew = new HashMap<>();
        
        while(curr != null) {
            oldToNew.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        curr = head;
        
        while(curr != null) {
            oldToNew.get(curr).next = oldToNew.get(curr.next);
            oldToNew.get(curr).random = oldToNew.get(curr.random);
            curr = curr.next;
        }
        
        return oldToNew.get(head);
        
        
        
        
//         if (head == null) {
//             return null;
//         }
//         Node cur = head;
//         Node copy_head = new Node(-1);
//         Node cur_copy_head= copy_head;
//         while(cur != null) {
//             Node temp = new Node(cur.val);
//             cur_copy_head.next = temp;
//             cur = cur.next;
//             cur_copy_head = cur_copy_head.next;
//         }
        
//         copy_head = copy_head.next;
    }
}