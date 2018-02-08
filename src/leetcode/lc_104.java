package leetcode;

public class lc_104 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right)+1;
    }

    //        8
    //     /     \
    //    6       6
    //   /         \
    //  5           5
    public void run() {
        TreeNode pRoot = new TreeNode(8);
        pRoot.left = new TreeNode(6);
        pRoot.right = new TreeNode(6);

        TreeNode left = pRoot.left;
        left.left = new TreeNode(5);

        TreeNode right = pRoot.right;
        right.right = new TreeNode(5);

        System.out.println(maxDepth(pRoot));
    }
}
