package sword_offer;
// 二進制中1的個數

public class offer011 {
    public int NumberOf1(int n) {
        int num = 0;
        while(n != 0) {
            n = n & (n-1);
            num++;
        }
        return num;
    }
}
