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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp= head;
        ListNode temp1= head;
        int count=1;
        if (head == null || head.next == null || k == 0) {
            return head;}
        else
        {
        while(temp.next!=null)
        {
            temp=temp.next;
            count++;
        } 

        if(k%count==0) return head;
        else
        {
            k= k%count;
        }

        temp.next= temp1;

        ListNode newTail = head;

        for(int i=0; i<count-k-1;i++)
        {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
        }

    }
}