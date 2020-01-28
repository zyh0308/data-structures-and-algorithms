package code401challenges.tree;

public class BinarySearchTree {

    public Node addNode(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = addNode(current.left, value);
        } else if (value > current.value) {
            current.right = addNode(current.right, value);
        } else {
            return current;
        }
        return current;

    }


    public boolean containsNode(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (current.value == value) {
            return true;
        }  else if (current.value > value) {
            containsNode(current.left, value);
        } else if (current.value < value) {
            containsNode(current.right, value);
        }

        return false;

    }
}