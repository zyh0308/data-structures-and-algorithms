package code401challengespart2.graph;

import org.apache.commons.math3.geometry.spherical.twod.Edge;

public class Node<T> {

    private T vertex;

    private List<Edge<T>> edges;

    private Node<T> parent;

    private boolean isVisited;


}
