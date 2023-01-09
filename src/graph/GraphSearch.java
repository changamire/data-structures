package graph;

import java.util.*;

public class GraphSearch {

    class Node {
        private int id;
        List<Node> adjacent = new LinkedList<>();

        public Node(int id) {
            this.id = id;
        }

    }


    private Map<Integer, Node> nodeLookup = new HashMap<>();


    private Node getNode(int id){
        return nodeLookup.get(id);
    }

    public void addNode(int id) {
        Node n = new Node(id);
        nodeLookup.put(id, n);
    }

    public void addEdge(int source, int destination) {
        Node s = getNode(source);
        s.adjacent.add(getNode(destination));
    }

    public boolean hasPathDFS(int source, int destination) {
        Node s = getNode(source);
        Node d = getNode(destination);
        Set<Integer> visited = new HashSet<Integer>();
        return hasPathDFS(s, d, visited);
    }

    private boolean hasPathDFS(Node s, Node d, Set<Integer> visited) {
        if (visited.contains(s.id)) {
            return false;
        }
        visited.add(s.id);
        if (s == d) {
            return true;
        } else {
            for (Node c : s.adjacent) {
                if (hasPathDFS(c, d, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasPathBFS(int source, int destination) {
        Node s = getNode(source);
        Node d = getNode(destination);
        Set<Integer> visited = new HashSet<>();
        List<Node> nextToVisit = new LinkedList<>();
        nextToVisit.add(s);
        while (!nextToVisit.isEmpty()) {
           Node n = ((LinkedList<Node>) nextToVisit).remove();
           if (n == d) {
               return true;
           }
           if (visited.contains(n.id)) {
               continue;
           }
           visited.add(n.id);
           for (Node child : n.adjacent) {
               nextToVisit.add(child);
           }
        }
        return false;

    }



}
