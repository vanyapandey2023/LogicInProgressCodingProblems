class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next == null || left == right){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for(int i = 0; i < left - 1; i++){
            prev = prev.next;
        }
        ListNode start = prev.next;
        ListNode end = start;
        for(int i = 0; i < right - left; i++){
            end = end.next;
        }
        ListNode group_next = end.next;
        ListNode p = null;
        ListNode c = start;
        while(c != group_next){
            ListNode n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        prev.next = p;
        start.next = group_next;
        return dummy.next;
    }
}