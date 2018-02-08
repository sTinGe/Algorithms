package leetcode;

import java.util.HashSet;
import java.util.Set;

public class lc_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            if (i > k) set.remove(nums[i-k-1]);
            if (!set.add(nums[i])) return true;
        }
        return false;
    }

    public void run() {
        int[] nums = new int[]{1,0,1,1};
        System.out.println(containsNearbyDuplicate(nums, 1));
    }
}
