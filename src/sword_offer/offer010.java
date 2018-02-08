package sword_offer;
// 矩形覆蓋

public class offer010 {
    public int RectCover(int target) {
        if (target<3) return target;

        int first = 1;
        int second = 2;
        int third = 0;
        for (int i=3; i<=target; i++) {
            third = first+second;
            first = second;
            second = third;
        }
        return third;
    }
}
