package leetcode;

public class lc_069 {
    public int mySqrt(int x) {
        // 牛頓求根法  牛逼
        int left = 1, right = x;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if (mid == x/mid) return mid;
            else if (mid < x/mid) {
                left = mid+1;
            }
            else if (mid > x/mid) {
                right = mid-1;
            }
        }
        return right;
    }

    public int mySqrt2(int x) {
        // 平民做法
        int left = 1, right = x;
        while(left <= right) {
            int mid = (left+right)/2;
            if (mid == x/mid) return mid;
            else if (mid < x/mid) {
                left = mid+1;
            } else if (mid > x/mid) {
                right = mid-1;
            }
        }
        return right;
    }
    public void run() {
        int x = 8;
        System.out.println(mySqrt2(x));
    }
}
