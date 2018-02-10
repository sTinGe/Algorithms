package leetcode;

public class lc_148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        // merge sort
        ListNode prev = null;
        ListNode p = head, q = head;
        while(q != null && q.next != null) {
            prev = p;
            q = q.next.next;
            p = p.next;
        }

        prev.next = null;

        ListNode list1 = sortList(head);
        ListNode list2 = sortList(p);

        return merge(list1, list2);
    }

    public ListNode merge(ListNode head1, ListNode head2) {
        ListNode first = new ListNode(-1);
        ListNode p = first;
        while(head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                p.next = head1;
                head1 = head1.next;
            } else {
                p.next = head2;
                head2 = head2.next;
            }
            p = p.next;
        }

        if (head1 != null) {
            p.next = head1;
        }
        if (head2 != null) {
            p.next = head2;
        }
        return first.next;
    }

}
