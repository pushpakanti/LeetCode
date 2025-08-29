/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;

        int count1=0;
        int count2=0;

        while(temp1!=null)
        {
            temp1=temp1.next;
            count1++;
        }
        while(temp2!=null)
        {
            temp2=temp2.next;
            count2++;
        }

        temp1=headA;
        temp2=headB;

        if(count1>count2)
        {
            int steps=count1-count2;
            for(int i=0; i<steps; i++)
            {
                temp1=temp1.next;
            }
        }

        if(count1<count2)
        {
            int steps=count2-count1;
            for(int i=0; i<steps; i++)
            {
                temp2=temp2.next;
            }
        }

        while(temp1!=temp2)
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }

        return temp1; 
    }
}
