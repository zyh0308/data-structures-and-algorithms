package code401challenges.tree;

import code401challenges.BinarySearch;
import com.sun.source.tree.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

    @Test
    public void treeTest() {
        Node root = new Node(10, new Node(20), new Node(3));
        Tree t = new Tree(root);
        assertEquals(10, t.root.value);
        assertEquals(20, t.root.left.value);
        assertEquals(3, t.root.right.value);

    }


    @Test
    public void traversalsPreOrder() {

        Node root = new Node(10, new Node(20), new Node(3));
        Tree t = new Tree(root);
        t.traversalsPreOrder();

    }

    @Test
    public void traversalsPostOrder() {

        Node root = new Node(10, new Node(20), new Node(3));
        Tree t = new Tree(root);
        t.traversalsPostOrder();


    }

    @Test
    public void traversalsInOrder() {

        Node root = new Node(10, new Node(20), new Node(3));
        Tree t = new Tree(root);
        t.traversalsInOrder();
    }
}

