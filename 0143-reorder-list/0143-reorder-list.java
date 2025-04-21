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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return;

        //finding the middle pt of the linked list 
        ListNode slow = head, fast = head, prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null; //splitting it into two halves

        //reversing the second half
        ListNode secondHalf = reverseList(slow);

        //merging the list again
        mergeList(head, secondHalf);
    }

    private ListNode reverseList(ListNode head){
        ListNode prev = null, current = head, next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    private void mergeList(ListNode first, ListNode second) {
        while (first != null && second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            if (temp1 == null) break;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
}