package leetcode;

public class lc_064 {
    public int minPathSum(int[][] grid) {
        // DP
        // P[i][j] = Math.min(P[i-1][j], P[i][j-1])+P[i][j]
        if (grid.length == 0) return 0;
        int m = grid.length;
        int n = grid[0].length;

        int[][] P = new int[m][n];
        P[0][0] = grid[0][0];
        for(int i=1; i<m; i++) {
            P[i][0] = P[i-1][0]+grid[i][0];
        }
        for(int j=1; j<n; j++) {
            P[0][j] = P[0][j-1]+grid[0][j];
        }

        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                P[i][j] = Math.min(P[i-1][j], P[i][j-1])+grid[i][j];
            }
        }

//        for(int i=0; i<m; i++) {
//            for(int j=0; j<n; j++) {
//                System.out.print(P[i][j]+",");
//            }
//            System.out.println("");
//        }


        return P[m-1][n-1];
    }

    public void run() {
        int[][] grid = new int[][]{
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };
        System.out.println(minPathSum(grid));
    }
}
