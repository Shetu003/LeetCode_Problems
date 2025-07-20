/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // we have to find out from where the cycle is started
        ListNode slow = head;
        ListNode fast = head;

        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }
        }
        
        if (fast == null || fast.next == null){
            return null; // for single element if next is null then no cycle
        }

        while(head != slow){
            head = head.next;
            slow = slow.next;
        }
        return head;
    }
}
