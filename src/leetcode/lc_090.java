package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc_090 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums, 0);
        return res;
    }

    public void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int start) {
        res.add(new ArrayList<>(temp));
        for(int i=start; i<nums.length; i++) {
            if (i > start && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            backtrack(res, temp, nums, i+1);
            temp.remove(temp.size()-1);
        }
    }

    public void run() {
        int[] nums = new int[]{4,4,4,1,4};
        List<List<Integer>> res = subsetsWithDup(nums);
        for(List<Integer> list: res) {
            System.out.println(list);
        }
        System.out.println(res.size());
    }
}
