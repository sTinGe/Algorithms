package com.company;

/**
 * Created by stinge on 02/08/2017.
 */
public class offer16 {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val <= list2.val) {
            list1.next = Merge(list1.next, list2);
            System.out.println("get list1");
            return list1;
        } else {
            list2.next = Merge(list1, list2.next);
            System.out.println("get list2");
            return list2;
        }
    }
}
