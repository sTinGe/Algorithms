package sword_offer;
// 二叉樹中和為某一值的路徑
import java.util.ArrayList;
import java.util.Stack;

public class offer023 {

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Stack<Integer> stack = new Stack<>();
        dfs(root, target, stack, result);
        return result;
    }

    private void dfs(TreeNode root, int sum, Stack<Integer> trace, ArrayList<ArrayList<Integer>> result) {
        if (root == null) return;

        if (root.left == null && root.right == null && sum == root.val) {
            ArrayList<Integer> list= new ArrayList<Integer>();
            list.addAll(trace);
            list.add(root.val);
            result.add(list);
        } else {
            trace.push(root.val);
            dfs(root.left, sum-root.val, trace, result);
            dfs(root.right, sum-root.val, trace,  result);
            trace.pop();
        }
    }

    public void run() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(7);

        root.right = new TreeNode(12);
        ArrayList<ArrayList<Integer>> result = FindPath(root, 22);
        System.out.println(result);
    }
}
