package com.company;

import java.util.Stack;

/**
 * Created by stinge on 22/07/2017.
 */
public class offer002 {
    public static Stack<Integer> getStack(ListNode head) {
        Stack<Integer> s1 = new Stack<>();
        while (head != null) {
            s1.push(head.val);
            head = head.next;
        }
        return s1;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(0);
        ListNode l1 = head1;
        l1.next = new ListNode(2);
        l1 = l1.next;
        l1.next = new ListNode(4);
        l1 = l1.next;
        l1.next = new ListNode(3);


        Stack<Integer> s1 = getStack(head1.next);
        while(!s1.empty()) {
            System.out.println(s1.pop());
        }

    }
}
