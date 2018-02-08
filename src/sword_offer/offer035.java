package sword_offer;

import java.util.List;

class ListNode {
    ListNode next;
    int val;
    ListNode(int val) {
        this.val = val;
    }
}
public class offer035 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) return null;

        ListNode p = pHead1;
        ListNode q = pHead2;
        int len1 = FindLengthOfList(pHead1);
        int len2 = FindLengthOfList(pHead2);
        int diff = Math.abs(len1-len2);
        while(diff-- > 0) {
            if (len1 > len2) {
                p = p.next;
            } else {
                q = q.next;
            }
        }

        while(p != null) {
            if (p.val == q.val) {
                return p;
            }
            p = p.next;
            q = q.next;
        }
        return null;
    }

    private int FindLengthOfList(ListNode pHead) {
        ListNode current = pHead;
        int length = 0;
        while(current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public void run() {
        ListNode pHead1 = new ListNode(9);
        pHead1.next = new ListNode(4);
        pHead1.next.next = new ListNode(8);
        pHead1.next.next.next = new ListNode(7);

        ListNode pHead2 = new ListNode(8);
        pHead2.next = new ListNode(7);

        ListNode commonNode = FindFirstCommonNode(pHead1, pHead2);
        ListNode p = commonNode;
        while(p != null) {
            System.out.print(p.val+"->");
            p = p.next;
        }
        System.out.print("null");
    }
}

