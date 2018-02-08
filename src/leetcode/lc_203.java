package leetcode;

public class lc_203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode first = new ListNode(-1);
        first.next = head;
        ListNode prev = first;

        ListNode p = head;
        while(p != null) {
            if (p.val == val) {
                while(p != null && p.val == val) {
                    p = p.next;
                }
                prev.next = p;
            } else {
                prev = p;
                p = p.next;
            }
        }

        return first.next;
    }


}
