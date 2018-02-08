package com.company;

public class offernn {
    public int NumberOf1Between1AndN_Solution(int n) {
        int x = 1;
        int total = 0;
        for(int i=1; i<=n; i*=10) {
            int base = i*10;
            int high = n / base;
            int temp = n % base;
            int curr = temp / i;
            int low = temp % i;
            if (curr < x) {
                total += high*i;
            } else if (curr > x) {
                total += (high+1)*i;
            } else {
                // curr = x
                total += high*i+low+1;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        offernn n = new offernn();
        int total = n.NumberOf1Between1AndN_Solution(10);

        System.out.print(total);
    }
}
