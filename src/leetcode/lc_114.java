package leetcode;

public class lc_114 {
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }

    public void run() {
        TreeNode pRoot = new TreeNode(8);
        pRoot.left = new TreeNode(6);
        pRoot.right = new TreeNode(10);

        TreeNode left = pRoot.left;
        left.left = new TreeNode(5); // 19
        left.right = new TreeNode(9); // 23

        TreeNode right = pRoot.right;
        right.left = new TreeNode(5); // 23
        right.right = new TreeNode(12); // 30

        flatten(pRoot);
        while(pRoot != null) {
            System.out.print(pRoot.val+"->");
            pRoot = pRoot.right;
        }
    }
}
