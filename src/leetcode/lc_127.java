package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lc_127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (wordList.size() == 0) return 0;

        Set<String> begin = new HashSet<>();
        Set<String> end = new HashSet<>();
        begin.add(beginWord);
        end.add(endWord);
        int length = 1;
        Set<String> visited = new HashSet<>();

        while(!begin.isEmpty() && !end.isEmpty()) {
            if (begin.size() > end.size()) {
                Set<String> set = begin;
                begin = end;
                end = set;
            }

            System.out.println("begin: "+begin);
            System.out.println("end: "+end);
            System.out.println("length:"+length);
            System.out.println("");

            Set<String> temp = new HashSet<>();
            for(String word: begin) {
                char[] wordArray = word.toCharArray();
                for(int i=0; i<wordArray.length; i++) {
                    for(char c = 'a'; c <= 'z'; c++) {
                        char ch = wordArray[i];
                        wordArray[i] = c;

                        String str = String.valueOf(wordArray);
                        if (end.contains(str) && wordList.contains(str)) {
                            return length+1;
                        }

                        if (!visited.contains(str) && wordList.contains(str)) {
                            visited.add(str);
                            temp.add(str);
                        }


                        wordArray[i] = ch;
                    }
                }
            }
            begin = temp;
            length++;
        }
        return 0;
    }
    public int ladderLength2(String beginWord, String endWord, List<String> wordList) {
        if (wordList.size() == 0) return 0;

        Set<String> begin = new HashSet<>();
//        Set<String> end = new HashSet<>();
        begin.add(beginWord);
//        end.add(endWord);
        int length = 1;
        Set<String> visited = new HashSet<>();

        while(!begin.isEmpty()) {
//            if (begin.size() > end.size()) {
//                Set<String> set = begin;
//                begin = end;
//                end = set;
//            }

            System.out.println("begin: "+begin);
//            System.out.println("end: "+end);
            System.out.println("length:"+length);
            System.out.println("");
            Set<String> temp = new HashSet<>();
            for(String word: begin) {
                char[] wordArray = word.toCharArray();
                for(int i=0; i<wordArray.length; i++) {
                    for(char c = 'a'; c <= 'z'; c++) {
                        char ch = wordArray[i];
                        wordArray[i] = c;

                        String str = String.valueOf(wordArray);
                        if (str.equals(endWord) && wordList.contains(str)) {
                            return length+1;
                        }

                        if (!visited.contains(str) && wordList.contains(str)) {
                            visited.add(str);
                            temp.add(str);
                        }


                        wordArray[i] = ch;
                    }
                }
            }
            begin = temp;
            length++;
        }
        return 0;
    }

    public void run() {
        String beginWord = "hit";
        String endWord =  "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log");
        System.out.println(ladderLength2(beginWord, endWord, wordList));
    }
}
