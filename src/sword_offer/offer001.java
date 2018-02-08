package sword_offer;
//二維數組中的查找

public class offer001 {
    public boolean Find(int target, int [][] array) {
        int m = array.length;
        int n = array[0].length;

        // 左下角
        int x = m-1;
        int y = 0;
        while(x>=0 && y<n) {
            if (target < array[x][y]) {
                x--;
            }
            else if (target > array[x][y]) {
                y++;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
