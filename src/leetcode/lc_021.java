package leetcode;

public class lc_021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            // l1.val > l2.val
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public void run() {
        ListNode l1 = new ListNode(1);
        ListNode p = l1;
        p.next = new ListNode(2);
        p = p.next;
        p.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        p = l2;
        p.next = new ListNode(3);
        p = p.next;
        p.next = new ListNode(4);

        ListNode res = mergeTwoLists(l1, l2);

        while(res != null) {
            System.out.print(res.val+"->");
            res = res.next;
        }
    }
}
