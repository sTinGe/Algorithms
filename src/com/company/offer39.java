package com.company;

/**
 * Created by stinge on 06/08/2017.
 */
public class offer39 {
    public boolean IsBalanced(TreeNode node, int depth) {
        if (node == null) {
            return true;
        }
        int left = 0, right = 0;
        if (IsBalanced(node.left, left) && IsBalanced(node.right, right)) {
            if (left-right > 1 || left-right < -1) {
                return false;
            }
            depth = (left > right) ? left+1 : right+1;
            return true;
        } else {
            return false;
        }

    }
    public boolean IsBalanced_Solution(TreeNode root) {
        int dep = 0;
        return IsBalanced(root, dep);
    }
}
