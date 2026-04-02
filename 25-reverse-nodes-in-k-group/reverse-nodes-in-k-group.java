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

    ListNode reverse(ListNode head, int time)
    {
        ListNode curr= head;
        ListNode prev= null;

        while(time>0 && curr!=null)
        {
            ListNode next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
            time--;
        }

        return prev;
    }


    public ListNode reverseKGroup(ListNode head, int k) {
         if(head==null) return head;

        ListNode left= head;
        ListNode res= null;
        ListNode prevLeft= null;
        ListNode right;

        while(true)
        {
            right=left;
            int size=k;
            int i;
            for( i=0; i<=size-1; i++)
            {
                if (right==null) break;
                right= right.next;
            }
            if( i<=size-1 && right==null)
            {
                if(prevLeft!= null) prevLeft.next= left;
                break;
            }

                ListNode nextLeft= right;
                ListNode newHead= reverse(left, size);

                if(res==null)
                {
                    res=newHead;
                }
                if (prevLeft != null)
                prevLeft.next = newHead;

                left.next = nextLeft;

                prevLeft = left;

                left = nextLeft;

                if (left == null) break;
            }

            return res != null ? res : head;
    }
}