package code401challengespart2.graph;

import java.util.*;

/////// followed the code review during the class ///////

public class Graph<T, W> {
    private long size;
    private HashMap<T, LinkedList<Edge<T, W>>> GraphNodes;

    public Graph() {
        GraphNodes = new HashMap<>();
    }


    public T addNode(T value) {
        GraphNodes.put(value, new LinkedList<>());
        size++;
        return value;
    }

    public void addEdge(T firstNode, T secondValue) throws IllegalArgumentException {
        if(!GraphNodes.containsKey(firstNode) || !GraphNodes.containsKey(secondValue))
            throw new IllegalArgumentException("one of the node is not in the graph");

        GraphNodes.get(firstNode).add(new Edge<T, W>(secondValue));
        GraphNodes.get(secondValue).add(new Edge<T, W>(firstNode));
    }

    public void addEdge(T firstNode, T secondValue, W weight) throws IllegalArgumentException {
        if(!GraphNodes.containsKey(firstNode) || !GraphNodes.containsKey(secondValue))
            throw new IllegalArgumentException("One of node is not in the graph.");

        GraphNodes.get(firstNode).add(new Edge<T, W>(secondValue, weight));
        GraphNodes.get(secondValue).add(new Edge<T, W>(firstNode, weight));
    }

    public HashSet<T> getNodes() {
        return new HashSet<>(GraphNodes.keySet());
    }

    public LinkedList<Edge<T, W>> getNeighbors(T node)throws IllegalArgumentException {
        if(!GraphNodes.containsKey(node))
            throw new IllegalArgumentException("it's not in the graph");

        return GraphNodes.get(node);
    }

    public long getSize() {
        return size; }
}



