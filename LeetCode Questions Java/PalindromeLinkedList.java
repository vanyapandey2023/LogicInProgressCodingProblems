 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode x = head;
        ListNode y = head;
        while(x != null && x.next != null){
            x = x.next.next;
            y = y.next;
        }
        if (x != null) {  
            y = y.next;
        }
        ListNode s = reverse(y);
        ListNode f = head;
        boolean ans = true;
        while(s != null){
            if(s.val != f.val){
                ans = false;
                break;
            }
            s = s.next;
            f = f.next;
        }
        return ans;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    return prev; 
    }
}