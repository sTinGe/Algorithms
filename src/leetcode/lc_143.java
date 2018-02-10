package leetcode;

public class lc_143 {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode p = head;
        ListNode q = head;
        while(p.next != null && q.next.next != null) {
            p = p.next;
            q = q.next.next;
        }

        ListNode preMiddle = p;
        ListNode preCurrent = p.next;
        while(preCurrent.next != null) {
            ListNode current = preCurrent.next;
            preCurrent.next = current.next;
            current.next = preMiddle.next;
            preMiddle.next = current;
        }

        p = head;
        q = preMiddle.next;
        while(p != preMiddle) {
            preMiddle.next = q.next;
            q.next = p.next;
            p.next = q;

            p = q.next;
            q = preMiddle.next;
        }
//        print(head);
//        p = head;
//        q = pMiddle.next;


    }

    public void print(ListNode head) {
        while(head != null) {
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println("");
    }

    public void run() {
        ListNode head = new ListNode(1);
        ListNode p = head;
        p.next = new ListNode(2);
        p = p.next;
        p.next = new ListNode(3);
        p = p.next;
        p.next = new ListNode(4);
        p = p.next;
        p.next = new ListNode(5);
        p = p.next;
        p.next = new ListNode(6);

        reorderList(head);
    }
}
