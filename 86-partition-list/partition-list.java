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
    public ListNode partition(ListNode head, int x) {
        ListNode before= new ListNode(0);
        ListNode after= new ListNode(0);

        ListNode tempb= before;
        ListNode tempa= after;

        ListNode temp=head;

        while(temp!=null)
        {
            if(temp.val<x)
            {
                tempb.next= temp;
                tempb=tempb.next;
                
            }
            else{
                tempa.next= temp;
                tempa=tempa.next;
            }
            temp=temp.next;

        }
        tempa.next= null;
        tempb.next= after.next;
        return before.next;


    }
}