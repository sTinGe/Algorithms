package leetcode;

public class lc_074 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;

        int x = m-1;
        int y = 0;

        while(x>=0 && y <n) {
            System.out.println(x+","+y);
            if (matrix[x][y] > target) {
                x--;
            } else if (matrix[x][y] < target) {
                y++;
            } else {
                return true;
            }
        }

        return false;
    }

    public void run() {
        int[][] matrix = new int[][]{
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,50}
        };

        int target = 18;
        System.out.println(searchMatrix(matrix, target));
    }
}
