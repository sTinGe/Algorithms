package leetcode;

import java.util.HashMap;
import java.util.Map;

public class lc_003 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        char[] sArray = s.toCharArray();
        int max = 0;
        for(int i=0, j=0; i<sArray.length; i++) {
            if (map.containsKey(sArray[i])) {
                // 之後有舊的重複字, 必須要以最新的重複字為主
                j = Math.max(j, map.get(sArray[i])+1);
            }
            map.put(sArray[i], i);
            max = Math.max(max, i-j+1);
        }
        return max;
    }

    public void run() {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }

}
