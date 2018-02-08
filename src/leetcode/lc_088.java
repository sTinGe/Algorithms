package leetcode;

public class lc_088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i>=0 && j>=0) {
            if (nums1[i] < nums2[j]) nums1[k--] = nums2[j--];
            else nums1[k--] = nums1[i--];
        }
        while(j>=0) nums1[k--] = nums2[j--];


        for(int num: nums1) {
            System.out.print(num+",");
        }
    }

    public void run() {
        int[] nums1 = new int[]{1,2,3,4,5,6,6,7,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] nums2 = new int[]{1,1,3,3,3,6,7};

        merge(nums1, 8, nums2, 7);
    }
}
