package com.company;

/**
 * Created by stinge on 02/08/2017.
 }*/
public class offer17 {

    public boolean HasSubTree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        boolean result = false;
        if (root1.val == root2.val) {
            result = isSubTree(root1, root2);
        }
        if (!result) result = HasSubTree(root1.left, root2);
        if (!result) result = HasSubTree(root1.right, root2);
        return result;
    }

    public boolean isSubTree(TreeNode root1, TreeNode root2) {
        if (root2 == null) return true;
        if (root1 == null) return false;

        if (root1.val == root2.val) {
            return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
        }
        return false;
    }

    public boolean isSameTree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val == root2.val) {
            return isSameTree(root1.left, root1.right) && isSameTree(root1.right, root2.right);
        }
        return false;
    }
}