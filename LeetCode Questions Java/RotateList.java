class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
       ListNode x = head;
       int length = 1;
       while(x.next != null){
        length++;
        x = x.next;
       } 
       int times = k % length;
       if(times == 0){
        return head;
       }
       x.next = head;
       ListNode y = head;
       for(int i = 0; i < length - times - 1; i++){
        y = y.next;
       }
       ListNode z = y.next;
       y.next = null;
       return z;
    }
}