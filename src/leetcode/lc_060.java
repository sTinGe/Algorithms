package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc_060 {
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        int[] factorial = new int[n+1];
        factorial[0] = 1;
        for(int i=1; i<=n; i++) {
            factorial[i] = factorial[i-1]*i;
        }

        List<Integer> numbers = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            numbers.add(i);
        }


        k--;
        for(int i=1; i<=n; i++) {
            int index = k/factorial[n-i];
            int num = numbers.remove(index);
            sb.append(num);
            k-= index*factorial[n-i];
        }
        return sb.toString();
    }

    public void run() {
        int n = 4, k = 4;
        System.out.println(getPermutation(n, k));
    }
}
