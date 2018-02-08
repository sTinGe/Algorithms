package leetcode;

public class lc_073 {
    public void setZeros(int[][] matrix) {
        if (matrix.length == 0) return;
        int m = matrix.length;
        int n = matrix[0].length;

        boolean col0 = false;
        for(int i=0; i<m; i++) {
            if (matrix[i][0] == 0) col0 = true;
            for(int j=1; j<n; j++) {
               if (matrix[i][j] == 0) {
                   matrix[i][0] = 0;
                   matrix[0][j] = 0;
               }
            }
        }

        for(int i=m-1; i>=0; i--) {
            for(int j=n-1; j>=1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (col0) matrix[i][0] = 0;
        }

    }

    public void run() {
        int[][] matrix = new int[][]{
                {0,0,0,5},
                {4,3,1,4},
                {0,1,1,4},
                {1,2,1,3},
                {0,0,1,1},
        };

        setZeros(matrix);

        for(int[] layer: matrix) {
            for(int n: layer) {
                System.out.print(n+",");
            }
            System.out.println("");
        }
    }
}