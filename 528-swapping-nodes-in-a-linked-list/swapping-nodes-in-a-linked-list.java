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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp= head;
        ListNode temp1= head;
        int size=0;
        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }

        int arr[]= new int[size];
        int i=0;

        while(temp1!=null)
        {
            arr[i]=temp1.val;
            temp1=temp1.next;
            i++;
        }

        int varr= arr[k-1];
        arr[k-1]= arr[size-k];
        arr[size-k]= varr;

        ListNode temp2= head;
        int p=0;
        while(temp2!=null)
        {
            temp2.val= arr[p];
            temp2=temp2.next;
            p++;
        }

        return head;
        
    }
}