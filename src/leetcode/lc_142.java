package leetcode;

public class lc_142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && slow!=null) {
            slow = slow.next;
            if (fast.next == null) return null;
            fast = fast.next.next;

            // encountered ,has cycle
            if (fast == slow) {
                fast = head;

                while(fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }
}
