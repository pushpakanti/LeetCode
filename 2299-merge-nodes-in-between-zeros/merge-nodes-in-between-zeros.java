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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head;
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (temp != null) {
            int sum = 0;
            while (temp.next != null && temp.next.val != 0) {
                sum += temp.next.val;
                temp = temp.next;
            }
            if (sum > 0) {
                ListNode newNode = new ListNode(sum);
                current.next = newNode;
                current = current.next;

            } 
            temp = temp.next;

        }

        return dummy.next;

    }
}