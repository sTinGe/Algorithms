package com.company;

/**
 * Created by stinge on 26/07/2017.
 */
public class offer010 {
    public static boolean isSameTree(TreeNode root1, TreeNode root2) {
//        if (root1 == null && root2 == null) return true;
//        if (root1 == null || root2 == null) return false;
        if (root1 == null && root2 != null) return false;
        if (root2 == null) return true;
        if (root1.val == root2.val) return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
        return false;
    }
    public static boolean hasSubTree(TreeNode root1, TreeNode root2) {
        // if root
//        boolean result = false;
////        if (root1 == null && root2 == null) return true;
////        if (root1 == null || root2 == null) return false;
//        if (root1 == null && root2 != null) return false;
//        if (root2 == null) return true;
//        if (root1.val == root2.val) {
//            result = isSameTree(root1, root2);
//        }
//
//        if (!result) result = hasSubTree(root1.left, root2);
//        if (!result) result = hasSubTree(root1.right, root2);
//        return result;
        if (root1 == null || root2 == null) return false;
        // same(root1, root2)
        // subTree(root1.left, root2)
        // subTree(root1.right, root2)
        return isSameTree(root1, root2) || hasSubTree(root1.left, root2) || hasSubTree(root1.right, root2);
    }
}
