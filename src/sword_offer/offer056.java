package sword_offer;

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
public class offer056 {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) return null;
        TreeLinkNode p = pNode;
        if (p.right != null) {
            p = p.right;
            while(p.left != null) {
                p = p.left;
            }
            return p;
        }

        while(p.next != null) {
            if (p.next.left == p) return p.next;
            p = p.next;
        }
        return null;
    }

    //          0
    //        /   \
    //       1     2
    //      /       \
    //     3         4
    public void run() {
        TreeLinkNode root = new TreeLinkNode(0);
        root.left = new TreeLinkNode(1);
        root.right = new TreeLinkNode(2);

        TreeLinkNode left = root.left;
        left.next = root;
        left.left = new TreeLinkNode(3);
        left.left.next = left;

        TreeLinkNode right = root.right;
        right.next = root;
        right.right = new TreeLinkNode(4);
        right.right.next = right;

        TreeLinkNode next = GetNext(right.right);
        if (next == null) {
            System.out.println("null");
            return;
        }
        System.out.println(next.val);
    }
}
