package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class lc_179 {
    public String largestNumber(int[] nums) {
        if (nums.length == 0) return "";

        String[] array = new String[nums.length];
        for(int i=0; i<nums.length; i++) {
            array[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String c1 = o1+o2;
                String c2 = o2+o1;
                return c2.compareTo(c1);
            }
        });
        if (array[0].charAt(0) == '0') {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for(String str: array) {
            sb.append(str);
        }

        return sb.toString();
    }

    public void run() {
        int[] nums = new int[]{3,30,34,5,9};
        System.out.println(largestNumber(nums));
    }
}
