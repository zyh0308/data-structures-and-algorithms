package code401challengespart2.graph;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

    Graph<String, Integer> twitters;
    Graph<Integer, Integer> gasStation;

    @Before
    public void setUp() throws Exception {
        twitters = new Graph<>();
        twitters.addNode("Anna");
        twitters.addNode("Joey");
        twitters.addEdge("Anna", "Joey", 1);
        twitters.addNode("Melo");
        twitters.addEdge("Anna", "Melo", 1);
        twitters.addNode("Lily");
        twitters.addEdge("Melo", "Lily", 1);
//        twitters.addEdge("Lily", "Anna", 1);
        twitters.addNode("Pete");
//        twitters.addEdge("Anna", "Pete", 2);
        twitters.addEdge("Pete", "Joey", 3);
        twitters.addNode("lucy");

        gasStation = new Graph<>();
        gasStation.addNode(10);
        gasStation.addNode(12);
        gasStation.addNode(13);
        gasStation.addNode(14);
        gasStation.addNode(15);
        gasStation.addNode(16);
        gasStation.addEdge(10, 12);
        gasStation.addEdge(12, 13);
        gasStation.addEdge(13, 14);
        gasStation.addEdge(14, 15);
        gasStation.addEdge(15, 10);
    }

    @Test
    public void sizeTest() {
        Assert.assertEquals(6, twitters.getSize());
        Assert.assertNotEquals(99, twitters.getSize());
        Assert.assertEquals(6, gasStation.getSize());
        Assert.assertNotEquals(99, gasStation.getSize());
    }

    @Test
    public void getNodesTest() {
        Assert.assertTrue(twitters.getNodes().contains("Anna"));
        Assert.assertFalse(twitters.getNodes().contains("----"));
        Assert.assertTrue(gasStation.getNodes().contains(12));
        Assert.assertFalse(gasStation.getNodes().contains(99));
    }

    @Test
    public void getNeighborsTest() {
        Assert.assertEquals("Joey", twitters.getNeighbors("Anna").get(0).getValue());
        Assert.assertEquals(0, twitters.getNeighbors("lucy").size());
        Assert.assertEquals((Integer) 12, gasStation.getNeighbors(10).get(0).getValue());
        Assert.assertEquals(6, gasStation.getNodes().size());
    }

    @Test
    public void breadthFirstTest() {
        Assert.assertEquals("Anna => Joey => Melo => Pete => Lily", twitters.breadthFirst("Anna").toString());

    }

    @Test
    public void depthFirstTest() {
        Assert.assertEquals("[Anna, Melo, Lily, Joey, Pete]", twitters.depthFirst("Anna").toString());

    }

}


