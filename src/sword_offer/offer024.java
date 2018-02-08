package sword_offer;
// 二叉樹中和為某一值的路徑
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
public class offer024 {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) return null;

        RandomListNode currentNode = pHead;
        while(currentNode != null) {
            RandomListNode node = new RandomListNode(currentNode.label);
            node.next = currentNode.next;
            currentNode.next = node;
            currentNode = node.next;
        }

        currentNode = pHead;
        while(currentNode != null) {
            RandomListNode node = currentNode.next;
            if (currentNode.random != null) {
                node.random = currentNode.random.next;
            }
            currentNode = node.next;
        }

        currentNode = pHead;
        RandomListNode pCloneHead = pHead.next;
        while(currentNode.next != null) {
            RandomListNode temp = currentNode.next;
            currentNode.next = temp.next;
            currentNode = temp;
        }
        return pCloneHead;
    }

    public void run() {
        System.out.println("[1->2->3]");
        System.out.println("`random` points to previous node");
        RandomListNode head = new RandomListNode(1);
        RandomListNode p = head;
        p.next = new RandomListNode(2);
        p = p.next;
        p.next = new RandomListNode(3);

        p = head;
        p.random = head.next.next;
        p = p.next;
        p.random = head;
        p = p.next;
        p.random = head.next;

        RandomListNode pCloneNode = Clone(head);
        p = pCloneNode;
        while(p != null) {
            System.out.println("label: "+p.label);
            System.out.println("random: "+p.random.label);
            p = p.next;
        }
    }
}
