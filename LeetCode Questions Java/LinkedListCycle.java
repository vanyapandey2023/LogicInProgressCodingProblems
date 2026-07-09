
  class ListNode {
      int val;
      ListNode next;
     ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode x = head;
        ListNode y = head;
        boolean ans = false;
        while(x != null && x.next != null){
            x = x.next.next;
            y = y.next;
            if(x == y){
                ans = true;
                break;
            }
        }
        return ans;
    }
}