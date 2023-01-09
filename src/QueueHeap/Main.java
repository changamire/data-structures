package QueueHeap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main (String args[]) {


        Queue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(20);
        minHeap.add(15);
        minHeap.add(2);
        minHeap.add(30);
        minHeap.add(55);

        System.out.println(minHeap.peek());

        Queue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 == o2) {
                    return 0;
                } else {
                    if (o1 > o2) {
                        return -1;
                    }
                }
                return 1;
            }
        });

        maxHeap.add(20);
        maxHeap.add(15);
        maxHeap.add(2);
        maxHeap.add(30);
        maxHeap.add(55);

        System.out.println(maxHeap.peek());


        System.out.println();
    }

    public int num_ways(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return num_ways(n-1) + num_ways(n-2);
        }
    }
}
