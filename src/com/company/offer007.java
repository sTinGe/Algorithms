package com.company;

/**
 * Created by stinge on 26/07/2017.
 */
public class offer007 {
    public static void switchOrder(int[] array, int low, int high) {
        while(low < high) {
            while(low < high && array[low] %2 != 0) {
                low++;
            }
            while(low < high && array[high] %2 == 0) {
                high--;
            }

            int tmp = array[low];
            array[low] = array[high];
            array[high] = tmp;
            switchOrder(array, low+1, high-1);

        }
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,6,1,4,1,7};
        int length = arr.length;
        switchOrder(arr, 0, length-1);

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
