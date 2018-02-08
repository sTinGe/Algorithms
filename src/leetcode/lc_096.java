package leetcode;

public class lc_096 {
    public int numTrees(int n) {
        int[] T = new int[n+1];
        T[0] = 1;
        T[1] = 1;

        for(int i=2; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                T[i] += T[j-1]*T[i-j];
            }
        }
        return T[n];
    }

    public void run() {
        int n = 3;
        System.out.println(numTrees(n));
    }
}
