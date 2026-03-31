class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode before = dummy;
        int pos = 1;

        while (pos < left) {
            before = before.next;
            pos++;
        }

        ListNode curr = before.next;
        ListNode prev = null;

        for (int i = 0; i <= right - left; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        before.next.next = curr;
        before.next = prev;      

        return dummy.next;
    }
}