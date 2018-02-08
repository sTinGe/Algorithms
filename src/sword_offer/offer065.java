package sword_offer;

public class offer065 {
    public int movingCount(int threshold, int rows, int cols) {
        int[] flag = new int[rows*cols];
        return trace(threshold, rows, cols, 0, 0, flag);
    }

    public int trace(int threshold, int rows, int cols, int i, int j, int[] flag) {
        int index = i*cols+j;
        if (i < 0 || j < 0) return 0;
        if (i >= rows || j >= cols) return 0;
        if (flag[index] == 1) return 0;
        if (sum(i)+sum(j) > threshold) return 0;
        flag[index] = 1;
        return trace(threshold, rows, cols, i-1, j, flag)+
                trace(threshold, rows, cols, i+1, j, flag)+
                trace(threshold, rows, cols, i, j-1, flag)+
                trace(threshold, rows, cols, i, j+1, flag)+1;

    }

    public int sum(int i) {
        int sum = i%10;
        while((i = i/10) > 0) {
            sum += i%10;
        }
        return sum;
    }
}
