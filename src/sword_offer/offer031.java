package sword_offer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class offer031 {
    public String PrintMinNumber(int[] numbers) {
        if (numbers.length == 0) return "";

        int length = numbers.length;
        String[] strArray = new String[length];
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<length; i++) {
            strArray[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strArray, (s1, s2) -> {
            String c1 = s1 + s2;
            String c2 = s2 + s1;
            return c1.compareTo(c2);
        });
        for(int i=0; i<length; i++) {
            sb.append(strArray[i]);
        }
        return sb.toString();
    }
    public void run() {
        int[] numbers = {3,32,321};
        System.out.println(PrintMinNumber(numbers));
    }
}
