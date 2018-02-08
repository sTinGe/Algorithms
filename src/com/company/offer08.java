package com.company;

/**
 * Created by stinge on 01/08/2017.
 */
public class offer08 {
    public int JumpFloor(int target) {
        int[] arr = new int[target+1];
        if (target<3) return target;
//
//        arr[0] = 0;
//        arr[1] = 1;
//        arr[2] = 2;
//
//        for (int i=3; i<=target; i++) {
//            arr[i] = arr[i-1]+arr[i-2];
//        }
//        return arr[target];

        int first = 1;
        int second = 2;
        int third = 0;
        for (int i=3; i<=target; i++) {
            third = first+second;
            first = second;
            second = third;
        }
        return third;
    }
}
