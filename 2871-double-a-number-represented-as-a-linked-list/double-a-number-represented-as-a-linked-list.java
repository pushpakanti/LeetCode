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
    public ListNode doubleIt(ListNode head) {
        ListNode curr = head;
        ListNode after = null;
        ListNode prev = null;

        while (curr != null) {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }

        ListNode temp1 = prev;
        int carry = 0;

        while (temp1 != null) {
            int doubled = temp1.val * 2 + carry;
            temp1.val = doubled % 10;

            carry = doubled / 10;
            temp1 = temp1.next;
        }

        if (carry > 0) {
            ListNode temp = prev;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new ListNode(carry);
        }

        ListNode curr1 = prev;
        ListNode after1 = null;
        ListNode prev1 = null;

        while (curr1 != null) {
            after1 = curr1.next;
            curr1.next = prev1;
            prev1 = curr1;
            curr1 = after1;
        }

        return prev1;

    }
}