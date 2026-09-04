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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        ListNode reversedHead = prev;

        // Step 2: Delete nth node from start (which is nth from end in original)
        if (n == 1) {
            reversedHead = reversedHead.next;
        } else {
            ListNode ptr = reversedHead;
            for (int i = 1; i < n - 1 && ptr != null; i++) {
                ptr = ptr.next;
            }
            if (ptr != null && ptr.next != null) {
                ptr.next = ptr.next.next;
            }
        }

        // Step 3: Reverse back the list
        curr = reversedHead;
        prev = null;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    
    }
}
