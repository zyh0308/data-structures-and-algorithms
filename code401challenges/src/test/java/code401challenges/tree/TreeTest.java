package code401challenges.tree;

import code401challenges.BinarySearch;
import com.sun.source.tree.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

    @Test
    public void treeTest() {
        Node<Integer> root = new Node<>(10, new Node<>(20), new Node<>(3));
        Tree<Integer> t = new Tree<>(root);
        assertEquals((Integer) 10, t.root.value);
        assertEquals((Integer)20, t.root.left.value);
        assertEquals((Integer)3, t.root.right.value);

    }


    @Test
    public void traversalsPreOrder() {

        Node<Integer> root = new Node<>(10, new Node<>(20), new Node<>(3));
        Tree<Integer> t = new Tree<>(root);
        t.traversalsPreOrder();

    }

    @Test
    public void traversalsPostOrder() {

        Node<Integer> root = new Node<>(10, new Node<>(20), new Node<>(3));
        Tree<Integer> t = new Tree<>(root);
        t.traversalsPostOrder();


    }

    @Test
    public void traversalsInOrder() {

        Node<Integer> root = new Node<>(10, new Node<>(20), new Node<>(3));
        Tree<Integer> t = new Tree<>(root);
        t.traversalsInOrder();
    }

    @Test
    public void breadthFirstTest(){
        Node<String> root =new Node<>("A", new Node<>("B", new Node<> ("D"),new Node<>("E")), new Node<>("C",null,new Node<>("F")));
        Tree<String> t =new Tree<>(root);
       String[] expected=new String[]{"A","B","C","D","E","F"};
       assertArrayEquals(expected,t.breadthFirst().toArray());
    }



    //           2
    //     7           5
    // 2       6             9
    //      5     11       4


    @Test
    public void findMax() {
        Node<Integer> root = new Node<> (2);
        Tree<Integer> t=new Tree<> (root);
        assertEquals(2,t.findMax());

    }

    @Test
    public void findMaxTestTwo(){
        Node<Integer> root =new Node<>(2,new Node<>(7, new Node<>(2),new Node<>(6,new Node<>(5),new Node<>(11))),new Node<>(5,null,new Node<>(9,new Node<>(4),null)));
        Tree<Integer> t=new Tree<> (root);
        assertEquals(11,t.findMax());

    }
}

