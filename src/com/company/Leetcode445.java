package com.company;

import java.util.List;
import java.util.Stack;

/**
 * Created by stinge on 22/07/2017.
 */
public class Leetcode445 {
    public static ListNode addTwoNumbersII(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();

        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }

        int sum = 0;
        ListNode list = new ListNode(0);
        while(!s1.empty() || !s2.empty()) {
            if (!s1.empty()) sum += s1.pop();
            if (!s2.empty()) sum += s2.pop();
            list.val = sum%10;
            ListNode head = new ListNode(sum/10);
            head.next = list;
            list = head;
            sum /= 10;
        }

        if (list.val == 0) {
            return list.next;
        } else {
            return list;
        }
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        ListNode head = new ListNode(4);
        head.next = l1;
        l1 = head;
        head = new ListNode(2);
        head.next = l1;
        l1 = head;
        head = new ListNode(7);
        head.next = l1;
        l1 = head;

        ListNode l2 = new ListNode(4);
        head = new ListNode(6);
        head.next = l2;
        l2 = head;
        head = new ListNode(5);
        head.next = l2;
        l2 = head;

        ListNode list = addTwoNumbersII(l1, l2);
        while(list != null) {
            System.out.println(list.val);
            list = list.next;
        }
//        while(l1 != null) {
//            System.out.println(l1.val);
//            l1 = l1.next;
//        }
//
//        System.out.println("///");
//        while(l2 != null) {
//            System.out.println(l2.val);
//            l2 = l2.next;
//        }

    }
}
