package leetcode;

public class lc_231 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n&(n-1)) == 0;
    }

    public void run() {
        System.out.println(isPowerOfTwo(10));
    }
}
