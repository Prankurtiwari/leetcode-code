/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public int lengthList(ListNode node) {
        int len = 0;
        ListNode cur = node;
        while(cur != null) {
            cur = cur.next;
            len++;
        }
        return len;
    }
    
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = lengthList(headA);
        int len2 = lengthList(headB);
        
        ListNode curA = headA;
        ListNode curB = headB;
        
        if (len1 > len2) {
            curA = giveEdge(headA, len1-len2);
        } else {
            curB = giveEdge(headB, len2-len1);
        }
        
        while(curA != curB) {
            curA = curA.next;
            curB = curB.next;
        }
        
        return curA;
    }
    
    public ListNode giveEdge(ListNode head, int len) {
        while(len-- > 0){
            head = head.next;
        }
        return head;
    }
}