package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc_077 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), 1, n, k);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> temp, int start, int n, int k) {
        if (k == 0) {
            res.add(new ArrayList<>(temp));
        } else {
            for(int i=start; i<=n; i++) {
                temp.add(i);
                backtrack(res, temp, i+1, n, k-1);
                temp.remove(temp.size()-1);
            }
        }
    }

    public void run() {
        int n = 4, k = 2;
        System.out.println(combine(n, k));
    }
}
