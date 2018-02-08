package com.company;

/**
 * Created by stinge on 26/07/2017.
 */
public class offer008 {
    public static ListNode countdownto(ListNode head, int k) {
       if (head == null || k < 0) return null;

       ListNode pHead = head;
       ListNode pTail = head;

       while(--k > 0 && pTail != null ) {
           pTail = pTail.next;
       }

       if (pTail == null) {
           return null;
       }

       while(pTail.next != null) {
           pHead = pHead.next;
           pTail = pTail.next;
       }
       return pHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode pNode = head;
        pNode.next = new ListNode(2);
        pNode = pNode.next;
        pNode.next = new ListNode(3);
        pNode = pNode.next;
        pNode.next = new ListNode(4);
        pNode = pNode.next;
        pNode.next = new ListNode(5);
        pNode = pNode.next;

//        ListNode c = null;
        pNode = countdownto(head, 2);
        if (pNode != null) {
            System.out.println(pNode.val);
        } else {
            System.out.println("null");
        }
    }
}
