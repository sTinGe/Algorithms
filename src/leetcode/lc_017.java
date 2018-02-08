package leetcode;

import java.util.LinkedList;
import java.util.List;

public class lc_017 {
    public List<String> letterCombinations(String digits) {
        String[] map = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        LinkedList<String> res = new LinkedList<>();

        if (digits.length() == 0) return res;

            res.add("");
        for(int i=0; i<digits.length(); i++) {
            int x = Character.getNumericValue(digits.charAt(i));
            while(res.peek().length() == i) {
                String str = res.removeFirst();
                for(char ch: map[x].toCharArray()) {
                    res.add(str+ch);
                }
            }
        }
        return res;
    }
    public void run() {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
}
