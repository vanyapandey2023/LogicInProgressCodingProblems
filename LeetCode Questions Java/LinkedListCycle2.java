
  class ListNode {
      int val;
      ListNode next;
     ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
//------------------------------------------------------------------------------------
 //SOLUTION PSUEDOCODE:
  // Okay, first, do the same thing that you did in part 1
    // After you find out if there is a cycle or not, keep the faster point where the two     points meet, move the slower one back to the head, and move both forward normally while keeping track of the index of the slow one by assigning int index = 0 and incrementing it whenever the points move forwards. Where they both meet, return the index. 
public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode x = head;
        ListNode y = head;
        ListNode p = head;
        
        while(x != null && x.next != null){
            x = x.next.next;
            y = y.next;
            if(x == y){
                while(y != p)
                {
                    y = y.next;
                    p = p.next;
                }

                return y;
            }
        }
        return null;
    }
}