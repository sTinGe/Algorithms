package leetcode;

public class lc_762 {
    public int countPrimeSetBits(int L, int R) {
        boolean[] nprimes = new boolean[21];
        nprimes[1] = true;
        for(int i=2; i<21; i++) {
            if (!nprimes[i]) {
                for(int j=2; i*j<21; j++) {
                    nprimes[i*j] = true;
                }
            }
        }

        int sum = 0;
        for(int i=L; i<=R; i++) {
            int bits = bits(i);
            if (!nprimes[bits]) {
//                System.out.println(i+" "+bits);
                sum++;
            }
        }
        return sum;

    }
    public int bits(int n) {
        int counter = 0;
        while(n > 0) {
            n &= (n-1);
            counter++;
        }
        return counter;
    }

    public void run() {
        int L = 10, R = 15;
        System.out.println(countPrimeSetBits(L, R));
    }
}
