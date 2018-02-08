package sword_offer;

import java.util.ArrayList;
import java.util.Collections;

public class offer026 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str != null && str.length() > 0) {
            PermutationHelper(str.toCharArray(), 0, res);
            Collections.sort(res);
        }
        return res;
    }

    private void PermutationHelper(char[] cs, int i, ArrayList<String> list) {
        if (i == cs.length-1) {
            String str = String.valueOf(cs);
            if (!list.contains(str)) list.add(str);
        } else {
            for (int j=i; j<cs.length; j++) {
                swap(cs, i, j);
                PermutationHelper(cs, i+1, list);
                swap(cs, i, j);
            }
        }
    }

    private void swap(char[] cs, int i, int j) {
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }

    public void run() {
        String s = "abc";
        ArrayList<String> list = Permutation(s);
        System.out.println(list);
    }
}
