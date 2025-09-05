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
    public ListNode reverse(ListNode head)
    {
        ListNode curr= head;
        ListNode after= null;
        ListNode prev= null;

        while(curr!= null)
        {
            after= curr.next;
            curr.next= prev;
            prev=curr;
            curr=after;
        }
        return prev;

    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow= head;
        ListNode fast= head;

        while(fast.next!=null && fast.next.next!= null)
        {
            slow= slow.next;
            fast=fast.next.next;
        }
        
        ListNode temp= reverse(slow.next);
        slow.next=temp;
        ListNode p= head;
        ListNode q= temp;

        while(q!= null)
        {
            if(p.val!=q.val) return false;
            p=p.next;
            q=q.next;
        }
        return true;
    }
}