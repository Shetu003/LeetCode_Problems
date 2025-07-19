public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        ListNode pA = headA, pB = headB;

        while (pA != pB) {
            if (pA == null) { // switch to B
                pA = headB;
            } else {
                pA = pA.next; // move forward
            }
            if (pB == null) { // switch to A
                pB = headA;
            } else {
                pB = pB.next; // move forward
            }
        }

        return pA;
    }
}
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         int lenA = getListLength(headA);
//         int lenB = getListLength(headB);
//         while(lenA > lenB){
//             lenA--;
//             headA = headA.next;
//         }
//         while(lenB > lenA){
//             lenB--;
//             headB = headB.next;
//         }
//         while(headA != headB){
//             headA = headA.next;
//             headB = headB.next;
//         }
//         return headA;
//     }
//     public int getListLength(ListNode head){
//         int length = 0;
//         while(head != null){
//             length++;
//             head = head.next;
//         }
//         return length;
//     }
// }