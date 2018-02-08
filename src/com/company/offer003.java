package com.company;

/**
 * Created by stinge on 22/07/2017.
 */
public class offer003 {
//    public static ListTree buildTree(char[] in, char[] pre, int inStrt)
    void printTree(TreeNode node) {
        if (node == null) {
            return ;
        }
        printTree(node.left);
        System.out.println(node.val + " ");
        printTree(node.right);
    }
    public static void main(String[] args) {

    }
}
