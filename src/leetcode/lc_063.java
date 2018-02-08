package leetcode;

public class lc_063 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length == 0) return 0;

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] P = new int[m][n];

        int pass = 1;
        for(int i=0; i<m; i++) {
            if (obstacleGrid[i][0] == 1) {
                pass = 0;
            }
            P[i][0] = pass;

        }
        pass = 1;
        for(int j=0; j<n; j++) {
            if (obstacleGrid[0][j] == 1) {
                pass = 0;
            }
            P[0][j] = pass;
        }

        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    P[i][j] = 0;
                } else {
                    P[i][j] = P[i-1][j]+P[i][j-1];
                }
            }
        }

        return P[m-1][n-1];
    }

    public void run() {
        int[][] obstacleGrid = new int[][] {
//                {0,0,0},
//                {0,1,0},
//                {0,0,0},
                {1, 0}
        };
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }
}
