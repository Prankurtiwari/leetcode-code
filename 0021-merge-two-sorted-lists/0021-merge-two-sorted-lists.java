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
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         ListNode temp_node = new ListNode(0);
        ListNode cur_node = temp_node;
        
        while( list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                cur_node.next = list1;
                list1= list1.next;
            }
             else {
                cur_node.next = list2;
                list2= list2.next;
            }
            cur_node = cur_node.next;
        }
        if (list1 != null) {
            cur_node.next = list1;
            list1 = list1.next;
        }
        if (list2 != null) {
            cur_node.next = list2;
            list2 = list2.next;
        }
        return temp_node.next;
    }
}