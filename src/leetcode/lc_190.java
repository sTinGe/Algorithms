package leetcode;

public class lc_190 {
    public int reverseBits(int n) {
        int res = 0;
        for(int i=0; i<31; i++) {
            res += (n&1);
            n >>>= 1;
            res <<= 1;
        }
        res += n&1;
        return res;
    }

    public void run() {
        int n = 43261596;
        System.out.println(reverseBits(n));
    }
}
