package code401challenges.tree;

import java.util.ArrayList;

public class Tree<E> {

    Node<E> root;

    public Tree(Node<E> root){
        this.root=root;

    }

    //empty tree
    public Tree(){
        this.root=null;
    }


    //Pre Order

    public  ArrayList<Integer> traversalsPreOrder(){
        ArrayList<Integer> result = new ArrayList<>();
        return traversalsPostOrder(this.root, result);
    }
    private ArrayList<Integer> traversalsPreOrder(Node<E> node, ArrayList<Integer>result){
        if (node ==null) {
            return result;
        }else{
            result.add((Integer) node.value);
            traversalsPreOrder(node.left,result);
            traversalsPreOrder(node.right,result);
        }

        return result;
    }

    //post order

    public  ArrayList<Integer> traversalsPostOrder(){
        ArrayList<Integer> result = new ArrayList<>();
        return traversalsPostOrder(this.root, result);
    }
    private ArrayList<Integer> traversalsPostOrder(Node<E> node, ArrayList<Integer>result){
        if (node ==null) {
            return result;
        } else{
            traversalsPostOrder(node.left,result);
            traversalsPostOrder(node.right,result);
           result.add((Integer) node.value);
        }
        return result;
    }

    //in order
    public  ArrayList<Integer> traversalsInOrder(){
        ArrayList<Integer> result = new ArrayList<>();
        return traversalsInOrder(this.root, result);
    }
    private ArrayList<Integer> traversalsInOrder(Node<E> node, ArrayList<Integer>result){
        if (node ==null) {
            return result;
        }else{
            traversalsInOrder(node.left,result);
            result.add((Integer) node.value);
            traversalsInOrder(node.right,result);
        }
        return result;
    }

}

