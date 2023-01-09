package queue;

public class Queue {
    class QueueNode {
        int data;
        QueueNode next;
        public QueueNode(int data) {
            this.data = data;
        }
    }

    QueueNode first;
    QueueNode last;

    public void add(int value) {
        QueueNode qn = new QueueNode(value);
        if (last!=null) last.next = qn;
        last = qn;
        if (first==null) first = last;
    }

    public int remove() {
        int d = first.data;
        first = first.next;
        return d;
    }

    public static void main (String args[]) {
        Queue q = new Queue();
        q.add(10);
        q.add(99);
        System.out.println(q.remove());
        q.add(5);
        q.add(7);

        System.out.println(q.remove());
        System.out.println(q.remove());

    }
}
