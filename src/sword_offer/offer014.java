package sword_offer;
// 鏈表中倒數第k個結點

class ListNode_014 {
    int val;
    ListNode_014 next = null;

    ListNode_014(int val) {
        this.val = val;
    }
}
public class offer014 {
    public ListNode_014 FindKthToTail(ListNode_014 head,int k) {
        if (head == null || k==0) return null;
        ListNode_014 p1 = head;
        ListNode_014 p2 = head;
        while (--k > 0 && p2 != null) {
            p2 = p2.next;
        }

        if (p2 == null) return null;

        while(p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
