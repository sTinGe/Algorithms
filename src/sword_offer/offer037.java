package sword_offer;

import apple.laf.JRSUIUtils;

public class offer037 {

    public int TreeDepth(TreeNode root) {
        if (root == null) return 0;
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left, right) + 1;
    }
    public void run() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);
        root.right.right.left = new TreeNode(6);
        System.out.println(TreeDepth(root));
    }
}
