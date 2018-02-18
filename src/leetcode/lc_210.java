package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class lc_210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses == 0) return new int[]{};
        int[][] matrix = new int[numCourses][numCourses];
        int[] indegree = new int[numCourses];
        int[] res = new int[numCourses];

        for(int i=0; i<prerequisites.length; i++) {
            int ready = prerequisites[i][0];
            int pre = prerequisites[i][1];
            if (matrix[pre][ready] == 0) {
                indegree[ready]++;
            }
            matrix[pre][ready] = 1;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<indegree.length; i++) {
            if (indegree[i] == 0) queue.offer(i);
        }

        int count = 0;
        while(!queue.isEmpty()) {
            int course = queue.poll();
            res[count++] = course;
            for(int i=0; i<numCourses; i++) {
                if (matrix[course][i] != 0) {
                    if (--indegree[i] == 0) {
                        queue.offer(i);
                    }
                }
            }
        }
        return count == numCourses ? res : new int[]{};
    }

    public void run() {
        int numberCpurses = 2;
        int[][] prerequisites = new int[][]{
                {0,1},{1,0}
        };
        int[] res = findOrder(numberCpurses, prerequisites);
    }
}
