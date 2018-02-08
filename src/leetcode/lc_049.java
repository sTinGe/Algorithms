package leetcode;

import java.util.*;

public class lc_049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        if (strs.length == 0) return res;
        for(String str: strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            String key = Arrays.toString(charArray);
            if (!map.containsKey(key)) map.put(key, new ArrayList<>());
            List<String> value = map.get(key);
            value.add(str);
            map.put(key, value);
        }

        for(Map.Entry<String, List<String>> entry: map.entrySet()) {
            res.add(entry.getValue());
        }
//        return new ArrayList<>(map.values());
        return res;
    }


    public void run() {
        String[] strs = new String[]{ "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> res = groupAnagrams(strs);
        for(List<String> list: res) {
            System.out.println(list);
        }
    }
}
