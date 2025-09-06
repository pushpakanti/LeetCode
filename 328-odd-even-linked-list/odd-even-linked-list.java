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
    public ListNode oddEvenList(ListNode head) {
        ListNode even = new ListNode(0);
        ListNode odd = new ListNode(0);
        ListNode tempe = even;
        ListNode tempo = odd;
        ListNode temp = head;

        while (temp != null) {
            tempo.next = temp;
            temp = temp.next;
            tempo = tempo.next;

            tempe.next = temp;
            if (temp == null)
                break;
            temp = temp.next;
            tempe = tempe.next;
        }

        tempo.next = even.next;
        tempe.next = null;
        return odd.next;
    }
}