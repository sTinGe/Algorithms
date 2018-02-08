package leetcode;

import java.util.Arrays;
import java.util.List;

public class lc_057 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        if (n == 0) return matrix;

        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = n-1;

        int num = 1;
        while(rowStart <= rowEnd && colStart <= colEnd) {
            for(int i=colStart; i<=colEnd; i++) {
                matrix[rowStart][i] = num++;
            }
            rowStart++;
            for(int j=rowStart; j<=rowEnd; j++) {
                matrix[j][colEnd] = num++;
            }
            colEnd--;
            for(int k=colEnd; k>= colStart; k--) {
                matrix[rowEnd][k] = num++;
            }
            rowEnd--;
            for(int l=rowEnd; l>=rowStart; l--) {
                matrix[l][colStart] = num++;
            }
            colStart++;
        }
        return matrix;
    }

    public void run() {
        int n = 5;
        int[][] matrix = generateMatrix(n);

        for(int[] layer: matrix) {
            System.out.println(Arrays.toString(layer));

        }
    }
}
