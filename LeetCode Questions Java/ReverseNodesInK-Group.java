class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
    // Edge case
      if(head.next == null || k == 1){
        return head;
      }

    // Make dummy node and group_prev so that you can build on top of it
      ListNode dummy = new ListNode(0);
      dummy.next = head;
      ListNode group_prev = dummy;

      while(true){
        // Make variables based on group_prev and check if k nodes exist 
        ListNode end = group_prev;
        for(int i = 0; i < k; i++){
            end = end.next;
            if(end == null){
                return dummy.next;
            }
        }
        ListNode start = group_prev.next;
        ListNode group_next = end.next;

        // Reversal begins
        ListNode prev = null;
        ListNode curr = start;

        while(curr != group_next){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        start.next = group_next; // We're assigning start to the first node after the chunk
        group_prev.next = prev;  // Since prev is now the head of the chunk, we point group_prev at it
        group_prev = start; // We reassign the variables and start all over again
      }
    }
}