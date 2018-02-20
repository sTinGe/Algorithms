package leetcode;

public class lc_222 {
    public int countNodes(TreeNode root) {
        int height = getHeight(root);
        if (height == -1) return 0;
        if (getHeight(root.right) == height-1) {
            // left subtree and right subtree has the same height of tree
            return (1<<height) + countNodes(root.right);
        } else {
            return (1<<height-1) + countNodes(root.left);
        }
    }

    public int getHeight(TreeNode root) {
        if (root == null) return -1;
        return 1+getHeight(root.left);
    }
}
