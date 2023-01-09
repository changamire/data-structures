package list;

public class Node {

    Node next;
    int data;

    public Node(int d) {
        data= d;
    }

    void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public String toString(String result) {
        result = result + data;
        if (next == null) {
            return result;
        } else {
            return next.toString(result);
        }
    }

    public static void main (String args[]) {
        Node n = new Node(3);
        n.appendToTail(5);
        n.appendToTail(8);

        System.out.println(n.toString(""));


    }

}