package sword_offer;

public class offer030 {
    public int NumberOf1Between1AndN_Solution(int n) {
        if(n <= 1) return n;

        int x = 1;
        int result = 0;
        for (int i=1; i<=n; i*=10) {
            int base = i*10;
            int high = n/base;
            int temp = n%base;
            int curr = temp/i;
            int low = temp%i;

            if (curr < x) {
                result += high*i;
            } else if (curr > x) {
                result += (high+1)*i;
            } else {
                result += high*i+low+1;
            }
        }
        return result;
    }

    public void run() {
        int n = 13;
        System.out.println(NumberOf1Between1AndN_Solution(n));
    }
}
