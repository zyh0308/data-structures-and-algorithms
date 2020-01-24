package code401challenges.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test public void emptyListTest() {
        LinkedList list = new LinkedList();
        assertNull(list.head);
    }

    @Test public void insertToHeadTest() {

        LinkedList list = new LinkedList();
        list.insertToHead(2);
        assertEquals(2, list.head.data);

    }

    @Test public void verifyHead() {

        LinkedList list = new LinkedList();
        list.insertToHead(2);
        list.insertToHead(5);
        list.insertToHead(10);
        assertEquals(10, list.head.data);

    }

    @Test public void booleanValueSearch() {

        LinkedList list = new LinkedList();
        list.insertToHead(2);
        list.insertToHead(5);
        list.insertToHead(10);

        list.include(5);

        System.out.println(list.include(11));

        assertFalse("We do not have 11.",
                list.include(11));

        assertTrue("yeah! we have 10.",
                list.include(10));

    }
    @Test public void toStringTest() {

        LinkedList list = new LinkedList();
        list.insertToHead(2);
        list.insertToHead(5);
        list.insertToHead(10);

        String expectedAnswer = "{ 10 } => { 5 } => { 2 } => null";

        assertEquals("Contains nodes 10, 5, 2",
                expectedAnswer,
                list.toString());

    }


    //test for code challenge 6

    @Test public void appendTest(){
        LinkedList list =new LinkedList();
        list.insertToHead(2);
        list.insertToHead(5);
        list.insertToHead(10);
        list.append(25);
        LinkedList.Node current =list.head;
        while(current.next != null){
            current=current.next;

        }

        assertEquals(25,current.data);



    }

    @Test public void insertBeforeTest(){
        LinkedList list =new LinkedList();
        list.insertToHead(2);
        list.insertToHead(5);
        list.insertToHead(10);
        list.insertBefore(5,9999);
        int [] testArr= new int[]{10, 9999,5,2};
        LinkedList.Node current =list.head;
        int i=0;
        while (current!=null){
            assertEquals(testArr[i],current.data);
            i++;
            current=current.next;
        }


    }

    @Test(expected = IllegalArgumentException.class)
    public void insertBeforeExceptionTest(){
        LinkedList list =new LinkedList();
        list.insertToHead(2);
        list.insertToHead(5);
        list.insertToHead(10);
        list.insertBefore(111,9999);
    }


    @Test
    public void insertBeforeHeadTest(){
        LinkedList list =new LinkedList();
        list.insertToHead(2);
        list.insertToHead(5);
        list.insertToHead(10);
        list.insertBefore(10,9999);
        assertEquals(9999,list.head.data);
    }

    @Test
    public void insertAfterTest() {
        LinkedList list = new LinkedList();
        list.insertToHead(2);
        list.insertToHead(5);
        list.insertToHead(10);
        list.insertAfter(5, 9999);
        int[] testArr = new int[]{10, 5, 9999, 2};
        LinkedList.Node current = list.head;
        int i = 0;
        while (current != null) {
            assertEquals(testArr[i], current.data);
            i++;
            current = current.next;

        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertAfterExceptionTest(){
        LinkedList list =new LinkedList();
        list.insertToHead(2);
        list.insertToHead(5);
        list.insertToHead(10);
        list.insertBefore(111,9999);
    }






    //test for code challenge 7
    @Test public void lastListTest(){
        LinkedList list = new LinkedList();

        list.insertToHead(2);
        list.insertToHead(5);
        list.insertToHead(10);
        list.insertToHead(15);
        list.insertToHead(20);
        list.insertToHead(25);
        list.insertToHead(30);

        assertEquals(20, list.lastList(4));

    }
}


