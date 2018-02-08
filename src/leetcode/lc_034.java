package leetcode;

public class lc_034 {
    public int[] searchRange(int[] nums, int target) {
        int start = findFirstTarget(nums, target);
        if (start >= nums.length || nums[start] != target) return new int[]{-1, -1};
        int end = findFirstTarget(nums, target+1)-1;
        if (end < 0 || nums[end] != target) return new int[]{-1, -1};
        return new int[]{start, end};
    }
    public int findFirstTarget(int[] nums, int target) {
        int low = 0, high = nums.length;

        while(low<high) {
            int mid = low+(high-low)/2;
            if (nums[mid] < target) {
                low = mid+1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public void run() {
        int[] nums = new int[]{5,7,7,8,8,8,10};
        int target = 10;
        int[] res = searchRange(nums, target);
        System.out.println(res[0]+", "+res[1]);
//        System.out.println(findFirstTarget(nums, target));
    }
}
