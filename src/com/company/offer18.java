package com.company;

/**
 * Created by stinge on 02/08/2017.
 */
public class offer18 {
    public void Mirror(TreeNode root) {
        if (root == null) return;
        if (root.left == null && root.right == null) return;

        TreeNode tmpNode = root.left;
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
