class Solution {
    public int getDecimalValue(ListNode head) {
        int num=0;
        ListNode current=head;
        while(current!=null){
            num=num*2+current.val;
            current=current.next;
        }
        return num;
    }
}
