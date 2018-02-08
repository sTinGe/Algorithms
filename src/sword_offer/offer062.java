package sword_offer;

import java.util.Comparator;
import java.util.PriorityQueue;

public class offer062 {
    int count = 0;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(15, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });

    public void Insert(Integer num) {
        if ((count & 1) == 0) {
            maxHeap.offer(num);
            int filtered = maxHeap.poll();
            minHeap.offer(filtered);
        } else {
            minHeap.offer(num);
            int filtered = minHeap.poll();
            maxHeap.offer(filtered);
        }
        count++;
    }

    public Double GetMedian() {
        if ((count & 1) == 0) {
            return (double) (maxHeap.peek() + minHeap.peek()) / 2;
        } else {
            return new Double(minHeap.peek());
        }
    }

    public void run() {
        Insert(5);// min: 5
        Insert(2);// min: 2 max: 5
        Insert(3);// min: 3 max: 2, 5


        // max: 5
        // max: 5, min: 2
        // max: 5, 2, min: 3
        System.out.println(count);
        System.out.println(minHeap.peek());
        System.out.println(maxHeap.peek());
        System.out.println(GetMedian());
    }
}
