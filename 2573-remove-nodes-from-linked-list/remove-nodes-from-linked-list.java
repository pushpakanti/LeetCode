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
    public ListNode removeNodes(ListNode head) {

        ListNode after = null;
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }

        ListNode temp = prev;
        Stack<Integer> st = new Stack<>();

        int min = Integer.MIN_VALUE;
        while (temp != null) {

            if (temp.val >= min) {
                st.push(temp.val);
                min = temp.val;
            }
            temp = temp.next;
        }

        ListNode newHead = new ListNode(st.pop());
        ListNode current = newHead;
        while (!st.isEmpty()) {
             current.next = new ListNode(st.pop());
             current = current.next;
        }

        return newHead;

    }
}