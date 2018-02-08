package sword_offer;
// 順時針打印矩陣

import java.util.ArrayList;

public class offer018 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        if (matrix.length == 0) return result;

        int n = matrix.length, m = matrix[0].length;

        if (m == 0) return result;
        int layer = Math.min(m, n)/2 + 1;
        for (int i=0; i<layer; i++) {
            for(int k=i; k<m-i; k++) result.add(matrix[i][k]); // left to right
            for(int j=i+1; j<n-i; j++) result.add(matrix[j][m-i-1]);// right-top to right-bottom
            for(int k=m-i-2;(k>=i)&&(n-i-1!=i);k--) result.add(matrix[n-i-1][k]);//右至左
            for(int j=n-i-2;(j>i)&&(m-i-1!=i);j--) result.add(matrix[j][i]);//左下至左上
        }
        return result;
    }
}
