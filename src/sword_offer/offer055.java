package sword_offer;

import java.util.List;

public class offer055 {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) return pHead;

        ListNode first = new ListNode(-1);
        first.next = pHead;

        ListNode p = pHead;
        ListNode last = first;
        while(p != null && p.next != null) {
            ListNode k = p;
            int val = k.val;
            if (p.next.val == val) {
                while(p != null && p.val == val) {
                    p = p.next;
                }
                last.next = p;
            } else {
                last = p;
                p = p.next;
            }
        }

        return first.next;
    }

    public void run() {
        ListNode pHead = new ListNode(1);
        ListNode p = pHead;
        p.next = new ListNode(1);
        p = p.next;
        p.next = new ListNode(1);
        p = p.next;
        p.next = new ListNode(1);
        p = p.next;
        p.next = new ListNode(1);
        p = p.next;
        p.next = new ListNode(1);
        p = p.next;
//        p.next = new ListNode(3);
//        p = p.next;
//        p.next = new ListNode(4);
//        p = p.next;
//        p.next = new ListNode(5);
//        p = p.next;

        pHead = deleteDuplication(pHead);
        p = pHead;
        while(p != null) {
            System.out.print(p.val+",");
            p = p.next;
        }

    }
}
