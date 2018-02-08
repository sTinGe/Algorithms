package sword_offer;

public class offer038 {
    private boolean isBalanced = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        getDepth(root);
        return isBalanced;
    }

    private int getDepth(TreeNode root) {
        if (root == null) return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if (Math.abs(left - right) > 1) {
            isBalanced = false;
        }
        return Math.max(left, right)+1;
    }
    public void run() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);
        root.right.right.left = new TreeNode(6);
        System.out.println(IsBalanced_Solution(root));
    }
}
