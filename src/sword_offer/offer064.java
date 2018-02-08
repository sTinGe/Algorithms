package sword_offer;

public class offer064 {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        int flag[] = new int[matrix.length];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if (trace(matrix, rows, cols, i, j, str, 0, flag)) return true;
            }
        }
        return false;
    }

    public boolean trace(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, int[] flag) {
        int index = i*cols+j;
        if (i<0 || j<0) return false;
        if (i>=rows || j>=cols) return false;
        if (matrix[index] != str[k]) return false;
        if (flag[index] == 1) return false;

        if (k == str.length-1) return true;
        flag[index] = 1;
        if (trace(matrix, rows, cols, i-1, j, str, k+1, flag) ||
                trace(matrix, rows, cols, i+1, j, str, k+1, flag) ||
                trace(matrix, rows, cols, i, j-1, str, k+1, flag) ||
                trace(matrix, rows, cols, i, j+1, str, k+1, flag)) {
            return true;
        }

        flag[index] = 0;
        return false;
    }

    public void run() {
        String t1 = "ABCESFCSADEE";
        String s1 = "ABCCED";
        String t2 = "ABCESFCSADEE";
        String s2 = "ABCB";
        int row1 = 3;
        int col1 = 4;
        System.out.println(hasPath(t2.toCharArray(), row1, col1, s2.toCharArray()));
    }
}
