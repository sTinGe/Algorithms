package com.company;

import java.util.Arrays;

/**
 * Created by stinge on 01/08/2017.
 */
public class offer04 {
    //前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
//        TreeNode root = reConstructBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
//        return root;
        TreeNode root = reConstructBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
        return root;
    }

    private TreeNode reConstructBinaryTree(int[] pre, int pstart, int pend, int[] in, int istart, int iend) {
//        if (pstart > pend || istart > iend) {
//            return null;
//        }
//
//        TreeNode node = new TreeNode(pre[pstart]);
//        for(int i=istart; i<=iend; i++) {
//            if (in[i] == pre[pstart]) {
//                node.left = reConstructBinaryTree(pre, pstart+1, pstart+i-istart, in, istart, i-1);
//                node.right = reConstructBinaryTree(pre, pstart+i-istart+1, pend, in, i+1, iend);
//            }
//        }
//        return node;
        if (pstart > pend || istart > iend) {
            return null;
        }

        TreeNode node = new TreeNode(pre[pstart]);
        for (int i=istart; i<=iend; i++) {
            if (in[i] == pre[pstart]) {
                node.left = reConstructBinaryTree(pre, pstart+1, pstart+i-istart, in, istart, i-1);
                node.right = reConstructBinaryTree(pre, pstart+i-istart+1, pend, in, i+1, iend);
                break;
            }
        }return node;
    }




}
