package graph;

public class Node {
    int data;
    Node[] children;

    public Node(int data) {
        this.data = data;
        this.children = new Node[5];
    }
}