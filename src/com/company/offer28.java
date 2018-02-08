package com.company;

/**
 * Created by stinge on 02/08/2017.
 */
public class offer28 {
    // 1,2,3,2,2,2,5,4,2
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array.length == 0) return 0;
        int num = array[0], count = 1;
        for (int i=1; i<array.length; i++) {
            if (num == array[i]) count++;
            else count --;

            if (count == 0) {
                num = array[i+1];
                count = 1;
            }
        }

        // verify
        count = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i] == num) count++;
        }
        if (count*2 > array.length) return num;
        return 0;
    }
}
