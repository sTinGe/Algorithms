package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class lc_071 {
    public String simplifyPath(String path) {
        LinkedList<String> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder("/");
        for(String str: path.split("/")) {
            if (str.equals("..")) {
                if (!list.isEmpty()) {
                    list.removeLast();
                }
            } else if (!str.equals(".") && !str.equals("")) {
                list.add(str);
            }
        }

        for(String str: list) {
            sb.append(str+"/");
        }

        if (!list.isEmpty()) {
            // get rid of last `/`
            sb.setLength(sb.length()-1);
        }
        return sb.toString();
    }

    public void run() {
        String path = "/a/./b/../../c/";
        System.out.println(simplifyPath(path));
    }
}
