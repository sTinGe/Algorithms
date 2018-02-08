package leetcode;

public class lc_204 {
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for(int i=2; i<n; i++) {
            if (notPrime[i] == false) {
                count++;
                for(int j=2; i*j<n; j++) {
                    notPrime[i] = true;
                }
            }
        }
        return count;
    }

    public void run() {
        int n = 20;
        System.out.println(countPrimes(n));
    }
}
