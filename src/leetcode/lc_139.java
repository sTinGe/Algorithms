package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc_139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] flag = new boolean[s.length()+1];
        flag[0] = true;

        for(int i=1; i<=s.length(); i++) {
            for(int j=0; j<i; j++) {
                System.out.println("("+j+", "+i+"),"+s.substring(j, i));
                if (flag[j] && wordDict.contains(s.substring(j, i))) {
                    flag[i] = true;
                    break;
                }
            }
            System.out.println("");
        }

        System.out.println("flags:");
        for(int k=0; k<flag.length; k++) {
            System.out.println("("+k+", "+flag[k]+")");
        }
        return flag[s.length()];
    }

    public void run() {
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        System.out.println(wordBreak(s, wordDict));
    }
}
