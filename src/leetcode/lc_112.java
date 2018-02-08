package leetcode;

public class lc_112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;

        if (root.left == null && root.right == null && sum == root.val) {
            return true;
        }
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }

    public void run() {
        TreeNode pRoot = new TreeNode(8);
        pRoot.left = new TreeNode(6);
        pRoot.right = new TreeNode(10);

        TreeNode left = pRoot.left;
        left.left = new TreeNode(5); // 19
        left.right = new TreeNode(8); // 22

        TreeNode right = pRoot.right;
        right.left = new TreeNode(5); // 23
        right.right = new TreeNode(12); // 30

        System.out.println(hasPathSum(pRoot, 23));
    }
}
