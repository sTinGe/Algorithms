package sword_offer;

public class offer046 {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean flag = sum > 0 && (sum += Sum_Solution(n-1)) > 0;
        return sum;
    }

    public void run() {
        int n = 10;
        System.out.println(Sum_Solution(n));
    }
}
