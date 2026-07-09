class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode x = list1;
        ListNode y = list2;
        
        while (x != null || y != null) {
            if (x != null && y != null) {
                if (x.val <= y.val) {
                    tail.next = new ListNode(x.val);
                    x = x.next;                   
                } else {
                    tail.next = new ListNode(y.val); 
                    y = y.next;                     
                }
            } else if (x == null) {
                tail.next = new ListNode(y.val);
                y = y.next; 
            } else {
                tail.next = new ListNode(x.val);
                x = x.next; 
            }
            tail = tail.next; 
        }
        
        return dummy.next; 
    }
}