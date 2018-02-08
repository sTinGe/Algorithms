package leetcode;

public class lc_079 {
    public boolean exist(char[][] board, String word) {
        if (board.length == 0) return false;
        int m = board.length;
        int n = board[0].length;
        char[] w = word.toCharArray();
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if (exist(board, w, i, j, m, n,0)) return true;
            }
        }
        return false;
    }

    private boolean exist(char[][] board, char[] word, int i, int j, int m, int n, int index) {
        if (index == word.length) return true;
        if (i<0 || j < 0 || i >= m || j >= n) return false;
        if (board[i][j] != word[index]) return false;
        board[i][j] ^= 256;

        boolean exist = exist(board, word, i+1, j, m, n, index+1) ||
                exist(board, word, i, j+1, m, n, index+1) ||
                exist(board, word, i-1, j, m, n, index+1) ||
                exist(board, word, i, j-1, m, n, index+1);
        board[i][j] ^= 256;
        return exist;
    }

    public void run() {
        char[][] board = new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'},
        };
        String words = "BFCSES";
        System.out.println(exist(board, words));
    }
}
