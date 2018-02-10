package leetcode;

public class lc_138 {
    class RandomListNode {
        int label;
        RandomListNode next, random;
        RandomListNode(int x) { this.label = x; }
    };

    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode p = head;
        while(p != null) {
            RandomListNode next = p.next;
            RandomListNode node = new RandomListNode(p.label);
            node.next = next;
            p.next = node;
            p = next;
        }

        p = head;
        while(p != null) {
            RandomListNode copy = p.next;
            if (p.random != null) {
                copy.random = p.random.next;
            }
            p = copy.next;
        }

        p = head;
        RandomListNode clone = head.next;
        while(p.next != null) {
            RandomListNode next = p.next;
            p.next = next.next;
            p = next;
        }

        return clone;

    }

    public void run() {
        RandomListNode head = new RandomListNode(1);
        RandomListNode p = head;
        p.next = new RandomListNode(2);
        p = p.next;
        p.next = new RandomListNode(3);

//        copyRandomList(head);
    }
}
