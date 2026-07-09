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
    public ListNode mergeNodes(ListNode head) {
     if(head == null || head.next == null){
        return head;
     }
     ListNode x = head;
     ListNode y = head.next;
     int sum = 0;
     while(y != null){
        if(y.val == 0){
            x.val = sum;     
                sum = 0;       
                
               
                if (y.next != null) {
                    x = x.next; 
                } else {
                    x.next = null;
                }
        } else{
            sum += y.val;
        }
        y = y.next;
     }
     return head;
    }
}