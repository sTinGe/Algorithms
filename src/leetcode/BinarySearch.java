package leetcode;

public class BinarySearch {
    public int search1(int[] nums) {
        // find minimum in array
        int low = 0, high = nums.length-1;
        while(low < high) {
            int mid = (low+high)/2;
            if (nums[mid] > nums[high]) low = mid+1;
            else high = mid;
        }
        return low;
    }


    public int search2(int[] nums, int target) {
        // find the num index in array, no duplicate
        int low = 0, high = nums.length-1;
        while(low <= high) {
            int mid = (low+high)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return low;
    }



    // find minimum index to insert target
    // one element accepted
    public int search3(int[] nums, int target) {
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
//        System.out.println(search1(nums));
        System.out.println(search2(nums, 1));
        System.out.println(search2(nums, 2)-1);
    }
}
