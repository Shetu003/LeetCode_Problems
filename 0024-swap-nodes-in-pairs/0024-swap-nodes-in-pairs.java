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

        while (curr.next != null && curr.next.next != null) {
            ListNode swap1 = curr.next;
            ListNode swap2 = curr.next.next;

            swap1.next = swap2.next; //Step 1: link first node to the node after the pair
            swap2.next = swap1; // Step 2: link swap1 after swap2
            curr.next = swap2; // Step 3: connect curr to the new first node of the pair (swap2)
            curr = swap1; // Step 4: move curr to the end of the swapped pair (swap1)
        }
        return dummy.next;
    }
}