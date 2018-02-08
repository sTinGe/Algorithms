package leetcode;

import java.util.HashMap;
import java.util.Map;

public class lc_383 {
    public boolean canConstruct(String ransomNote, String magzine) {
        Map<Character, Integer> map = new HashMap<>();
        char[] ransomArray = ransomNote.toCharArray();
        for(char ch: ransomArray) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch)+1);
            }
        }

        char[] magazineArray = magzine.toCharArray();
        for(char ch: magazineArray) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)-1);
            }
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() > 0) return false;
        }
        return true;
    }

    public void run() {
        String ransomNote = "a";
        String magazine = "ba";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
