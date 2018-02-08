package com.company;

import java.util.List;

/**
 * Created by stinge on 01/08/2017.
 */
public class offer01 {
    boolean Find(int target, int[][] array) {
        int m = array.length;
        int n = array[0].length;

        int x = m-1;
        int y = 0;
        while(x>=0 && y<n) {
            //System.out.println(array[x][y]);
            if (target < array[x][y]) {
                x--;
            }
            else if (target > array[x][y]) {
                y++;
            }
            else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        offer16 judge = new offer16();
        ListNode p1 = new ListNode(1);
        ListNode n = p1;
        n.next = new ListNode(3);
        n = n.next;
        n.next = new ListNode(5);
        n = n.next;
        n.next = new ListNode(7);
        n = n.next;
//
        ListNode p2 = new ListNode(2);
        n = p2;
        n.next = new ListNode(4);
        n = n.next;
        n.next = new ListNode(6);
        n = n.next;

        ListNode res = judge.Merge(p1, p2);
        while(res != null) {
            System.out.println(res.val);
            res = res.next;
        }
//        int[] array = new int[] {1,2,3,4,5,6,7};
//        array = judge.reOrderArray(array);
//
//        for(int i=0; i<array.length; i++) {
//            System.out.println(array[i]);
//        }

    }
}
