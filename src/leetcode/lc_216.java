package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc_216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        if (k == 0) return res;
        backtrack(res, new ArrayList<>(), k, 1, n);
        return res;
    }

    public void backtrack(List<List<Integer>> res, List<Integer> temp, int k, int start, int n) {
        if (temp.size() > k || n < 0) return;
        if (temp.size() == k && n == 0) {
            List<Integer> list = new ArrayList<>(temp);
            res.add(list);
            return;
        }
        for(int i=start; i<=9; i++) {
            temp.add(i);
            backtrack(res, temp, k, i+1, n-i);
            temp.remove(temp.size()-1);
        }
    }

    public void run() {
        int k = 3;
        int n = 9;
        System.out.println(combinationSum3(k, n));
    }
}
