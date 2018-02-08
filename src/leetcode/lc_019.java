package leetcode;

public class lc_019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = new ListNode(0);
        first.next = head;
        ListNode p = first;
        ListNode q = first;
        while(n-- > -1) {
            q = q.next;
        }
        while(q != null) {
            p = p.next;
            q = q.next;
        }

        p.next = p.next.next;

        return first.next;
    }

    public void run() {
        ListNode head = new ListNode(1);
        ListNode p = head;
//        p.next = new ListNode(2);
//        p = p.next;
//        p.next = new ListNode(3);
//        p = p.next;
//        p.next = new ListNode(4);
//        p = p.next;
//        p.next = new ListNode(5);


        ListNode res = removeNthFromEnd(head, 1);
        while(res != null) {
            System.out.print(res.val+"->");
            res = res.next;
        }
    }
}
