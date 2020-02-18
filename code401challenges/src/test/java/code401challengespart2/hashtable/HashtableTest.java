package code401challengespart2.hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {
    @Test
    public void addTest(){
        Hashtable input = new Hashtable(4);
        input.add("anna", "mom");
        input.add("joey", "dad");
        input.add("raiden", "baby");
        input.add("melo", "dog");
        int actual = input.hashtable.length;
        assertEquals(4, actual);
    }

    @Test
    public void getTest() {
        Hashtable input = new Hashtable(5);
        input.add("anna", "mom");
        input.add("joey", "dad");
        input.add("raiden", "baby");
        input.add("melo", "dog");
        String actual = input.get("raiden");
        assertEquals("baby", actual);

    }

    @Test
    public void containsTest(){
        Hashtable input = new Hashtable(5);
        input.add("anna", "mom");
        input.add("joey", "dad");
        input.add("raiden", "baby");
        input.add("melo", "dog");
        boolean actual = input.contains("melo");
        assertTrue(actual);
    }



}