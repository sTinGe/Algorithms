package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc_095 {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return generate(1, n);
    }

    public List<TreeNode> generate(int start, int end) {
        List<TreeNode> list = new ArrayList<>();
        if (start > end) {
            list.add(null);
            return list;
        }
        if (start == end){
            list.add(new TreeNode(start));
            return list;
        }

        List<TreeNode> left, right;
        for(int i=start; i<=end; i++) {
            left = generate(start, i-1);
            right = generate(i+1, end);

            for(TreeNode lnode: left) {
                for(TreeNode rnode: right) {
                    TreeNode root = new TreeNode(i);
                    root.left = lnode;
                    root.right = rnode;
                    list.add(root);
                }
            }
        }
        return list;
    }

    public void run() {
        int n = 3;
        List<TreeNode> res = generateTrees(n);
        System.out.println(res.size());
    }
}
