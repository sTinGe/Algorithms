package sword_offer;

public class offer025 {
    TreeNode p = null;
    TreeNode head = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        ConvertSub(pRootOfTree);
        return head;
    }

    private void ConvertSub(TreeNode root) {
        if (root == null) return;
        ConvertSub(root.left);
        if (head == null) {
            p = root;
            head = root;
        } else {
            p.right = root;
            root.left = p;
            p = root;
        }
        ConvertSub(root.right);
    }

//            7
//          /   \
//         4     9
//        / \
//       2   6
    public void run() {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(4);
        TreeNode left = root.left;
        left.left = new TreeNode(2);
        left.right = new TreeNode(6);
        root.right = new TreeNode(9);

        TreeNode pHead = Convert(root);
        TreeNode p = pHead;
        while(p != null) {
            System.out.println("value: "+p.val);
            System.out.print("left: ");
            if (p.left == null) System.out.print("null");
            else System.out.print(p.left.val);
            System.out.println("");

            System.out.print("right: ");
            if (p.right == null) System.out.print("null");
            else System.out.print(p.right.val);
            System.out.println("");

            p = p.right;
        }
    }
}
