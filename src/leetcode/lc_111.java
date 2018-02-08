package leetcode;

public class lc_111 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if (left == 0 || right == 0) return left+right+1;
        return Math.min(left, right)+1;
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

        System.out.println(minDepth(pRoot));
    }
}
