package course.DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graph {
    int numberOfNodes = 0;

    HashMap<Integer, ArrayList<Integer>> adjacentList = new HashMap<>();
    // adjList = { 0 : [1, 99], 1 : [44, 56] }
    // Where the key 0 is the node/vertex, and the array are the nodes it is connected to.
    public Graph() {
    }

    public void addVertex(int nodeId) {
        Vertex node = new Vertex(nodeId);
        ArrayList<Integer> adjNodes = new ArrayList<>();
        this.adjacentList.put(node.id, adjNodes);
        this.numberOfNodes++;
    }

    public void addEdge(int node1Id, int node2Id) {
        // Undirectional graph implementation (can travel bidirectional between nodes)
        // node1 & node2 will need a connection/reference to one another (so you can 'travel' back and forth)
        // node 3 -> node 2
        // node 2 -> node 3
        ArrayList<Integer> node1connList = this.adjacentList.get(node1Id);
        ArrayList<Integer> node2connList = this.adjacentList.get(node2Id);
        node1connList.add(node2Id);
        node2connList.add(node1Id);
    }

    public void showConnections() {
        // print
        for (Map.Entry<Integer, ArrayList<Integer>> entry : this.adjacentList.entrySet()) {
            Integer key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("Node: " + key + "-->" + value.toString());
        }
    }

}
