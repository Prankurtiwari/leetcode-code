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
    
    //DSA course L38 : Linked List: Classical Problems 2 13-March-2024
    public Node copyRandomList(Node head) {
       // O(n) -- space O(n) -- time
        
//         if (head == null) {
//             return null;
//         }
//         Node curr = head;
//         Map<Node,Node> oldToNew = new HashMap<>();
        
//         while(curr != null) {
//             oldToNew.put(curr, new Node(curr.val));
//             curr = curr.next;
//         }
//         curr = head;
        
//         while(curr != null) {
//             oldToNew.get(curr).next = oldToNew.get(curr.next);
//             oldToNew.get(curr).random = oldToNew.get(curr.random);
//             curr = curr.next;
//         }
        
//         return oldToNew.get(head);
        
        
// O(1) space        
        
        if (head == null) {
            return null;
        }
        
        //Join linked list
        Node cur = head;
        while(cur != null) {
            Node newNode = new Node(cur.val);
            newNode.next = cur.next;
            cur.next = newNode;
            cur = cur.next.next;
        }
        
        cur = head;
        
        //attaching random pointer
        while(cur != null) {
            cur.next.random = cur.random != null ? cur.random.next : null;
            cur = cur.next.next;
        }
        
        // UnJoin the linkedList
        Node oldNode = head;
        Node newNode = head.next;
        Node res = head.next;
        while(oldNode != null) {
            oldNode.next  = oldNode.next != null ? oldNode.next.next : null;
            newNode.next =  newNode.next != null ? newNode.next.next : null;
            oldNode = oldNode.next;
            newNode = newNode.next;
        }
        return res;
    }
}