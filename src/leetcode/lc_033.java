package leetcode;

public class lc_033 {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low < high) {
            int mid = (low+high)/2;
            if (nums[mid]>nums[high]) low = mid+1;
            else high = mid;
        }

        int pivot = low;
        low = 0;
        high = nums.length-1;
        while(low <= high) {
            int mid = (low+high)/2;
            int index = (mid+pivot)%nums.length;
            if (nums[index] == target) return index;
            else if (nums[index] > target) high = mid-1;
            else low = mid+1;

        }
        return -1;
    }

    public void run() {
        int[] nums = new int[]{5, 6, 7, 0, 1, 2, 4};
        System.out.println(search(nums, 1));
    }
}
