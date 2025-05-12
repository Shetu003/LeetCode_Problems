class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head;
        for(int i=0; i<n; i++){   //Move fast n  steps ahead
            fast = fast.next;
        }
        if(fast == null){
            return head.next;
        }
        while(fast.next!=null){  //move slow and fast together until fast.next == null
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;  //skip the element next to the slow 
        return head;
    }
}

