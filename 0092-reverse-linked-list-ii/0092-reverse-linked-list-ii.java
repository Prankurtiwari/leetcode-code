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
// https://www.youtube.com/watch?v=RF_M9tX4Eag
class Solution {
    

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0,head);
        
        ListNode cur = head;
        ListNode leftPrev = dummy;
        
        
        // part 1
        for(int i=0;i<left-1;i++) {
            leftPrev = cur;
            cur= cur.next;  
        }
        
        
        // part 2
        ListNode prev = null;
        for(int i =0;i<right-left+1; i++) {
            ListNode tempNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tempNext;
        }
        
        // part 3
        leftPrev.next.next = cur;
        leftPrev.next = prev;
        
        
        
        return dummy.next;
        
    }
}