package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lc_187 {
    public List<String> findRepeatedDnaSequences(String s) {
        int[] dna = new int[26];
        List<String> res = new ArrayList<>();
        if (s.length() == 0) return res;

        Set<Integer> set = new HashSet<>();
        Set<Integer> repeatedSet = new HashSet<>();
        dna['A'-'A'] = 0;
        dna['C'-'A'] = 1;
        dna['G'-'A'] = 2;
        dna['T'-'A'] = 3;

        for(int i=0; i+9<s.length(); i++) {
            int n = 0;
            for(int j=i; j<i+10; j++) {
                n |= dna[s.charAt(j)-'A'];
                n <<= 2;
            }
            // n is a integer which represents a sequence of dna string
            // compare this integer is repeated or not
            if (!set.add(n) && repeatedSet.add(n)) {
                res.add(s.substring(i, i+10));
            }
        }
        return res;
    }

    public void run() {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(findRepeatedDnaSequences(s));
    }
}
