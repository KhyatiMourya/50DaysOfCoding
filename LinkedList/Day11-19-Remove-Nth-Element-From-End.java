class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode d = new ListNode(0);
        d.next=head;
        ListNode fast= d;
        ListNode slow = d;
        for(int i=0; i<=n; i++){
            if (fast==null){
                return null;
            }
            fast=fast.next;
            }
        while(fast!=null){
                fast=fast.next;
                slow=slow.next;
            }
            slow.next=slow.next.next;
            return d.next;
        }
        
        
    }
