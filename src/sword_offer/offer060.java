package sword_offer;

import sun.security.krb5.internal.crypto.Des;

import java.util.ArrayList;

public class offer060 {
    int index = -1;
    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null) {
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val+",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }
    TreeNode Deserialize(String str) {
        index++;
        String[] strArray = str.split(",");
        if ("#".equals(strArray[index]) || "".equals(strArray[index])) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.valueOf(strArray[index]));
        node.left = Deserialize(str);
        node.right = Deserialize(str);
        return node;
    }

    //        8
    //     /     \
    //    6       6
    //     \     /
    //      7   7
    public void run() {
        // 8,6,#,7,#,#,6,7,#,#,#
        TreeNode pRoot = new TreeNode(8);
        pRoot.left = new TreeNode(6);
        pRoot.right = new TreeNode(6);

        TreeNode left = pRoot.left;
        left.right = new TreeNode(7);

        TreeNode right = pRoot.right;
        right.left = new TreeNode(7);

        String str = Serialize(pRoot);
//        System.out.println(str);

        TreeNode qRoot = Deserialize(str);
        ArrayList<ArrayList<Integer>> list = new offer059().Print2(qRoot);
        for(ArrayList<Integer> l: list) {
            System.out.println(l);
        }
    }
}
