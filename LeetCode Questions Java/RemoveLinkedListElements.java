
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode d = new ListNode(0);
        d.next = head;
        ListNode x = d;
        while(x.next != null){
            if(x.next.val == val){
                x.next = x.next.next;
            } else{
                x = x.next;
            }
            
        }
        return d.next;
    }
}