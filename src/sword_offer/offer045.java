package sword_offer;

public class offer045 {
    public int LastRemaining_Solution(int n, int m) {
        if (n == 0) return -1;
        if (n == 1) return 0;
        return (LastRemaining_Solution(n-1, m)+m)%n;
    }
    public void run() {
        int n = 5;
        int m = 2;
        System.out.println(LastRemaining_Solution(n, m));
    }
}
