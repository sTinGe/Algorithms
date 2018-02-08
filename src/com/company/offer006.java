package com.company;

/**
 * Created by stinge on 26/07/2017.
 */
public class offer006 {
    public static ListNode deleteNode(ListNode head, ListNode deleted) {
        if (head == null || deleted == null) {
            return head;
        }

        // normal
        if (deleted.next != null) {
            System.out.println("delete node");
            ListNode pNext = deleted.next;
            deleted.val = pNext.val;
            deleted.next = pNext.next;
            return head;
        }
        // one node
        else if (head == deleted) {
            System.out.println("delete list");
            deleted = null;
            head = null;
        }
        // delete last node
        else {
            System.out.println("delete last node");
            ListNode pNode = head;
            while (pNode.next != deleted) {
                pNode = pNode.next;
            }
            pNode.next = null;
            deleted = null;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode pNode = head;
        pNode.next = new ListNode(2);
        pNode = pNode.next;
        pNode.next = new ListNode(1);
        pNode = pNode.next;
        pNode.next = new ListNode(4);
        pNode = pNode.next;
        pNode.next = new ListNode(7);
        pNode = pNode.next;

        int deleteIndex = 2, i = 0;
        pNode = head;
        while(i<deleteIndex && pNode != null) {
            pNode = pNode.next;
            i++;
        }
//
        head = deleteNode(head.next, pNode);
        pNode = head;
        while(pNode != null) {
            System.out.println(pNode.val);
            pNode = pNode.next;
        }
    }
}
