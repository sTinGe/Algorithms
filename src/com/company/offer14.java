package com.company;

/**
 * Created by stinge on 02/08/2017.
 */
public class offer14 {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) return null;
        ListNode p1 = head;
        ListNode p2 = head;
        while (--k > 0 && p2 != null) {
            p2 = p2.next;
        }

        if (p2 == null) return null;

        while(p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
