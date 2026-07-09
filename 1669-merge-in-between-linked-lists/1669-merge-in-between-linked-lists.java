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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode x = list1;
        ListNode y = list1;
        ListNode z = list2;
        while(z.next != null){
            z = z.next;
        }
        for(int i = 1; i < a; i++){
            x = x.next;
        }
        y = x;
        for(int i = 0; i < b - a + 1; i++){
            y = y.next;
        }
        y = y.next;
        x.next = list2;
        z.next = y;
        return list1;
    }
}