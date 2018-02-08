package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc_131 {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        if (s.length() == 0) return res;
        backtrack(s, res, new ArrayList<>(), 0);
        return res;

    }
    public void backtrack(String s, List<List<String>> res, List<String> temp, int index) {
        if (temp.size() > 0 && index >= s.length()) {
            res.add(new ArrayList<>(temp));
        }
        for(int i=index; i<s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                // add
//                if (index == i) {
//                    temp.add(Character.toString(s.charAt(i)));
//                } else {
                    temp.add(s.substring(index, i+1));
//                }
                backtrack(s, res, temp, i+1);
                // remove
                temp.remove(temp.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s, int low, int high) {
        while(low < high) {
            if (s.charAt(low) != s.charAt(high)) return false;
            low++;
            high--;
        }
        return true;

    }

    public void run() {
        String s = "aab";
        System.out.println(partition(s));
    }
}
