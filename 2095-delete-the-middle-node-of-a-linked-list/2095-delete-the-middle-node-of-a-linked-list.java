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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        ListNode x = head.next.next;
        ListNode y = head;
        while(x != null && x.next != null){
            x = x.next.next;
            y = y.next;
        }
        y.next = y.next.next;
        return head;
    }
}