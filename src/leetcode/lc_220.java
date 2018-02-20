package leetcode;

import java.util.HashMap;
import java.util.Map;

public class lc_220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k < 1 || t < 0) return false;
        Map<Long, Long> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            long remappedNum = (long) nums[i] - Integer.MIN_VALUE;
            long bucket = remappedNum / ((long)t+1); // avoid 0 crashed issue
            System.out.println(remappedNum+bucket);

            if (map.containsKey(bucket) ||
                    (map.containsKey(bucket-1) && remappedNum - map.get(bucket-1) <= t) ||
                    (map.containsKey(bucket+1) && map.get(bucket+1) - remappedNum <= t)) {
                return true;
            }

            if (map.entrySet().size() >= k) {
                long lastBucket = ((long)nums[i-k] - Integer.MIN_VALUE) / ((long)t+1);
                map.remove(lastBucket);
            }
            map.put(bucket, remappedNum);
        }
        return false;
    }

    public boolean containsNearbyAlmostDuplicate2(int[] nums, int k, int t) {
        if (k < 1 || t < 0) return false;
        Map<Long, Long> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            long remappedNum = (long) nums[i] - Integer.MIN_VALUE;
            long bucket = remappedNum / ((long) t + 1);
            System.out.println(remappedNum+bucket);
            if (map.containsKey(bucket)
                    || (map.containsKey(bucket - 1) && remappedNum - map.get(bucket - 1) <= t)
                    || (map.containsKey(bucket + 1) && map.get(bucket + 1) - remappedNum <= t))
                return true;
            if (map.entrySet().size() >= k) {
                long lastBucket = ((long) nums[i - k] - Integer.MIN_VALUE) / ((long) t + 1);
                map.remove(lastBucket);
            }
            map.put(bucket, remappedNum);
        }
        return false;
    }

    public void run() {
        int[] nums = new int[]{-1, 2147483647};
        int k = 1, t = 2147483647;
        System.out.println(containsNearbyAlmostDuplicate(nums, k, t));
        System.out.println(containsNearbyAlmostDuplicate2(nums, k, t));
    }
}
