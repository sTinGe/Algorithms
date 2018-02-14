package leetcode;

public class lc_153 {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length-1;
        while(low < high) {
            int mid = (low+high)/2;
            if (nums[mid] > nums[high]) {
                low = mid+1;
            } else if (nums[mid] < nums[high]) {
                high = mid;
            } else {
                high--;
            }
        }
        return nums[low];
    }

    public void run() {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }
}
