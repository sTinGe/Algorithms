package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc_054 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        if (matrix.length == 0) return res;

        int rowStart = 0;
        int rowEnd = matrix.length-1;
        int colStart = 0;
        int colEnd = matrix[0].length-1;

        while(rowStart <= rowEnd && colStart <= colEnd) {
            for(int i=colStart; i<=colEnd; i++) {
                res.add(matrix[rowStart][i]);
            }
            rowStart++;

            for(int j=rowStart; j<=rowEnd; j++) {
                res.add(matrix[j][colEnd]);
            }
            colEnd--;

            if (rowStart <= rowEnd) {
                for(int k=colEnd; k>=colStart; k--) {
                    res.add(matrix[rowEnd][k]);
                }
                rowEnd--;
            }

            if (colStart <= colEnd) {
                for(int l=rowEnd; l>=rowStart; l--) {
                    res.add(matrix[l][colStart]);
                }
                colStart++;
            }
        }
        return res;

    }

    public void run() {
        int[][] matrix = new int[][]{{2,3}};
        System.out.println(spiralOrder(matrix));
    }
}
