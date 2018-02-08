package sword_offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class offer027 {
    public int MoreThanHalfNum_Solution1(int[] array) {
        if (array.length == 0) return 0;
        if (array.length == 1) return array[0];

        ArrayList<Integer> list = new ArrayList<>();
        for (int num: array) {
            list.add(num);
        }

        Collections.sort(list);
        int mid = array.length/2;
        Integer moreNum = list.get(mid);
        int count = 0;
        for(int num: array) {
            if (num == moreNum) {
                count++;
            }
        }
        return count > array.length/2 ? moreNum : 0;
    }

    public int MoreThanHalfNum_Solution2(int[] array) {
        if (array.length == 0) return 0;
        if (array.length == 1) return array[0];

        int result = array[0];
        int count = 1;

        for (int i=1; i<array.length; i++) {
            if (count == 0) {
                result = array[i];
                count = 1;
            } else if (array[i] == result) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int num: array) {
            if (num == result) count++;
        }
        return count > array.length/2 ? result : 0;
    }

    public void run() {
        int[] array = {1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution2(array));
    }
}
