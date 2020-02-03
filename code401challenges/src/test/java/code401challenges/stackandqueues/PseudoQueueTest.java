package code401challenges.stackandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {
    PseudoQueue stackOne;
    PseudoQueue stackTwo;


    @Test
    public void enqueueTest() {
        stackOne = new PseudoQueue();
        stackTwo = new PseudoQueue();
        stackOne.enqueue(1);
        stackOne.enqueue(2);
        stackOne.enqueue(3);
        stackOne.enqueue(4);
        assertEquals(4, stackOne.stackOne.peek());
    }

    @Test
    public void dequeueTest() {
        stackOne= new PseudoQueue();
        stackTwo = new PseudoQueue();
        stackOne.enqueue(10);
        stackOne.enqueue(25);
        stackOne.enqueue(35);
        int actual = stackOne.dequeue();
        assertEquals(10, actual);
    }
}

