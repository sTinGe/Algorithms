package leetcode;

public class lc_221 {
    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;

        int result = 0;
        int s[][] = new int[m+1][n+1];
        for(int i=1; i<=m; i++) {
            for(int j=1; j<=n; j++) {
                if (matrix[i-1][j-1] == '1') {
                    s[i][j] = Math.min(s[i][j-1], Math.min(s[i-1][j-1], s[i-1][j]))+1;
                    result = Math.max(s[i][j], result);
                }
            }
        }
        return result*result;
    }

    public void run() {
        char[][] matrix = new char[][]{
                {'1','0','1','0','0',},
                {'1','0','1','1','1',},
                {'1','1','1','1','1',},
                {'1','0','0','1','0',},
        };

        System.out.println(maximalSquare(matrix));
    }
}
