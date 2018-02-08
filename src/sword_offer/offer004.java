package sword_offer;
// 重建二叉樹

class TreeNode_004 {
    int val;
    TreeNode_004 left;
    TreeNode_004 right;
    TreeNode_004(int x) { val = x; }
}

public class offer004 {
    public TreeNode_004 reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode_004 root = reConstructBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
        return root;
    }

    private TreeNode_004 reConstructBinaryTree(int[] pre, int pstart, int pend, int[] in, int istart, int iend) {
        if (pstart > pend || istart > iend) {
            return null;
        }

        TreeNode_004 node = new TreeNode_004(pre[pstart]);
        for (int i=istart; i<=iend; i++) {
            if (in[i] == pre[pstart]) {
                node.left = reConstructBinaryTree(pre, pstart+1, pstart+i-istart, in, istart, i-1);
                node.right = reConstructBinaryTree(pre, pstart+i-istart+1, pend, in, i+1, iend);
                break;
            }
        }return node;
    }
}
