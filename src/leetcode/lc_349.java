package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lc_349 {
    public int[] intersection(int[] nums1, int[] nums2) {Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int num: nums1) set.add(num);

        for(int num: nums2) {
            if (set.remove(num)) {
                list.add(num);
            }
        }

        int counter = 0;
        int[] res = new int[list.size()];
        for(int num: list) {
            res[counter++] = num;
        }
        return res;
    }

    public void run() {
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};

        int[] res = intersection(nums1, nums2);
        for(int num: res) System.out.println(num);
    }
}
