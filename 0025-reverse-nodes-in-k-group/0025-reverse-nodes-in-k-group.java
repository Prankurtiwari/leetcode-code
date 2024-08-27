/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// DSA course L38: 11th Mar 2024 last problem
class Solution {
    
    public void reverse(ListNode start,  ListNode end) {
        ListNode pre = null;
        ListNode cur = start;
        /*
            why not while cur != end because one iteration is pending. Watch recording of lecture              at 01:30:00 
        */
        while(pre != end) { 
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
    }
    
    
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1 || head == null || head.next == null) {
            return head;
        }
        
        ListNode start =head;
        ListNode end =head;
        
        int jumps = k-1;
        while(jumps-- >0) {
            end = end.next;
            if (end == null) {
                return head;
            }
        }
        
        ListNode head_rem = reverseKGroup(end.next, k);
        reverse(start, end);
        start.next = head_rem;
        return end;
    }
}