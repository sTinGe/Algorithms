package com.company;

import java.util.ArrayList;

import static java.lang.Math.max;

/**
 * Created by stinge on 02/08/2017.
 */
public class offer29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (k>input.length) return result;
        for(int i=0; i<k; i++) {
            HeapSort(input, i, input.length-1);
            result.add(input[i]);
        }
        return result;
    }

    public void HeapSort(int[] input, int root, int end) {
        for(int j=end-1; j>=root; j--) {
            int parent = (j+root-1)/2;
            if (input[parent] > input[j]) {
                int tmp = input[parent];
                input[parent] = input[j];
                input[j] = tmp;
            }
        }
    }
}
