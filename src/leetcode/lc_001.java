package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class lc_001 {
    private int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if (nums[i]+nums[j] == target && i != j) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }

    private int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], i);
        }

        for(int j=0; j<nums.length; j++) {
            int complement = target-nums[j];
            if (map.containsKey(complement) && j != map.get(complement)) {
                return new int[] {j, map.get(complement)};
            }
        }
        return new int[]{};
    }

    private int[] twoSum3(int[] nums, int target) {
        Arrays.sort(nums);
        int low = 0, high = nums.length-1;
        while(low < high) {
            if (nums[low]+nums[high] == target) {
                return new int[]{low, high};
            } else if (nums[low]+nums[high] > target) {
                high--;
            } else {
                low++;
            }
        }
        return new int[]{};
    }

    public void run() {
        int[] nums = {2,5,5,11};
        int target = 10;
        int[] res = twoSum(nums, target);
        System.out.println(res[0]+" "+res[1]);
    }
}
