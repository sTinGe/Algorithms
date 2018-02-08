package com.company;

import java.util.HashMap;
import java.util.Map;

public class Leetcode001 {

    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                return new int[]{ map.get(numbers[i])+1, i+1 };
            } else {
                map.put(target-numbers[i], i);
            }
        }
        return new int[]{0, 0};
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int[] answer  = twoSum(arr, 6);
        System.out.println(answer[0]+", "+answer[1]);
    }
}
