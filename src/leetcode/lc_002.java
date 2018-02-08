package leetcode;

public class lc_002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = new ListNode(-1);
        ListNode p = first;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0) {
            if (l1 != null && l2 != null) {
                int temp = (l1.val+l2.val+carry)/10;
                p.next = new ListNode((l1.val+l2.val+carry)%10);
                carry = temp;
                p = p.next;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 == null) {
                int temp = (l2.val+carry)/10;
                p.next = new ListNode((l2.val+carry)%10);
                carry = temp;
                p = p.next;
                l2 = l2.next;
            } else {
                int temp = (l1.val+carry)/10;
                p.next = new ListNode((l1.val+carry)%10);
                carry = temp;
                p = p.next;
                l1 = l1.next;
            }
        }
        return first.next;
    }

    public void run() {
        ListNode l1 = new ListNode(2);
        ListNode p = l1;
//        p.next = new ListNode(4);
//        p = p.next;
//        p.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
//        p = l2;
//        p.next = new ListNode(6);
//        p = p.next;
//        p.next = new ListNode(4);

        ListNode res = addTwoNumbers(l1, l2);
        while(res != null) {
            System.out.print(res.val+"->");
            res = res.next;
        }
    }
}
