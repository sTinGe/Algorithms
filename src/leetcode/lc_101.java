package leetcode;

public class lc_101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return compare(root.left, root.right);
    }

    private boolean compare(TreeNode p1, TreeNode p2) {
        if (p1 == null && p2 == null) return true;
        if (p1 == null || p2 == null) return false;

        if (p1.val != p2.val) return false;
        return compare(p1.left, p2.right) && compare(p1.right, p2.left);
    }


    //        8
    //     /     \
    //    6       6
    //   / \     / \
    //  5   7   7   5
    public void run() {
        TreeNode pRoot = new TreeNode(8);
        pRoot.left = new TreeNode(6);
        pRoot.right = new TreeNode(6);

        TreeNode left = pRoot.left;
        left.left = new TreeNode(5);
        left.right = new TreeNode(7);

        TreeNode right = pRoot.right;
        right.left = new TreeNode(7);
        right.right = new TreeNode(5);

        System.out.println(isSymmetric(pRoot));
    }
}
