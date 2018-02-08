package leetcode;

public class lc_070 {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int first = 1;
        int second = 2;
        int third = 0;

        for(int i= 3; i<= n; i++) {
            third = first + second;
            first = second;
            second = third;
        }

        return third;
    }

    public void run() {
        System.out.println(climbStairs(4));
    }
}
