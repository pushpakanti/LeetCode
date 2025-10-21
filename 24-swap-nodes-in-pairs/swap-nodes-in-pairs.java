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
    public ListNode swapPairs(ListNode head) {

        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        ListNode prev= dummy;

        ListNode first= head;
        if(head==null) return head;
        ListNode second= first.next;

        while(first!=null && first.next!=null)
        {
            prev.next= second;
            first.next=second.next;
            second.next=first;
            prev=first;
            first=first.next;
            second = (first != null) ? first.next : null;
        }

        return dummy.next;

        
    }
}