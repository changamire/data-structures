package graph;

public class Graph {



    Node[] nodes = new Node[10];

    public static void main (String args[]) {
//        Graph g = new Graph();
//
//        Node _0 = new Node(0);
//        Node _1 = new Node(1);
//        Node _2 = new Node(2);
//        Node _3 = new Node(3);
//        Node _4 = new Node(4);
//        Node _5 = new Node(5);
//        Node _6 = new Node(6);
//
//        _0.children[0] = _1;
//
//        g.nodes[0] = _0;

        GraphSearch gs = new GraphSearch();
        gs.addNode(1);
        gs.addNode(2);
        gs.addNode(3);
        gs.addNode(4);
        gs.addNode(5);

        gs.addEdge(1,2);
        gs.addEdge(2,3);
        gs.addEdge(3, 4);
        gs.addEdge(3, 5);

        System.out.println(gs.hasPathDFS(3,5));

        System.out.println(gs.hasPathBFS(5,3));

    }
}
