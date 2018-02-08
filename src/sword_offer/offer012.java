package sword_offer;
// 數值的整數次方

public class offer012 {
    public double Power(double base, int exponent) {
        long p = Math.abs((long)exponent);
        double r = 1.0;
        while (p != 0) {
            if ((p & 1) == 1) {
                r *= base;
            }
            base *= base;
            p = p >> 1;
        }
        return exponent < 0 ? 1/r : r;
    }
}
