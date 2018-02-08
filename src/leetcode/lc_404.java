package leetcode;

public class lc_404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        int res = 0;
        TreeNode node = root.left;
        // count only left leaves
        if (node != null) {
            if (node.left == null && node.right == null) res += node.val;
            else {
                res += sumOfLeftLeaves(node.left);
            }
        }
        res += sumOfLeftLeaves(root.right);
        return res;
    }

    public void run() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        TreeNode right = root.right;
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);

        System.out.println(sumOfLeftLeaves(root));
    }
}
