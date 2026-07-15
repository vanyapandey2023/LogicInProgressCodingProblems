/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        ListNode x = l1;
        ListNode y = l2;
        
        while(x != null){
            stack1.push(x.val);
            x = x.next;
        }
        while(y != null){
            stack2.push(y.val);
            y = y.next;
        }

        ListNode a = null;
        ListNode b = null;
        int carry = 0;

        while(!stack1.isEmpty() || !stack2.isEmpty()){
            int total = carry;

            if(!stack1.isEmpty() && !stack2.isEmpty()){
                total += stack1.pop() + stack2.pop();
            } else if(!stack1.isEmpty()){
                total += stack1.pop();
            } else{
                total += stack2.pop();
            }

            carry = total/10;
            total = total % 10;

            ListNode z = new ListNode(total);
            b = z;
            b.next = a;
            a = b;
        }
        if(carry > 0){
            ListNode z = new ListNode(carry);
            b = z;
            b.next = a;
            a = b;
            while(b.next != null){ 
            b = b.next; 
            }
        }
        while(b.next != null){
            b = b.next;
        }
        b.next = null;
        return a;
    }
}