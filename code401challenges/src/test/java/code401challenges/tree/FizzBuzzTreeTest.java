package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    FizzBuzzTree fb;

    @Before
    public void constructorSetUp(){
        Node<String> root = new Node<>("5", new Node<String>("15"), new Node<String>("7", new Node<String>("9"), new Node<String>("10")));
        fb = new FizzBuzzTree(root);

        //        5
        //    15      7
        //         9     10


    }

    @Test
    public void fizzBuzzRootTest(){
        fb.fizzBuzzTree();
        assertEquals("Buzz",fb.root.value);
    }

    @Test
    public void fizzBuzzOneTest(){
        fb.fizzBuzzTree();
        assertEquals("FizzBuzz",fb.root.left.value);
    }

    @Test
    public void fizzBuzzTwoTest(){
        fb.fizzBuzzTree();
        assertEquals("7",fb.root.right.value);
    }

    @Test
    public void fizzBuzzThreeTest(){
        fb.fizzBuzzTree();
        assertEquals("Fizz",fb.root.right.left.value);
    }

    @Test
    public void fizzBuzzFourTest(){
        fb.fizzBuzzTree();
        assertEquals("Buzz",fb.root.right.right.value);
    }





}