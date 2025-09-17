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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        while(curr.next != null && curr.next.next != null){
            ListNode swap1 = curr.next; 
            ListNode swap2 = curr.next.next;
            swap1.next = swap2.next; 
            swap2.next = swap1;
            curr.next = swap2;
            curr = swap1; //update the curr for next pair 
        }
        return dummy.next; //all nodes after dummy 
    }
}