class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode temp = head;
        ListNode before = null;

        while (temp != null) {
            ListNode after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

        return before;
    }
