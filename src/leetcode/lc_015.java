package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc_015 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int sum = nums[i];
            int low = i+1, high = nums.length-1;
            while(low < high) {
                if (nums[low]+nums[high] == -sum) {
                    list.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while(low < high && nums[low] == nums[low+1]) low++;
                    while(low < high && nums[high] == nums[high-1]) high--;
                    low++;high--;
                } else if (nums[low]+nums[high] > -sum) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return list;
    }

    public void run() {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = threeSum(nums);
        for(List<Integer> list: res) {
            System.out.print("list:");
            System.out.println(list);
        }
    }
}
