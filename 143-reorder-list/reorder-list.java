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
    public void reorderList(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;

        while (temp != null) {
            st.push(temp);
            temp = temp.next;
        }

        ListNode curr = head;
        ListNode temp1 = curr.next;

        ListNode first = head;
        ListNode slow = head;

        while (first != null && first.next!=null && first.next.next != null) {
            slow = slow.next;
            first = first.next.next;
        }

        int n = st.size() / 2;



        while (n > 0) {
            ListNode p = st.pop(); 
            ListNode next = curr.next;

            curr.next = p;
            p.next = next; 

            curr = next;
            n--;
        }
        if (curr != null) curr.next = null;

    }
}