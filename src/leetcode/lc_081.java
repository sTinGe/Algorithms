package leetcode;

public class lc_081 {
    public boolean search(int[] nums, int target) {
        if (nums.length == 0) return false;
        if (nums.length == 1) return nums[0] == target;
        int low = 0, high = nums.length-1;
        while(low < high) {
            int mid = (low+high)/2;
            if (nums[mid] == target) return true;

            if (nums[mid]>nums[high]) {
                if (nums[mid] > target && nums[low] <= target) {
                    high = mid;
                    continue;
                }
                low = mid+1;
            }
            else if (nums[mid]<nums[high]) {
                if (nums[mid] < target && nums[high] >= target) {
                    low = mid+1;
                    continue;
                }
                high = mid;
            }
            else {
                high--;
            }
        }
        return (nums[low] == target);
    }

    public void run() {
        int[] nums = new int[]{2,2,2,1,2,2};
        System.out.println(search(nums, 0));
    }
}
