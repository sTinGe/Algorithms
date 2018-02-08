package com.company;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by stinge on 01/08/2017.
 */
public class offer03 {
    public offer03() {
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s1 = new Stack<>();

        ListNode p = listNode;
        while (p != null) {
            s1.push(p.val);
            p = p.next;
        }

        while(!s1.empty()) {
            int i = s1.pop();
            list.add(i);
        }
        return list;
    }
}
