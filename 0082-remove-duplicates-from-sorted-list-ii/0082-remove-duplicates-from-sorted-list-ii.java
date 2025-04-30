class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans = new ListNode(0, head); // Dummy node to handle edge cases
        ListNode cur = ans; 

        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) { 
                int val = cur.next.val;
                while (cur.next != null && cur.next.val == val) { 
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next; 
            }
        }

        return ans.next; 
    }
}