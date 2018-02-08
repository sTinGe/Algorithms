package leetcode;

public class lc_048 {
    public void rotate(int[][] matrix) {
        // reverse
        int low = 0, high = matrix.length-1;
        while (low < high) {
            int[] temp = matrix[low];
            matrix[low] = matrix[high];
            matrix[high] = temp;
            low++; high--;
        }
//        print(matrix);
//        System.out.println(matrix[0][1]+" "+matrix[1][0]);
        // symmetric swap
        for(int i=0; i<matrix.length; i++) {
            for(int j=i+1; j<matrix[0].length; j++) {
                if (i != j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        print(matrix);
    }

    public void print(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j]+",");
            }
            System.out.println("");
        }
    }

    public void run() {
//        int[][] matrix = new int[][] {
//                { 5, 1, 9,11},
//                { 2, 4, 8,10},
//                {13, 3, 6, 7},
//                {15,14,12,16},
//        };

        int[][] matrix = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        rotate(matrix);
    }
}
