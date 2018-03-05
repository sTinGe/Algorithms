package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc_046 {
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        backtrack(nums, list, new ArrayList<>(), new boolean[nums.length]);
        return list;
    }
    public void backtrack(int[] nums, List<List<Integer>> list, List<Integer> temp, boolean[] used) {
        if (temp.size() == nums.length) {
            list.add(new ArrayList<>(temp));
        } else {
            // first case(1,1,2) would be skipped
            // second for loop [false, true, false] can present first accepted result [1,2,1](two, three, one)
            for(int i=0; i<nums.length; i++) {
                if (used[i] || i > 0 && nums[i] == nums[i-1] && used[i-1]) continue;
                used[i] = true;
                temp.add(nums[i]);
                backtrack(nums, list, temp, used);
                used[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }

    public void run() {
        int[] nums = new int[]{1,1,2};
        List<List<Integer>> res = permute(nums);
        for(List<Integer> list: res) {
            System.out.println(list);
        }
    }
}
