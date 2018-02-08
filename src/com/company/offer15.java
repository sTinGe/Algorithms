package com.company;

import java.util.Stack;

/**
 * Created by stinge on 02/08/2017.
 */
public class offer15 {
    public ListNode ReverseList(ListNode head) {
        if (head == null) return null;
        ListNode pre = null;
        ListNode next = null;
        while(head != null) {
            next = head.next;
            /////////////////
            head.next = pre;
            pre = head;
            /////////////////
            head = next;
        }
        return pre;
    }
}
