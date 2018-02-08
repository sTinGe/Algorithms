package leetcode;

public class lc_062 {
    public int uniquePaths(int m, int n) {
        // DP problem
        // P[i][j] = P[i-1][j]+P[i][j-1]
        int[][] P = new int[m][n];
        for(int i=0; i<m ;i++) {
            P[i][0] = 1;
        }
        for(int j=0; j<n; j++) {
            P[0][j] = 1;
        }

        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                P[i][j] = P[i-1][j]+P[i][j-1];
            }
        }
        return P[m-1][n-1];
    }


    public void run() {
        int m = 3;
        int n = 7;
        System.out.println(uniquePaths(m, n));
    }
}
