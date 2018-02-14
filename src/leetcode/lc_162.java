package leetcode;

public class lc_162 {
    public int findPeakElement(int[] nums) {
        int low = 0, high = nums.length-1;

        while(low < high) {
            int mid = (low+high)/2;
            int next = mid+1;
            System.out.println(nums[mid]+","+nums[next]);
            if (nums[mid] < nums[next]) {
                low = next;
            } else {
                high = mid;
            }
        }
        return low;
    }
    public void run() {
        int[] nums = new int[]{1,2,3,1,1,0,3,1,1,2,2,3,3};
        System.out.println(findPeakElement(nums));
    }
}
