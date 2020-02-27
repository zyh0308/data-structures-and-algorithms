package code401challengespart2.graph;


import code401challenges.stackandqueues.Node;
import code401challenges.stackandqueues.Queue;
import code401challenges.stackandqueues.Stack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

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
        if (!GraphNodes.containsKey(firstNode) || !GraphNodes.containsKey(secondValue))
            throw new IllegalArgumentException("one of the node is not in the graph");

        GraphNodes.get(firstNode).add(new Edge<T, W>(secondValue));
        GraphNodes.get(secondValue).add(new Edge<T, W>(firstNode));
    }

    public void addEdge(T firstNode, T secondValue, W weight) throws IllegalArgumentException {
        if (!GraphNodes.containsKey(firstNode) || !GraphNodes.containsKey(secondValue))
            throw new IllegalArgumentException("One of node is not in the graph.");

        GraphNodes.get(firstNode).add(new Edge<T, W>(secondValue, weight));
        GraphNodes.get(secondValue).add(new Edge<T, W>(firstNode, weight));
    }

    public HashSet<T> getNodes() {

        return new HashSet<>(GraphNodes.keySet());
    }

    public LinkedList<Edge<T, W>> getNeighbors(T node) throws IllegalArgumentException {
        if (!GraphNodes.containsKey(node))
            throw new IllegalArgumentException("it's not in the graph");

        return GraphNodes.get(node);
    }

    //bread-first

    public Queue<T> breadthFirst(T node) throws IllegalArgumentException {
        if (!GraphNodes.containsKey(node))
            throw new IllegalArgumentException("The provided node is not in the graph");


        Queue<T> processNodes = new Queue<>();

        HashSet<T> nodesSeen = new HashSet<>();

        Queue<T> results = new Queue<>();

        nodesSeen.add(node);
        processNodes.enqueue(node);
        results.enqueue(node);

        while (!processNodes.isEmpty()) {
            LinkedList<Edge<T, W>> edges = GraphNodes.get(processNodes.dequeue());
            for (Edge<T, W> edge : edges) {
                if (!nodesSeen.contains(edge.getValue())) {
                    processNodes.enqueue(edge.getValue());
                    results.enqueue(edge.getValue());
                    nodesSeen.add(edge.getValue());
                }
            }
        }

        return results;
    }


    //depth-first traversal


    public LinkedList<String> depthFirst(T node) throws IllegalArgumentException {
        if (!GraphNodes.containsKey(node))
            throw new IllegalArgumentException("it's not in the graph");


        HashSet<T> nodeSeen = new HashSet<>();
        Stack<T> processNode = new Stack<>();
        LinkedList<String> result = new LinkedList<>();
        processNode.push(node);
        nodeSeen.add(node);

        while (!processNode.isEmpty()) {

            T temp = processNode.pop();
            LinkedList<Edge<T, W>> edges = GraphNodes.get(temp);


            for (Edge<T, W> edge : edges) {
                if (!nodeSeen.contains(edge.getValue())) {

                    processNode.push(edge.getValue());
                    nodeSeen.add(edge.getValue());
                }
            }
            result.add(temp.toString());

        }
        return result;

    }





    public long getSize() {
        return size; }
}



