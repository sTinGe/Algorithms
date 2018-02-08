package sword_offer;
// 二叉樹的鏡像

class TreeNode_017 {
    int val = 0;
    TreeNode_017 left = null;
    TreeNode_017 right = null;

    public TreeNode_017(int val) {
        this.val = val;

    }
}

public class offer017 {
    public void Mirror(TreeNode_017 root) {
        if (root == null) return;
        if (root.left == null && root.right == null) return;

        TreeNode_017 tmpNode = root.left;
        root.left = root.right;
        root.right = tmpNode;

        if (root.left != null) {
            Mirror(root.left);
        }
        if (root.right != null) {
            Mirror(root.right);
        }
    }
}
