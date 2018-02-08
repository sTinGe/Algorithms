package leetcode;

public class lc_226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }

    public void print(TreeNode root) {
        if (root == null) return;

        print(root.left);
        System.out.print(root.val+",");
        print(root.right);
    }

    public void run() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        root = invertTree(root);
        print(root);

    }
}
