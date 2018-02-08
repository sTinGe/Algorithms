package com.company;

/**
 * Created by stinge on 23/05/2017.
 */
public class Leetcode002 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }
        int carry = 0;
        ListNode newHead = new ListNode(0);
        ListNode l3 = newHead;

        while(l1 != null || l2 != null) {
            int newVal = 0;
            if (l1 != null) {
                newVal += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                newVal += l2.val;
                l2 = l2.next;
            }

            newVal += carry;
            carry = newVal/10;
            newVal = newVal%10;

            l3.next = new ListNode(newVal);
            l3 = l3.next;
        }

        if (carry == 1) {
            l3.next = new ListNode(1);
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(0);
        ListNode l1 = head1;
        l1.next = new ListNode(2);
        l1 = l1.next;
        l1.next = new ListNode(4);
        l1 = l1.next;
        l1.next = new ListNode(3);

        ListNode head2 = new ListNode(0);
        ListNode l2 = head2;
        l2.next = new ListNode(5);
        l2 = l2.next;
        l2.next = new ListNode(6);
        l2 = l2.next;
        l2.next = new ListNode(4);

        ListNode res = addTwoNumbers(head1.next, head2.next);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
