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

        if(head==null || head.next==null) return head;

        ListNode temp= head;
        int count=1;

        while(temp.next!=null)
        {
            count++;
            temp= temp.next;
        }
        temp.next= head;

        if(k==count)
        {
            temp.next=null;
            return head;
        }
        else if(k>count)       // if k is greater than totall nodes
        {
            k=k%count;
        }


        int last= count-k;
        ListNode temp2= head;
        for(int i=0; i<last-1; i++)
        {
            temp2=temp2.next;
        }
        ListNode newhead= temp2.next;
        temp2.next=null;

        return newhead;

    }
}