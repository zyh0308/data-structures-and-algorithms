package code401challenges.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Tree<E>{

    Node<E> root;

    public Tree(Node<E> root) {
        this.root = root;

    }

    //empty tree
    public Tree() {
        this.root = null;
    }


    //Pre Order

    public ArrayList<Integer> traversalsPreOrder() {
        ArrayList<Integer> result = new ArrayList<>();
        return traversalsPostOrder(this.root, result);
    }

    private ArrayList<Integer> traversalsPreOrder(Node<E> node, ArrayList<Integer> result) {
        if (node == null) {
            return result;
        } else {
            result.add((Integer) node.value);
            traversalsPreOrder(node.left, result);
            traversalsPreOrder(node.right, result);
        }

        return result;
    }

    //post order

    public ArrayList<Integer> traversalsPostOrder() {
        ArrayList<Integer> result = new ArrayList<>();
        return traversalsPostOrder(this.root, result);
    }

    private ArrayList<Integer> traversalsPostOrder(Node<E> node, ArrayList<Integer> result) {
        if (node == null) {
            return result;
        } else {
            traversalsPostOrder(node.left, result);
            traversalsPostOrder(node.right, result);
            result.add((Integer) node.value);
        }
        return result;
    }

    //in order
    public ArrayList<Integer> traversalsInOrder() {
        ArrayList<Integer> result = new ArrayList<>();
        return traversalsInOrder(this.root, result);
    }

    private ArrayList<Integer> traversalsInOrder(Node<E> node, ArrayList<Integer> result) {
        if (node == null) {
            return result;
        } else {
            traversalsInOrder(node.left, result);
            result.add((Integer) node.value);
            traversalsInOrder(node.right, result);
        }
        return result;
    }


    //Breadth-first

    public ArrayList<E> breadthFirst() {
        ArrayList<E> list=new ArrayList<>();

        Queue<Node<E>> queue = new LinkedList<>();
        if (this.root != null) {
            queue.add(this.root);
        }

        while (!queue.isEmpty()) {
            Node<E> temp= queue.poll();
            list.add(temp.value);
            if (temp.left != null) {
                queue.add(temp.left);
            }

            if (temp.right != null) {
                queue.add(temp.right);
            }

        }

        return list;


    }

}