// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         ListNode cur = head;
//         Stack<Integer> stack = new Stack<>();
//         while(cur != null){
//             stack.push(cur.val);
//             cur = cur.next;
//         }
//         cur = head;
//         while(cur != null && cur.val == stack.pop()){
//             cur = cur.next;
//         }
//         return cur == null;
//     }
// }


class Solution {

    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = reverse(slow);

        while(rev!=null){
            if(head.val!=rev.val){
                return false;
            }
            head=head.next;
            rev=rev.next;
        }
        return true;
    }
}