package sword_offer;

public class offer054 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null) return null;

        ListNode p1 = pHead;
        ListNode p2 = pHead;

        while( p1 != null && p2 != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                p2 = pHead;
                while(p1 != p2) {
                    p1 = p1.next;
                    p2 = p2.next;
                }
                return p1;
            }
        }
        return null;
    }

    // 0 - 1 - 2 - 3
    //          \  |
    //            4
    public void run() {
        ListNode pHead = new ListNode(0);
        ListNode p = pHead;
        p.next = new ListNode(1);
        p = p.next;
        p.next = new ListNode(2);
        p = p.next;
        ListNode x = p;
        p.next = new ListNode(3);
        p = p.next;
        p.next = new ListNode(4);
        p = p.next;
        p.next = x;

        ListNode entry = EntryNodeOfLoop(pHead);
        System.out.println(entry.val);

    }
}
