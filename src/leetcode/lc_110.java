package leetcode;

public class lc_110 {
    boolean isBalance = true;

    public boolean isBalanced(TreeNode root) {
        depth(root);
        return isBalance;
    }

    private int depth(TreeNode root) {
        if (root == null) return 0;

        int left = depth(root.left);
        int right = depth(root.right);

        if (Math.abs(left-right) > 1) {
            isBalance = false;
        }

        return Math.max(left, right)+1;
    }

    //         8
    //           \
    //            6
    //             \
    //              5

    public void run() {
        TreeNode pRoot = new TreeNode(8);
//        pRoot.left = new TreeNode(6);
        pRoot.right = new TreeNode(6);

//        TreeNode left = pRoot.left;
//        left.left = new TreeNode(5);

        TreeNode right = pRoot.right;
        right.right = new TreeNode(5);

        System.out.println(isBalanced(pRoot));
    }
}
