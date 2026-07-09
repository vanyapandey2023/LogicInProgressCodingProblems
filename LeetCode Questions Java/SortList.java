
  class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution {
    public ListNode sortList(ListNode head) {
        // Edge Cases
        if(head == null || head.next == null){
            return head;
        }
        // Creating dummy node and pointers for first and second half, then splitting.
        ListNode d = new ListNode(0);
        d.next = head;
        ListNode prev = d;
        ListNode x = head;
        ListNode y = head;
        while(y != null && y.next != null){
            prev = prev.next;
            x = x.next;
            y = y.next.next;
        }
        y = head;
        prev.next = null;

        // Call the same function again to sort each one by itself.
        ListNode y2 = sortList(y); 
        ListNode x2 = sortList(x); 
        ListNode dummy = new ListNode(0);
        ListNode z = dummy;
        while(x2 != null || y2 != null){
            if(x2 == null){
                z.next = y2;
                return dummy.next;
            }
            if(y2 == null){
                z.next = x2;
                return dummy.next;
            }
            if(x2 != null && y2 != null){
                if(x2.val < y2.val){
                    z.next = x2;
                    x2 = x2.next;
                } else{
                    z.next = y2;
                    y2 = y2.next;
                }
            }
            z = z.next;
        }
        return dummy.next;
    }
}