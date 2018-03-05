package leetcode;

public class lc_035 {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0 || nums[0] >= target) return 0;

        for(int i=0; i<nums.length-1; i++) {
            if (nums[i] < target && nums[i+1] >= target){
                return i+1;
            }
        }
        return nums.length;
    }

    public int searchInsert2(int[] nums, int target) {
        int low = 0, high = nums.length;
        while(low < high) {
            int mid = low+(high-low)/2;
            if (nums[mid] < target) low = mid+1;
            else high = mid;
        }
        return low;
    }
    public void run() {
        int[] nums = new int[]{1};
        int target = 1;
        System.out.println(searchInsert(nums, target));
    }
}
