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
    public ListNode middleNode(ListNode head) {
      if(head.next == null){
        return head;
      }  
      ListNode x = head.next.next;
      ListNode y = head;
     while(x != null && x.next != null){
            x = x.next.next;
            y = y.next;
    }
    return y.next;
    }
}