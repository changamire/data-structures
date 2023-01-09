package stack;

public class Stack {
    class StackNode {
        int data;
        StackNode next;
        public StackNode(int data) {
            this.data = data;
        }
    }

    StackNode top;

    public int pop() {
        int d = top.data;
        top = top.next;
        return d;
    }

    public void push(int value) {
        StackNode t = new StackNode(value);
        t.next = top;
        top = t;
    }

    public int peek() {
        return top.data;
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(5);
        s.push(99);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
}
