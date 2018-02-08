package com.company;

/**
 * Created by stinge on 01/08/2017.
 */
public class offer06 {
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        if (array.length == 1) {
            return array[0];
        }

        int low = 0, high = array.length-1;
        while(low<high) {
            int mid = (low+high)/2;
            // 3,4,5,6,0,1,2
            if (array[mid] > array[high]) {
                low = mid+1;
            }
            // 2,2,3,4,5,6,6
            else if (array[mid] < array[high]) {
                high = mid;
            }
            // 1,1,1,0,1
            else {
                high = high-1;
            }
        }
        return array[low];
    }
}
