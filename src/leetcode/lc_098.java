package leetcode;

public class lc_098 {
    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean valid(TreeNode root, long min, long max) {
        if (root == null) return true;

        if (root.val >= max || root.val <= min) return false;
        return valid(root.left, min, root.val) && valid(root.right, root.val, max);
    }

    public void run() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(12);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(7);

        root.right = new TreeNode(12);

        System.out.println(isValidBST(root));
    }
}
