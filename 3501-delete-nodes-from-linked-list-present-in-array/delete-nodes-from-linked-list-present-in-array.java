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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hs= new HashSet<>();

        for(int i=0; i<nums.length; i++)
        {
            hs.add(nums[i]);
        }

        ListNode temp= head;
        ListNode dummy= new ListNode(-1);
        dummy.next= head;
        ListNode prev= dummy;


        while(temp!=null)
        {
            if(hs.contains(temp.val))
            {
                prev.next=temp.next;
            }
            else
            {
                prev=prev.next;
            }
            
            temp=temp.next;
            
        }

        return dummy.next;
    }
}