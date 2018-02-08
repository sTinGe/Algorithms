package leetcode;

public class lc_011 {
    public int maxArea(int[] height) {
        int low = 0, high = height.length-1;
        int area = 0;
        while(low < high) {
            area = Math.max(area, (high-low)*Math.min(height[low], height[high]));
            if (height[low] > height[high]) {
                high--;
            } else {
                low++;
            }
        }
        return area;
    }

    public void run() {
        int[] height = new int[]{1,2,3,4,1,2,2};
        System.out.println(maxArea(height));
    }
}
