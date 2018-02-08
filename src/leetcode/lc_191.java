package leetcode;

public class lc_191 {
    public int hammingWeight(int n) {
        int counter = 0;
        while(n > 0) {
            counter += n&1;
            n >>>= 1;
        }
        return counter;
    }

    public void run() {
        int n = 11;
        System.out.println(hammingWeight(n));
    }
}
