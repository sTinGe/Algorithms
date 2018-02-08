package com.company;

/**
 * Created by stinge on 03/08/2017.
 */
public class offer30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0) return 0;
        int sum = array[0];
        int record = array[0];

        for (int i=1; i<array.length-1; i++) {
            if (sum < 0) {
                sum = array[i];
            } else {
                sum += array[i];
            }

            if (sum > record) {
                record = sum;
            }
        }
        return record;
    }
}
