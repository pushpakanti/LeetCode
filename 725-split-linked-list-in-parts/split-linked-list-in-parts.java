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
    public ListNode[] splitListToParts(ListNode head, int k) {

        if(head==null) return new ListNode[k];

        ListNode res[]= new ListNode[k];

        ListNode temp1= head;
        int count= 1;

        while(temp1.next!=null)
        {
            count++;
            temp1=temp1.next;
        }
        
        ListNode temp2= head;

        if(k>count)
        {
            ListNode next;
            for(int i=0; i<res.length; i++)
            {
                if(temp2!=null){
                    res[i]= temp2;
                    next=temp2.next;        // breaking the connection
                    temp2.next= null;
                    temp2= next;
                }
                else
                {
                    res[i]=null;
                }
                
                
            }
        }
        else if(k<=count)
        {
            int carry= count/k;
            int extra= count%k;

            for(int i=0; i<k; i++)
            {
                res[i]= temp2;

                int partSize= carry;
                if(i<extra)
                {
                    partSize++;
                }

                for(int j=1; j<partSize; j++)
                {
                    if(temp2!=null)
                    {
                        temp2= temp2.next;
                    }
                }

                if(temp2!=null)     // breaking the connection
                {
                    ListNode next= temp2.next;
                    temp2.next=null;
                    temp2= next;

                }
            }

        }

        return res;
    }
}