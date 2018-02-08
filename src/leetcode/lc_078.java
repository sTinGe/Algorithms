package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc_078 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, list, new ArrayList<>(), 0);
        return list;
    }

    public void backtrack(int[] nums, List<List<Integer>> list, List<Integer> temp, int start) {
        list.add(new ArrayList<>(temp));
        for(int i=start; i<nums.length; i++) {
            temp.add(nums[i]);
            backtrack(nums, list, temp, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
