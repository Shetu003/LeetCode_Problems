class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) { //find the middle of the LL
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reverse(slow); //from middle break the LL into two part and reverse it
        fast = head;

        while (fast != null && slow != null) { // compare both the half
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

//using STACK without reversing the LL

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