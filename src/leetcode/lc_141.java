package leetcode;

public class lc_141 {
    public boolean hasCycle(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        while(p1 != null && p2 != null) {
            p1 = p1.next;
            p2 = p2.next;

            if (p2 == null) return false;
            p2 = p2.next;

            if (p1 == p2) return true;
        }
        return false;
    }

    public void run() {
        ListNode head = new ListNode(1);
        ListNode p = head;
        p.next = new ListNode(8);
        p.next.next = new ListNode(7);
        p.next.next.next = new ListNode(5);
//        p.next.next.next.next = p.next;

        System.out.println(hasCycle(head));
    }
}
