package leetcode;

public class lc_172 {
    public int trailingZeroes(int n) {
        if (n == 0) return 0;
        return n/5 + trailingZeroes(n/5);
    }

    public void run() {
        int n = 1000;
        System.out.println(trailingZeroes(n));
    }
}
