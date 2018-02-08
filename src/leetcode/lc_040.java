package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc_040 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        backtrack(candidates, list, new ArrayList<>(), target, 0);
        return list;
    }

    private void backtrack(int[] candidates, List<List<Integer>> list, List<Integer> temp, int target, int start) {
        if (target > 0) {
            for(int i=start; i<candidates.length && target >= candidates[i]; i++) {
                temp.add(candidates[i]);
                backtrack(candidates, list, temp, target-candidates[i], i+1);
                temp.remove(temp.size()-1);
            }
        } else if (target == 0) {
            if (!list.contains(new ArrayList<>(temp))) {
                list.add(new ArrayList<>(temp));
            }
        }
    }
    public void run() {
        int[] candidates = new int[]{10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> res = combinationSum(candidates, target);
        for(List<Integer> list: res) {
            System.out.println(list);
        }
    }
}
