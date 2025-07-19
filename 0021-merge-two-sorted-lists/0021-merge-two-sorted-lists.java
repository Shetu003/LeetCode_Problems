class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();  // Dummy node
        ListNode curr = dummy;            // Pointer to build the new list

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;           // Use curr, not dummy
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;            // Move curr forward
        }

        // Attach the remaining list
        if (l1 != null) {
            curr.next = l1;
        } else {
            curr.next = l2;
        }

        return dummy.next;               // Return head of merged list
    }
}
