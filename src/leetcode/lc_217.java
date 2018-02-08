package leetcode;

import java.util.HashSet;
import java.util.Set;

public class lc_217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums) {
            if (!set.add(num)){
                return true;
            }
        }
        return false;
    }

    public void run() {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,22,20,22};
        System.out.println(containsDuplicate(nums));
    }
}
