package sword_offer;
// 斐波那契數列

public class offer007 {
    static int[] record = new int[40];
    public int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int first = 0;
        int second = 1;
        int third = 0;
        for(int i=2; i<=n; i++) {
            third = first+second;
            first = second;
            second = third;
        }
        return third;
    }
}
