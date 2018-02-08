package leetcode;

import java.util.HashSet;
import java.util.Set;

public class lc_202 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(set.add(n)) {
            int square = 0;
            while(n > 0) {
                int r = n%10;
                square += r*r;
                n/=10;
            }

            if (square == 1) {
                return true;
            } else {
                n = square;
            }
        }
        return false;
    }

    public void run() {
        int n = 20;
        System.out.println(isHappy(n));
    }
}
