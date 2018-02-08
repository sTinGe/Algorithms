package leetcode;

public class lc_371 {
    public int getSum(int a, int b) {
        while(b != 0) {
            int temp = a^b;
            b = (a&b) << 1;
            a = temp;
        }
        return a;
    }
    public void run() {
        int a = 10;
        int b = 8;
        System.out.println(getSum(a, b));
    }
}
