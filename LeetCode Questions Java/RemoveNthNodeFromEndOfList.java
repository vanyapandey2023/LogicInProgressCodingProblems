class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode d = new ListNode(0);
        d.next = head;
        ListNode x = d;
        ListNode y = d;
        while(n >= 0){
            y = y.next;
            n--;
        }
        while(y != null){
            y = y.next;
            x = x.next;
        }
        x.next = x.next.next;
        return d.next;
    }
}
